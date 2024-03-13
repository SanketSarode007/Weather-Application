import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelComePage extends JFrame{


    public WelComePage(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,650);
        setLocationRelativeTo(null);
        getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);
        setLayout(null);
        setResizable(false);
        addGuiComponent();

    }

    public void addGuiComponent(){
        JLabel heading = new JLabel("<html><b><center>Welcome to</center><br>Weather Application</br></b></html>");
        heading.setForeground(CommonConstants.TEXT_COLOR);
        heading.setFont(new Font("Dialog",Font.BOLD,32));
        heading.setBounds(0,25,420,200);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        add(heading);

        JButton btnDark = new JButton("<html><b>Dark Theme</b></html>");
        btnDark.setForeground(CommonConstants.SECONDARY_COLOR);
        btnDark.setBackground(CommonConstants.TEXT_COLOR);
        btnDark.setHorizontalAlignment(SwingConstants.CENTER);
        btnDark.setFont(new Font("Dialog",Font.BOLD,30));
        btnDark.setBounds(75,320,250,50);
        btnDark.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnDark);

        btnDark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WeatherAppGui weatherAppGui = new WeatherAppGui();
                dispose();
                weatherAppGui.setVisible(true);
            }
        });

        JButton btnLight = new JButton("<html><b>Light Theme</b></html>");
        btnLight.setForeground(CommonConstants.SECONDARY_COLOR);
        btnLight.setBackground(CommonConstants.TEXT_COLOR);
        btnLight.setFont(new Font("Dialog",Font.BOLD,30));
        btnLight.setBounds(75,520,250,50);
        btnLight.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnLight);

        btnLight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LightWeatherAppGui lightweatherAppGui = new LightWeatherAppGui();
                dispose();
                lightweatherAppGui.setVisible(true);
            }
        });



    }

}
