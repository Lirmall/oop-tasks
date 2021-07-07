package oop.tasks.t12.product;

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.setLogin(login);
        this.setPassword(password);
        this.setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password.charAt(0) + "*****";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String userInfo() {
        return getLogin() + ", " + getEmail();
    }

    public String itemsInBasket(Basket basket) {
        return "You have" + basket.numberOfItems() + " items in your cart for $" + basket.purchaseAmount();
    }
}
