package g.dsa.hw6_21000691_doanducmanh.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockTradingAppGUI extends JFrame {
    private StockTradingSystem tradingSystem;
    private JTextField priceField;
    private JTextField orderTypeField;
    private JTextArea logArea;

    public StockTradingAppGUI() {
        tradingSystem = new StockTradingSystem();

        // Set up the main frame
        setTitle("Stock Trading App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create the input panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel priceLabel = new JLabel("Price:");
        priceField = new JTextField(10);
        JLabel orderTypeLabel = new JLabel("Order Type:");
        orderTypeField = new JTextField(10);
        JButton placeOrderButton = new JButton("Place Order");
        placeOrderButton.addActionListener(new PlaceOrderButtonListener());
        inputPanel.add(priceLabel);
        inputPanel.add(priceField);
        inputPanel.add(orderTypeLabel);
        inputPanel.add(orderTypeField);
        inputPanel.add(placeOrderButton);

        // Create the log panel
        JPanel logPanel = new JPanel(new BorderLayout());
        logArea = new JTextArea();
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);
        logPanel.add(scrollPane, BorderLayout.CENTER);

        // Add panels to the main frame
        add(inputPanel, BorderLayout.NORTH);
        add(logPanel, BorderLayout.CENTER);
    }

    private class PlaceOrderButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String priceStr = priceField.getText();
            String orderType = orderTypeField.getText();

            try {
                int price = Integer.parseInt(priceStr);
                tradingSystem.placeOrder(price, orderType);
                logArea.append("Placed order: " + orderType + " at " + price + " price.\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(StockTradingAppGUI.this, "Invalid price format.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            priceField.setText("");
            orderTypeField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StockTradingAppGUI app = new StockTradingAppGUI();
            app.setVisible(true);
        });
    }
}
