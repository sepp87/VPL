package jo.vpl.hub.math;

import jo.vpl.core.Hub;
import jo.vpl.core.VPLControl;
import javafx.scene.control.Label;
import jo.vpl.core.HubInfo;

/**
 *
 * @author JoostMeulenkamp
 */
@HubInfo(
	name = "Math.Pi",  
        category = "Math",
        description = "Pi",
	tags = {"math","pi"})
public class Pi extends Hub {

    public Pi(VPLControl hostCanvas) {
        super(hostCanvas);

        setName("Pi");

        addOutPortToHub("Value", double.class);        
        
        Label label = new Label("Pi");
        label.getStyleClass().add("hub-text");

        addControlToHub(label);

        outPorts.get(0).setData(Math.PI);
    }

    /**
     * Output Pi
     */
    @Override
    public void calculate() {
    }

    @Override
    public Hub clone() {
        Hub hub = new Pi(hostCanvas);
        return hub;
    }
}