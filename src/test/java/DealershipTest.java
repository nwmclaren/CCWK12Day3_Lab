import Dealership.Dealership;
import Vehicles.Electric;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Electric electric;
    Dealership dealership;

    @Before
    public void setup(){
        electric = new Electric("Vauxhall","Mokka", "Black", "14,000");
        dealership = new Dealership("Jimmy's Cars");
        }

    @Test
    public void checkCarsInDealership(){
        dealership.addVehicle(electric);
        assertEquals(1, dealership.vehicleSize());
    }
}



