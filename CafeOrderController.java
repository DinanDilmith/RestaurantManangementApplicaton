import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CafeOrderController {

    @FXML
    private ListView<String> menuListView;

    @FXML
    private TextField quantityField;

    @FXML
    private Label totalBillLabel;

    private ObservableList<String> menuItems;

    public void initialize() {
        // Initialize the menu items
        menuItems = FXCollections.observableArrayList(
                "Coffee - $2.50",
                "Tea - $1.50",
                "Sandwich - $5.50",
                "Cake - $3.75"
        );
        menuListView.setItems(menuItems);
    }

    @FXML
    public void addToOrder() {
        String selectedItem = menuListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            try {
                int quantity = Integer.parseInt(quantityField.getText());
                double price = getPrice(selectedItem);
                double totalBill = price * quantity;
                totalBillLabel.setText(String.format("$%.2f", totalBill));
            } catch (NumberFormatException e) {
                totalBillLabel.setText("Invalid quantity");
            }
        }
    }

    @FXML
    public void placeOrder() {
        // TODO: Implement order placement logic
        totalBillLabel.setText("Order placed!");
    }

    private double getPrice(String menuItem) {
        String[] parts = menuItem.split(" - ");
        return Double.parseDouble(parts[1].substring(1));
    }
}
