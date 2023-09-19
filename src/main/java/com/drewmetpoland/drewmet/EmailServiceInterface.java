package com.drewmetpoland.drewmet;

public interface EmailServiceInterface {
	void send(String from, String to, String title, String body);
}
