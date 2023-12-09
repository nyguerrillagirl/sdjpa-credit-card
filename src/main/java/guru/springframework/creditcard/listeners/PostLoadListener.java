package guru.springframework.creditcard.listeners;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.springframework.stereotype.Component;

@Component
public class PostLoadListener implements PostLoadEventListener {
    @Override
    public void onPostLoad(PostLoadEvent postLoadEvent) {
        System.out.println("invoked onPostLoad.");
    }
}
