class User {
    private String username;
    private boolean authenticated;

    public User(String username, boolean authenticated){
        this.username = username;
        this.authenticated = authenticated;

    }
    public boolean isAuthenticated(){
        return authenticated;
    }
}
