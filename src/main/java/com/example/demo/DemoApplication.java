package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws ParseException {
		System.out.println("commit c1 edit");
		System.out.println("commit c1v2");
		System.out.println("commit c2");
		System.out.println("commit c2 edit");
		System.out.println("commit c3 edit");
		System.out.println("commit c4");
		System.out.println("commit c5");
		System.out.println("commit c6");
		System.out.println("commit c7 edit");
		System.out.println("commit c8");
		System.out.println("commit c9");
		System.out.println("commit c12");

		SimpleDateFormat formatter = new SimpleDateFormat("yyMMddHHmmssZ");
//		Date d = formatter.parse("2001-07-04 12:08:56");
		Date date = new Date();
		String strDate = formatter.format(date);
		System.out.println("Hello World" + strDate.toString());
		System.out.println("------------------");

		function1();
		SpringApplication.run(DemoApplication.class, args);
	}
	public static void function1(){
//		List<String> lst1 = new ArrayList<>();
//		lst1.add("so1");lst1.add("so2");lst1.add("so3");lst1.add("so4");
//		IntStream.range(2, lst1.size()).forEach(i -> System.out.println(i));
//
//		lst1.forEach(i -> System.out.println(i));
//
//		System.out.println(OffsetDateTime.parse("2022-02-07T20:01:02Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME));
//		System.out.println(OffsetDateTime.parse("2020-07-07T04:41:53.274808+08:00",
//				DateTimeFormatter.ISO_OFFSET_DATE_TIME));
//		int i = 1;
//		if (i == 1) {
//			System.out.println("1");
//		}else if (i > 0) {
//			System.out.println(">0");
//		}else{
//			System.out.println("ne");
//		}
//		System.out.println(OffsetDateTime.now());
//		System.out.println(ZonedDateTime.now().toOffsetDateTime());
//		System.out.println(ZonedDateTime.now(ZoneOffset.UTC).toOffsetDateTime());
//		System.out.println(OffsetDateTime.now());
//		System.out.println(OffsetDateTime.parse("2022-03-08T03:01:24.620128700Z"));
//		long totalParkingTime = Duration.between(
//				OffsetDateTime.parse("2022-02-08T03:01:24.620128700Z"),
//				OffsetDateTime.now()).getSeconds();
//		System.out.println(totalParkingTime);
		
		List<Long> lst1 = new ArrayList<>();
		lst1.add(1L);lst1.add(2L);lst1.add(3L);
		List<Long> lst2 = new ArrayList<>();
		lst2.add(1L);lst2.add(2L);lst2.add(3L);
		List<Long> lst3 = new ArrayList<>();
		lst3.addAll(lst1);lst3.addAll(lst2);
		lst3.addAll(List.of(2L));
		System.out.println(lst3);

		List<Long> resultEmspIds = new ArrayList<>();

		resultEmspIds.addAll(List.of(2L));
		resultEmspIds.addAll(List.of(2L));
		System.out.println(resultEmspIds);
	}

}
