package EsercizioMiddleware1.EsMiddleware1.configuration;


import EsercizioMiddleware1.EsMiddleware1.Interceptors.ApiLoggingInterception;
import EsercizioMiddleware1.EsMiddleware1.Interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class ConfigInterception implements WebMvcConfigurer {


    @Autowired
    private ApiLoggingInterception apiLoggingInterception;

    @Autowired
    private LegacyInterceptor legacyInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterception);
        registry.addInterceptor(legacyInterceptor);
    }
}
