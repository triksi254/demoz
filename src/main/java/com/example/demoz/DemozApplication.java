package com.example.demoz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.StringTokenizer;

@SpringBootApplication
public class DemozApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemozApplication.class, args);


		// using string.split()
		System.out.println("Hello guys, Today we learn about break text file into columns java using method split()");
		String str = " Hello guys : Today we learn about : break text file into columns java : using method split()";
		String[] arrOfStr = str.split(":");
		for (String a : arrOfStr)
			System.out.println(a);

		System.out.println("How are you doing today?");

		//using public String split(String regex, int limit)
		String string = "How are you doing today?";
		String split[] = string.split(" ", 0);
		for (String s : split)
			System.out.println(s);



		//using string tokenizer

		StringTokenizer st =
				new StringTokenizer("A StringTokenizer example");

		// get how many tokens are inside st object
		System.out.println("Tokens count: " + st.countTokens());

		// iterate st object to get more tokens from it
		while (st.hasMoreElements()) {
			String token = st.nextElement().toString();
			System.out.println("Token = " + token);

		}
	}

}
