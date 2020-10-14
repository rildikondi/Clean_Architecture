package packagebylayer.detailed.interfaceadapters.gateway;

import java.util.Date;

//implemented by database
public interface UserGateway {

    void getLastNamesOfUsersWhoLoggedInAfter(Date date);
}
