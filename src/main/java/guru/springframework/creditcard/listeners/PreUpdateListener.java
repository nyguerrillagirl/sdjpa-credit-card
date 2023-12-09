package guru.springframework.creditcard.listeners;

import guru.springframework.creditcard.services.EncryptionService;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.springframework.stereotype.Component;

@Component
public class PreUpdateListener extends AbstractEncryptionListener implements PreUpdateEventListener {
    public PreUpdateListener(EncryptionService encryptionService) {
        super(encryptionService);
    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent preUpdateEvent) {
        System.out.println("invoked onPreUpdate");
        this.encrypt(preUpdateEvent.getState(), preUpdateEvent.getPersister().getPropertyNames(), preUpdateEvent.getEntity());
        return false;
    }
}
