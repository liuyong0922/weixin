package work.sajor.wechatpush;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import work.sajor.wechatpush.controller.PushController;
import work.sajor.wechatpush.service.Pusher;

@SpringBootTest
class WechatPushApplicationTests {

    @Autowired
    Pusher pusherService;
    /**
     * 要推送的用户openid
     */
    @Value("${target.openId}")
    private String target;
    @Value("${target.test.openId}")
    private String testTarget;


    @Test
    void contextLoads() {
    }

    @Test
    void testPush() {
        pusherService.push(target);
    }

    @Test
    void testPushTest() {
        pusherService.push(testTarget);
    }

}
