package com.nik;

import java.util.List;

import org.hibernate.Session;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager10 {
	public static void main(String[] args) {
		Session session = Util.getSession();

		List<Student> std = session.createQuery("from Student where age>30 and fname like'%a%'").list();

		for (Student s2 : std) {
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
			System.out.println("----------");

		}
	}
}
