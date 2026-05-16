package com.mycompany.clock.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MyWindow extends JFrame {

    private JLabel titleLabel;
    private JLabel timeLabel;
    private JLabel dateLabel;
    private JLabel dayLabel;

    public MyWindow() {

        setTitle("Responsive Digital Clock");

        setSize(900, 500);

        setMinimumSize(new Dimension(400, 250));

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createGUI();

        startClock();

        setVisible(true);
    }

    public void createGUI() {

        Color background = new Color(10, 15, 35);

        Color titleColor = Color.WHITE;

        Color timeColor = new Color(0, 255, 180);

        Color dateColor = new Color(255, 200, 0);

        Color dayColor = new Color(120, 180, 255);

        titleLabel = new JLabel("DIGITAL CLOCK", SwingConstants.CENTER);

        timeLabel = new JLabel("", SwingConstants.CENTER);

        dateLabel = new JLabel("", SwingConstants.CENTER);

        dayLabel = new JLabel("", SwingConstants.CENTER);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout(20, 20));

        mainPanel.setBackground(background);

        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(30, 20, 30, 20)
        );

        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(background);

        centerPanel.setLayout(new BorderLayout());

        JPanel bottomPanel = new JPanel();

        bottomPanel.setBackground(background);

        bottomPanel.setLayout(new BorderLayout());

        titleLabel.setForeground(titleColor);

        timeLabel.setForeground(timeColor);

        dateLabel.setForeground(dateColor);

        dayLabel.setForeground(dayColor);

        centerPanel.add(timeLabel, BorderLayout.CENTER);

        bottomPanel.add(dateLabel, BorderLayout.NORTH);

        bottomPanel.add(dayLabel, BorderLayout.SOUTH);

        mainPanel.add(titleLabel, BorderLayout.NORTH);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public void startClock() {

        Timer timer = new Timer(1000, e -> {

            Date currentDate = new Date();

            SimpleDateFormat timeFormat =
                    new SimpleDateFormat("hh:mm:ss a");

            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("dd MMMM yyyy");

            SimpleDateFormat dayFormat =
                    new SimpleDateFormat("EEEE");

            timeLabel.setText(
                    timeFormat.format(currentDate)
            );

            dateLabel.setText(
                    dateFormat.format(currentDate)
            );

            dayLabel.setText(
                    dayFormat.format(currentDate)
            );

            int width = getWidth();

            int titleSize = width / 22;

            int timeSize = width / 12;

            int dateSize = width / 28;

            int daySize = width / 32;

            titleSize = Math.max(titleSize, 20);

            timeSize = Math.max(timeSize, 28);

            dateSize = Math.max(dateSize, 18);

            daySize = Math.max(daySize, 16);

            titleLabel.setFont(
                    new Font("Arial", Font.BOLD, titleSize)
            );

            timeLabel.setFont(
                    new Font("Verdana", Font.BOLD, timeSize)
            );

            dateLabel.setFont(
                    new Font("Tahoma", Font.BOLD, dateSize)
            );

            dayLabel.setFont(
                    new Font("Tahoma", Font.PLAIN, daySize)
            );

        });

        timer.start();
    }
}