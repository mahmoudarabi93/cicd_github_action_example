package com.arabi.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionApplication {

	/*echo "# cicd_github_action_example" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/mahmoudarabi93/cicd_github_action_example.git
	git push -u origin main*/



	@GetMapping("/")
	public String welcome(){

		return "Hello World!";


	}
	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionApplication.class, args);
	}

}
