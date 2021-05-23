package jk.pp.ms.members.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@ComponentScan(basePackages = { "jk.pp.ms.members.domain", "jk.pp.ms.members.dao", "jk.pp.ms.members.service" })
@EntityScan(basePackages = { "jk.pp.ms.members.domain" })
@EnableJpaRepositories(basePackages = { "jk.pp.ms.members.dao" })
@Import(value = { MSCommonGlobalConfig.class })
public class MembersWebMain {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MembersWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.MEMBERS));

		app.run(args);
	}

}
