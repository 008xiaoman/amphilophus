/**
* All rights Reserved, Designed By 008xiaoman@163.com
* @Title:  Application.java
* @Package pers.xuxm.amphilophus.registry.eureka
* @Description: 服务启动类
* @author: 许小满
* @date:   2019年2月13日 下午2:02:24
* @version 1.0.0
* @Copyright: 2019 008xiaoman@163.com. All rights reserved.
*/
package pers.xuxm.amphilophus.registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {
    
    /**
     * 服务启动入口
     * @param args 参数
     * @author 许小满
     * @date 2019年2月13日 下午2:45:12
     */
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
