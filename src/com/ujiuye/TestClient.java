package com.ujiuye;

public class TestClient {

	public static void main(String[] args) {
		//��ʼ������
		Server server = new ServerService().getServerPort();
		
		//����getValue()����
		String name = server.getValue("С��");
		System.out.println("name" + name);
	}

}
