package vn.edu.iuh.fit.backEnd.configs;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import vn.edu.iuh.fit.backEnd.repositories.Connection;

@ApplicationPath("/api")
public class ApplicationConfigs extends Application {

    public ApplicationConfigs() {
        Connection.getInstance().getEntityManager();
    }
}
