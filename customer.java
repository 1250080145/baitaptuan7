package baitaptuan7_bai2;

class customer extends person{
    private int balance;

    public customer(String name, String address, int balance) {
        super(name, address);
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void display(){
        System.out.println("name: "+getName());
        System.out.println("address: "+getAddress());
        System.out.println("balance: "+getBalance());
    }
}
