package vn.scrip.buoi36_lab2;
public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);  // Khởi tạo với 1000
        // Giao dịch thành công
        try
        {
            System.out.println("👉 Số dư ban đầu: " + account.getBalance());
            account.deposit(500);
            account.withdraw(800);
            System.out.println("✅ Số dư sau giao dịch: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n-----------------------------\n");

        // Giao dịch thất bại
        try {
            System.out.println("👉 Số dư hiện tại: " + account.getBalance());
            account.withdraw(1000); // Rút quá số dư còn lại
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}



