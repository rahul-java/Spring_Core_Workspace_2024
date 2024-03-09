package com.mea.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat1")
public class CricketBat {

	public CricketBat() {

		System.out.println("CricketBat.CricketBat() :: 0-param-constructor");

	}

	public int scoreRuns() {

		return new Random().nextInt(200);
	}
}
