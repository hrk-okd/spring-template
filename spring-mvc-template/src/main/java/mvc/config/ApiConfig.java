package mvc.config;

import lombok.RequiredArgsConstructor;
import mvc.config.api.ApiConfigProperty;
import mvc.config.api.ApiSetting;
import mvc.config.api.QiitaApiSetting;
import mvc.config.api.YahooApiSetting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

/**
 * APIのコンフィグレーションです。
 */
@RequiredArgsConstructor
@Configuration
public class ApiConfig {

    /**
     * ファイルから読み込んだAPI設定です。
     */
    private final ApiConfigProperty apiConfigProperty;

    /**
     * QiitaのAPI設定です。
     *
     * @return {@link ApiSetting}のインスタンス
     */
    @NonNull
    @Bean
    @QiitaApiSetting
    ApiSetting qiitaApiSettings() {
        return apiConfigProperty.get("qiita");
    }


    /**
     * YahooのAPI設定です。
     *
     * @return {@link ApiSetting}のインスタンス
     */
    @NonNull
    @Bean
    @YahooApiSetting
    ApiSetting yahooApiSettings() {
        return apiConfigProperty.get("yahoo");
    }

}
