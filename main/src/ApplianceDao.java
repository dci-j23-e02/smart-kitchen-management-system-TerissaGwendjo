package src;
import java.util.Set;

public interface ApplianceDao {

    Appliance getAppliance(int applianceId);
    Set<Appliance> getAllAppliances();

    static Appliance insertAppliance(Appliance appliance) {
        return appliance;
    }

    //Appliance insertAppliance(Appliance appliance);

    static boolean updateAppliance(Appliance appliance) {
        return false;
    }

    static boolean deleteAppliance(int applianceId) {
        return false;
    }

}
