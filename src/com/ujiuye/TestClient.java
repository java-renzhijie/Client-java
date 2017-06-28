package com.ujiuye;

public class TestClient {

	public static void main(String[] args) {
		//初始化对象
		Server server = new ServerService().getServerPort();
		
		//调用getValue()方法
		String name = server.getValue("小明");
		System.out.println("name" + name);
	}

}
