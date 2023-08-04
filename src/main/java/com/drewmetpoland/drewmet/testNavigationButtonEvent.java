package com.drewmetpoland.drewmet;

import org.springframework.context.ApplicationEvent;

public class testNavigationButtonEvent extends ApplicationEvent{
    private String message;
    
    public testNavigationButtonEvent(Object source, String message){
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
