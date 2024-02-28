package src;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
       /* ApplianceDao applianceDao = new ApplianceDaoImpl(); // the implementation is the only way to get to the IngredientDao
        System.out.println("Inserting new Appliances");
        Appliance ap1 = new Appliance(1,"household","refrigerator","on", 60);
        Appliance ap2 = new Appliance(2,"household", "microwave", "off",15);
        Appliance ap3 = new Appliance(3,"household","Dishwasher","on", 45);


        ap1 =  ApplianceDao.insertAppliance(ap1);
        if(ap1 != null)  System.out.println("Refrigerator appliance inserted successfully.");
        System.out.println(ap1);


        ap2 = ApplianceDao.insertAppliance(ap2);
        if( ap2 != null ){
            System.out.println("Microwave appliance inserted successfully.");
        }

        ap3 = ApplianceDao.insertAppliance(ap3);
        if( ap3 != null ){
            System.out.println("Dish washer appliance inserted successfully.");
        }
        System.out.println("List all Appliances:");
        Set<Appliance> applianceSet = applianceDao.getAllAppliances();
        for (Appliance appliance: applianceSet) {
            System.out.println(appliance);
        }


        // Update an ingredient
        System.out.println("Update Regrigerator status");

        if ( ap1 != null ) ap1.setStatus("off");
        if(ApplianceDao.updateAppliance(ap1)){
            System.out.println("Refrigerator appliance status updated successfully!");
        }

        // Delete an ingredient
        System.out.println("Delete Microwave appliance");
        if ( ap2 != null ){
            if(ApplianceDao.deleteAppliance(ap2.getId())){
                System.out.println("microwave is deleted");
            }}

    }
*/

        ApplianceDao applianceDao = new ApplianceDaoImpl();

        System.out.println("List all Appliances:");
        Set<Appliance> applianceSet = applianceDao.getAllAppliances();
        for (Appliance appliance: applianceSet) {
            System.out.println(appliance);
        }

    }
}


