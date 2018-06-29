package cn.itsource.dubbo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProviderRun {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderRun.class)
                .web(false) // 非 Web 应用
                .run(args);
    }

}