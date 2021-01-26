# demo 服务

1. build
> docker build -t docker.xsy.io/app/sandbox-demo .
2. run
> docker run -d --name demo  --network host -ti docker.xsy.io/app/sandbox-demo


# jvm-sandbox安装

```
cd /opt/
unzip sandbox-stable-bin.zip 
cd sandbox
ps -ef  # 查看pid
./install-local.sh -p 1  #安装
cd bin
./sandbox.sh -p 1 #启动沙盒
ps -ef
cat ~/.sandbox.token 
netstat -apn | grep 35797
./sandbox.sh -p 1 -l #查看模块列表
http://localhost:43501/sandbox/default/module/http/sandbox-module-mgr/list?1=1 #web查看
http://localhost:43501/sandbox/default/module/http/sandbox-module-demo/addLog # load module

./sandbox.sh -p 1 -S #卸载

```
## wiki
https://github.com/alibaba/jvm-sandbox/wiki/INSTALL-and-CONFIG


## 示例
 mv sandbox-module-2.1.6.RELEASE-jar-with-dependencies.jar sandbox/sandbox-module
./sandbox.sh -p 1 -l #查看
./sandbox.sh -p 1 -F  # 刷新
./sandbox.sh -p 1 -d 'sandbox-module-demo/addLog' # 生效
./sandbox.sh -p 1 -S #卸载


# jvm-sandbox-repeater

## install 
> cd bin
> ./bootstrap.sh
## demo测试
#### 说明：
1. 默认是通过Javaagent方式启动的；
2. jvm-sandbox 默认加载了 repeater模块，默认支持 standalone工作模式，即（无需依赖任何服务端/存储，可以单机工作，提供录制/回放能力）；
3. traceId 规范：长度为32，endFlag 为 ed   格式：ip(去掉. 用0补全12位)+时间戳+id(10000~90000)+ed
4. standalone 模式下，数据是存储到LoadingCache 中的。
## 步骤：
0. 修改配置文件 repeater.properties
  
```repeater.properties
# 录制消息投递地址
broadcaster.record.url=http://127.0.0.1:8001/facade/api/record/save

# 回放结果投递地址
broadcaster.repeat.url=http://127.0.0.1:8001/facade/api/repeat/save

# 回放消息取数据地址
repeat.record.url=http://127.0.0.1:8001/facade/api/record/%s/%s

# 配置文件拉取地址
repeat.config.url=http://127.0.0.1:8001/facade/api/config/%s/%s
#repeat.config.url=http://127.0.0.1:8001/facade/api/config/repeater/daily

# 心跳上报配置
repeat.heartbeat.url=http://127.0.0.1:8001/module/report.json

# 是否开启脱机工作模式
repeat.standalone.mode=true

# 是否开启spring advice拦截
repeat.spring.advice.switch=true
```

1. 录制：
   > curl -s 'http://127.0.0.1:8001/regress/slogan?Repeat-TraceId=127000000001156034386424510000ed'
2. 回放：
   > curl -s 'http://127.0.0.1:8001/regress/slogan?Repeat-TraceId-X=127000000001156034386424510000ed'

4. 控制台 http://localhost:8001/regress/index.htm

