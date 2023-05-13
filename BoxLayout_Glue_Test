import java.awt.*;

import javax.swing.Box;

public class BoxGlue {
	
    public static void main(String args[]) {   	
    	
    	Frame frame = new Frame();
    	
    	//create a horizontal box container
    	Box hBox = Box.createHorizontalBox();
    	
    	//add two button in horizontal box container
    	hBox.add(new Button("Button 1"));
    	hBox.add(Box.createHorizontalGlue());
    	hBox.add(new Button("Button 2"));
    	hBox.add(Box.createHorizontalStrut(30));
    	hBox.add(new Button("Button 3"));
    	
    	//create a vertical box container
    	Box vBox = Box.createVerticalBox();
    	
    	//add two button in vertical box container
    	vBox.add(new Button("Button 4"));
    	vBox.add(Box.createVerticalGlue());
    	vBox.add(new Button("Button 5"));
    	vBox.add(Box.createVerticalStrut(30));
    	vBox.add(new Button("Button 6"));
    	
    	//add two box into frame
    	frame.add(hBox, BorderLayout.NORTH);
    	frame.add(vBox);
    	
        frame.pack();
    	frame.setVisible(true);
    }
}
