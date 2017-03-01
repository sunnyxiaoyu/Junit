package com.xiaoyu.junitText;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiaoyu.Junit.T;

public class TTest {

	@Test
	public void testAdd() {
	//	int z = new T().add(3,5);
        assertEquals(8, new T().add(3,5));
	}

}
