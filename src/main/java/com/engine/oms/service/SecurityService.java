package com.engine.oms.service;

public interface SecurityService {
	String findLoggedInUsername();

    void autoLogin(String username, String password);
}