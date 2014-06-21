package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		LocalDate birthday = LocalDate.of(1980, Month.JULY, 8);
		System.out.println(birthday);
		System.out.println(birthday.plusMonths(2));
		System.out.println(birthday.minusMonths(2));
		System.out.println(birthday.atStartOfDay());
		System.out.println(birthday.withDayOfMonth(1));
		System.out.println(LocalDate.parse("2014-01-01"));
		System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
