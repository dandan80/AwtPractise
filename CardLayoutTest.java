import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest {
	
    public static void main(String args[]) {   	
    	
    	Frame frame = new Frame("Calculator");
    	
        Panel p1= new Panel();
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);
        
        String [] names ={"first","second","third","forth","fifth"};
        
        for(int i=0; i<names.length; i++) {
        	p1.add(names[i], new Button(names[i]));
        }
        
        frame.add(p1);
        
        Panel p2 = new Panel();
        Button b1=new Button("Previous");
        Button b2=new Button("Next");
        Button b3=new Button("First");
        Button b4=new Button("Last");
        Button b5=new Button("Third");
        
        ActionListener listener = new ActionListener() {   
        
        @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
        	String actionCommand = e.getActionCommand();
        	switch(actionCommand){
        		case "Previous":
        			cardLayout.previous(p1);
        			break;
        		case "Next":
        			cardLayout.next(p1);
        			break;
        		case "First":
        			cardLayout.first(p1);
        			break;
        		case "Last":
        			cardLayout.last(p1);
        			break;
        		case "Third":
        			cardLayout.show(p1, "third");
        			break;
			}
        }
        };
        
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        
        frame.add(p2, BorderLayout.SOUTH);
        frame.pack();
    	frame.setVisible(true);
    }
}
