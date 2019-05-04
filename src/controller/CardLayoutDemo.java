package controller;

/*
 * CardLayoutDemo.java
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class CardLayoutDemo implements ItemListener 
{
    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "Card with JButtons";
    final static String TEXTPANEL = "Card with JTextField";
     
    public void addComponentToPane(Container pane) 
    {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel basePanel = new JPanel();
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        JButton firstButton = new JButton("first");
        JButton secondButton = new JButton("second");
        firstButton.addItemListener(this);
        secondButton.addItemListener(this);
        basePanel.add(firstButton);
        basePanel.add(secondButton);
         
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
         
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
         
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
         
        pane.add(cards, BorderLayout.CENTER);
        
        firstButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (cards.getLayout());
        		cl.show(cards, BUTTONPANEL);
        	}
        });
        
        secondButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (cards.getLayout());
        		cl.show(cards, TEXTPANEL);
        	}
        });
    }
    
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
