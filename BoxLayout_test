import java.awt.*;

import javax.swing.Box;


public class BoxLayoutTest {
	
    public static void main(String args[]) {   	
    	
    	Frame frame = new Frame();
    	
    	//create a horizontal box container
    	Box hBox = Box.createHorizontalBox();
    	
    	//add two button in horizontal box container
    	hBox.add(new Button("Button 1"));
    	hBox.add(new Button("Button 2"));
    	
    	//create a vertital box container
    	Box vBox = Box.createVerticalBox();
    	//add two button in vertical box container
    	vBox.add(new Button("Button 3"));
    	vBox.add(new Button("Button 4"));
    	
    	//add two box into frame
    	frame.add(hBox, BorderLayout.NORTH);
    	frame.add(vBox);
    	
        frame.pack();
    	frame.setVisible(true);
    }
}
