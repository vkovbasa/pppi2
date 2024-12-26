package org.example.canteen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє замовлення у системі їдальні.
 *
 * @see OrderItem
 */
public class Order {

    private List<OrderItem> items = new ArrayList<>();

    /**
     * Додає позицію до замовлення.
     *
     * @param item Позиція замовлення.
     */
    public void addItem(OrderItem item) {
        items.add(item);
    }

    /**
     * Повертає загальну вартість замовлення.
     *
     * @return Загальна вартість замовлення.
     */
    public double getTotalAmount() {
        return items.stream()
                .mapToDouble(OrderItem::getTotalPrice)
                .sum();
    }

    /**
     * Повертає всі позиції замовлення.
     *
     * @return Список позицій.
     */
    public List<OrderItem> getItems() {
        return items;
    }
}
