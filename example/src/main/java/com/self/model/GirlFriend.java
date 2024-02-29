package com.self.model;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname GirlFriend
 * @Date 2023/12/27 11:59
 * @Created by anan
 * @Description description here
 */
public class GirlFriend {
	String name;
	BoyFriend boyFriend;

	public GirlFriend() {
	}

	public GirlFriend(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BoyFriend getBoyFriend() {
		return boyFriend;
	}

	public void setBoyFriend(BoyFriend boyFriend) {
		this.boyFriend = boyFriend;
	}

	@Override
	public String toString() {
		return "GirlFriend{" +
				"name='" + name + '\'' +
				'}';
	}
}
