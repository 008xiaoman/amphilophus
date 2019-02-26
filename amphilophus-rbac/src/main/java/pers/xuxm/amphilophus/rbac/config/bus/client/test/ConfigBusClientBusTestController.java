/**
* All rights Reserved, Designed By 008xiaoman@163.com
* @Title:  ConfigBusClientBusTestController.java
* @Package pers.xuxm.amphilophus.rbac.config.bus.client.test
* @Description: 测试类
* @author: 许小满
* @date:   2019年2月15日 上午11:38:54
* @version V1.0
* @Copyright: 2019 008xiaoman@163.com. All rights reserved.
*/
package pers.xuxm.amphilophus.rbac.config.bus.client.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigBusClientBusTestController {

    /** 日志 */
    //private static final Logger LOG = LoggerFactory.getLogger(ConfigBusClientBusTestController.class);
    
    /** 本地变量 */
    @Value("${local.variable}")
    private String localVariable;
    
    @GetMapping("/local/variable")
    public String getLocalVariable() {
        return this.localVariable;
    }
    
}
