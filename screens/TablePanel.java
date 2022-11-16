package screens;

import frames.BarFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablePanel extends BasePanel implements ActionListener {


    public TablePanel(BarFrame frame) {
        super(frame);

        int buttonX = frame.getWidth() / 2 - 290; // 145 = (5*50+40) /2  290 = (5*100+80)/2
        int buttonY = frame.getHeight() / 2 - 160; // 100

        for (int i = 0; i < frame.dataProvider.tables.size(); i++) {
            Integer tableNumber = frame.dataProvider.tables.get(i);

            if ((i % 5 == 0) & (i > 4)) {
                buttonX = frame.getWidth() / 2 - 290; //145
                buttonY = frame.getHeight() / 2 - 40; //40 бутон минус разстояние
            }

            JButton tableButton = new JButton(Integer.toString(tableNumber));
            tableButton.addActionListener(this);
            tableButton.setBounds(buttonX, buttonY, 100, 100);
            add(tableButton);
            buttonX += 120; //60

        }

        // exitButton
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}