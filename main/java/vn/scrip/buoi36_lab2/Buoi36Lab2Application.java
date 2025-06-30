////Mục tiêu:
////Tạo chương trình mô phỏng tài khoản ngân hàng. Nếu người dùng rút tiền vượt quá số dư, chương trình ném ra một ngoại lệ InsufficientFundsException do bạn tự định nghĩa.
////
////Yêu cầu:
////Tạo lớp BankAccount có:
////Thuộc tính: balance
//
////Phương thức: deposit(double amount), withdraw(double amount)
////Nếu rút vượt số dư, ném ra InsufficientFundsException
////
////Viết chương trình chính mô phỏng 2 trường hợp:
////Giao dịch thành công
////Giao dịch thất bại (số dư không đủ)
////Gợi ý code:
////Tạo class ngoại lệ tự định nghĩa
////public class InsufficientFundsException extends Exception {
//
////    public InsufficientFundsException(String message) {
////        super(message);
////    }
////}
////Tạo class BankAccount
////public class BankAccount {
////    private double balance;
////    public BankAccount(double initialBalance) {
////        this.balance = initialBalance;
////    }
////    public void deposit(double amount) {
////        balance += amount;
////        System.out.println("Nạp tiền thành công: " + amount); }
////    public void withdraw(double amount) throws InsufficientFundsException {
////        if (amount > balance) {
////            throw new InsufficientFundsException("Số dư không đủ để rút: " + amount);
////        }
////        balance -= amount;
////        System.out.println("Rút tiền thành công: " + amount);
////    }
////    public double getBalance() {
////        return balance;
////    }
////}
////Lưu ý: Có thể các loại công cụ AI hỗ trợ.
package vn.scrip.buoi36_lab2;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class Buoi36Lab2Application {
	public static void main(String[] args) {
		// Chạy code mô phỏng tài khoản ngân hàng
		BankSimulation.main(args);
	}
}





