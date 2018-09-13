package liar.xiaoyu.www;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liar.xiaoyu.www.dao","liar.xiaoyu.www.service.serviceimpl","liar.xiaoyu.www.controller"})
public class StartSpringBoot {
    public static void main(String args[]){
        SpringApplication.run(StartSpringBoot.class,args);
    }
}
