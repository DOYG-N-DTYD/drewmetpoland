package com.drewmetpoland.drewmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class testNavigationButtonPublisher {
    @Autowired
    private ApplicationEventPublisher navigationButtonPublisher;

    public void publishNavigationButtonEvent(final String message) {
        System.out.println("PUBLISHING CUSTOM EVENT " + message);
        testNavigationButtonEvent navigationButtonEvent = new testNavigationButtonEvent(this, message);
        navigationButtonPublisher.publishEvent(navigationButtonEvent);
    }
}
