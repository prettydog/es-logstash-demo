package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.model.Job;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.JobRepository;
import com.example.demo.service.BookService;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ElasticsearchOperations es;

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private JobRepository jobRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		printElasticSearchInfo();

		List<String> list = Arrays.asList("gzz6959","gzz55","gzz99","gzz251","gzz666","gzz34","gzz753","gzz5624","gzz6666","gzz4434","gzz2343","gzz343");

		//Iterable<Book> books2 = bookRepository.findByAuthorIn(list);
		//Iterable<Job> books2 = jobRepository.findAll();
		Job job = jobRepository.findOne("8488");
		System.out.println("<----------------------------------->");
		System.out.println(job);
		//List<Job> list1 = new ArrayList<>();
		/*books2.forEach(x -> {
			list1.add(x);
			System.out.println(x);
		});*/
		//System.out.println(list1.size());
		//List<Book> books = bookService.findByTitle("Elasticsearch Basics");

	}

	//useful for debug, print elastic search details
	private void printElasticSearchInfo() {

		System.out.println("--ElasticSearch--");
		Client client = es.getClient();
		Map<String, String> asMap = client.settings().getAsMap();

		asMap.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
		System.out.println("--ElasticSearch--");
	}
}
