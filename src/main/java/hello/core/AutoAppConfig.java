package hello.core;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan( // Spring bean을 전체를 scan하기 위해
        basePackages = "hello.core.member", // hello.core.member 패키지만 등록
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

}