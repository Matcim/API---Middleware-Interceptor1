package EsercizioMiddleware1.EsMiddleware1.Interceptors;


import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApiLoggingInterception implements HandlerInterceptor {

        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            System.out.println(" CHIAMATA URL " + request.getRequestURI() + ":: START TIME " + System.currentTimeMillis());
        return true;
        }

        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
            System.out.println(" CHIAMATA URL " + request.getRequestURI() + ":: richiesta andata a buon fine");
        }

        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        }
    }
