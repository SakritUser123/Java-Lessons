class LogicalOperator {
    public static void main(String[] args) {
        boolean isLoggedin = true;
        boolean isAdmin = false;
        System.out.println("Regular user: " + (isLoggedin && !isAdmin));
        System.out.println("Has access: " + (isLoggedin || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedin));
    }
}
