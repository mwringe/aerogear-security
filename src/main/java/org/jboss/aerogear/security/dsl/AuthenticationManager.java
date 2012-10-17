package org.jboss.aerogear.security.dsl;

import org.jboss.aerogear.security.model.AeroGearUser;
import org.picketlink.credential.Credential;

public interface AuthenticationManager {

    boolean login(AeroGearUser user);

    void logout();
}
