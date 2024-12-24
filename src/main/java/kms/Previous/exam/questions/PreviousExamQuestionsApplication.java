package kms.Previous.exam.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.Random;

@SpringBootApplication
public class PreviousExamQuestionsApplication {

	private static final Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(PreviousExamQuestionsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			DandyNumber dandyNumber = new DandyNumber();


			for (int i = 0; i < 5; i++) {
				String testCase = generateRandomTestCase();
				int result = dandyNumber.solution(testCase);
				System.out.println("입력: s = \"" + testCase + "\"");
				System.out.println("출력: " + result);
				System.out.println();
			}
		};
	}

	private static String generateRandomTestCase() {
		int length = random.nextInt(20) + 1;
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}
}
