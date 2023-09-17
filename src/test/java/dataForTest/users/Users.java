package dataForTest.users;

public enum Users {

    PLOTNIKOVA_A(new User("plotnikova_a", "1"));

    private User user;

    Users(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLogin() {
        return this.user.getLogin();
    }

    public String getPassword() {
        return this.user.getPassword();
    }
}
