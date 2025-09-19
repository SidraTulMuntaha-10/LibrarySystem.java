class LibraryUser {
    private int userId;
    private String name;
    private int booksBorrowed;

    public LibraryUser(int userId, String name, int booksBorrowed) {
        this.userId = userId;
        this.name = name;
        this.booksBorrowed = booksBorrowed;
    }
  
    public LibraryUser(int userId, String name) {
        this(userId, name, 0);
    }

    public String getName() {
        return name;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        int[][] borrowHistory = {
            {2, 1, 0, 1, 0},
            {3, 2, 1, 2, 3},
            {1, 0, 1, 0, 0}
        };

        String[] userNames = {"Alice", "Bob", "Charlie"};

        int borrowingLimit = 10;

        for (int i = 0; i < borrowHistory.length; i++) {
            int total = 0;
            for (int j = 0; j < borrowHistory[i].length; j++) {
                total += borrowHistory[i][j];
            }

            System.out.println("User: " + userNames[i] + ", Total Books Borrowed: " + total);

            if (total < borrowingLimit) {
                System.out.println(userNames[i] + " can borrow more books.");
            } else {
                System.out.println(userNames[i] + " has reached the borrowing limit.");
            }
            System.out.println();
        }
    }
}
