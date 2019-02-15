模块划分  
amphilophus-common：公共代码  
   包：pers.xuxm.amphilophus.common  

amphilophus-registry：服务注册与发现  
   amphilophus-registry-eureka：服务注册与发现（eureka），端口：8761  
      包：pers.xuxm.amphilophus.registry.eureka  

amphilophus-gateway：网关  
   amphilophus-gateway-zuul：网关(zuul)，端口：8080  
      包：pers.xuxm.amphilophus.gateway.zuul  

amphilophus-config：配置中心  
   amphilophus-config-server：配置-服务端  
      包：pers.xuxm.amphilophus.config.server，端口：8081  

amphilophus-rbac：基于角色的访问控制(Role-Based Access Control)，  
                                用户、账号、权限，端口：9090  
   包：pers.xuxm.amphilophus.rbac  
