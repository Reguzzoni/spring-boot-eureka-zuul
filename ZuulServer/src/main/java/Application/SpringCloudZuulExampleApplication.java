package Application;

import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringCloudZuulExampleApplication {

    public static void main(String[] args) throws MalformedURLException {

//        Object[] sources = {SpringCloudZuulExampleApplication.class, new UrlResource(new URL("file:C:/dev/abc_dynamic.groovy"))};
//        Object[] sources = {SpringCloudZuulExampleApplication.class, new ClassPathResource("groovy/ExampleSurgicalDebugFilterBean.groovy")};
//        SpringApplication.run(sources, args);
    	
    	SpringApplication.run(SpringCloudZuulExampleApplication.class, args);

    }

}
