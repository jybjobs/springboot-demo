# springboot
springboot demo

## spring mvc 
## spring data rest
spring boot 对spring-data-rest进行了自动配置，
所以在springboot中使用 spring-data-rest，只需要引入
spring-boot-starter-data-rest的依赖，无需其他配置。

## spring boot redis cache

声明式缓存配置：
      @Cacheable  查询缓存有直接返回  没有添加到缓存并返回
      @CachePut    添加数据到缓存
      @CacheEvict  从缓存中删除
      @Caching     组合多个策略
