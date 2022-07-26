package com.example.demoz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


@SpringBootApplication
public class DemozApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemozApplication.class, args);
		{
			File resource = new ClassPathResource(
					"myText.txt").getFile();
			Scanner file=new Scanner(resource);
			String[] split=file.nextLine().split(",");
			for (String a : split)
				//After splitting file columns using the ',' character
				System.out.println(a);
		}

//		//Creating a List
//		List<String> list=new ArrayList<String>();
//		//Adding elements in the List
//		list.add("Mango");
//		list.add("Apple");
//		list.add("Banana");
//		list.add("Grapes");
//		//Iterating the List element using for-each loop
//		for(String fruit:list)
//			System.out.println(fruit);


	// using string.split()
		//Hello guys, Today we learn about break text file into columns java using method split()
		String str = " Hello guys : Today we learn about : break text file into columns java : using method split()";
		String[] arrOfStr = str.split(":");
		for (String a : arrOfStr)
			System.out.println(a);



		//using public String split(String regex, int limit)
		//How are you doing today?")
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

