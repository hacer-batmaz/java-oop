public class PayPal implements IOdeme {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void odemeYap() {
        System.out.println("Ödeme PayPal ile yapılıyor. Email: " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}