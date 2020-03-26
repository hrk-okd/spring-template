package mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.client.RestTemplate;

/**
 * コンフィグレーションです。
 */
@Configuration
public class ApplicationConfig {

    /**
     * {@link RestTemplate}を生成します。
     *
     * @return {@link RestTemplate}のインスタンス
     */
    @NonNull
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
