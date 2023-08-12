package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());
//    Slf4j 어노테이션이 위의 작업을 처리해줌
    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

//        sout 은 log 수준과 상관없이 출력되므로 사용을 지양해야 한다. 꼭 log 써야한다
//        또한 log는 파일이나 네트워크 등, 로그를 별도의 위치에 남길 수 있다. 성능도 굿
//        System.out.println("name = " + name);
//        log.trace("trace log=" + name);
//        위, 아래의 차이 ? java의 동작방식 차이!! {}를 안쓰면 연산이 먼저 일어나서
//        log.trace("trace log= Spring") 이 된 후 사용하지 않으므로 버려짐
//        즉, 필요없는 연산이 일어난다, 혼난다
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
