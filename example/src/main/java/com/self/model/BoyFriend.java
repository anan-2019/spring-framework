package com.self.model;

/**
 * @Classname BoyFriend
 * @Date 2023/12/27 11:59
 * @Created by anan
 * @Description description here
 */
public class BoyFriend {
	String name;
	GirlFriend girlFriend;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GirlFriend getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}

	@Override
	public String toString() {
		return "BoyFriend{" +
				"name='" + name + '\'' +
				'}';
	}
}
