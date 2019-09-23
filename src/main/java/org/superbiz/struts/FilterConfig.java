package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class FilterConfig
{
    @Bean
    public FilterRegistrationBean siteMeshFilterRegistrationBean()
    {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SiteMeshFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean strutsPrepareAndExecuteFilterRegistrationBean()
    {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new StrutsPrepareAndExecuteFilter());
        String[] array = {"/","/addUserForm.action","/addUser.action","/findUserForm.action","/findUser.action","/listAllUsers.action"};
        registrationBean.addUrlPatterns(array);
        registrationBean.setOrder(2);
        return registrationBean;
    }
}