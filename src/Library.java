import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, Item> items;

    public Library() {
        items = new HashMap<>();
        loadItems();
    }

    private void loadItems() {
        items.put("1", new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        items.put("2", new Book("To Kill a Mockingbird", "Harper Lee"));
        items.put("3", new AudioBook("The Hobbit", "J.R.R. Tolkien"));
        items.put("4", new AudioBook("1984", "George Orwell"));
    }

    public void displayAvailableItems(String itemType) {
        System.out.println("Available Items:");
        for (Item item : items.values()) {
            if (!item.isRented() && item.getType().equalsIgnoreCase(itemType)) {
                System.out.println(item);
            }
        }
    }

    public void rentItem(String id) {
        Item item = items.get(id);
        if (item != null) {
            if (!item.isRented()) {
                item.rent();
                System.out.println("You have rented: " + item.getTitle());
            } else {
                System.out.println("Sorry, this item is already rented.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    public void returnItem(String id) {
        Item item = items.get(id);
        if (item != null) {
            if (item.isRented()) {
                item.returnItem();
                System.out.println("You have returned: " + item.getTitle());
            } else {
                System.out.println("This item was not rented.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }
}

