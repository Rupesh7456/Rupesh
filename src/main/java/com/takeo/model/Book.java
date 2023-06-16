package com.takeo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Book {
	@Entity
	@Getter
	@Setter
	@Table(name="BOOK")
	@AllArgsConstructor
	@NoArgsConstructor
	public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

		private String bid;
		private String btitle;
		private String author;
		private int pYear;
		private long isbn;
	}
}
