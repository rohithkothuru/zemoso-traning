/*
* S - Single Responsibility Principle - A class should have one and only one reason to change.
* O - Open Closed Principle- Objects or entities should be open for extensions but closed for modification
 */
package solid;
class AccountService{
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount(){
        System.out.println("fill account internal details");
        repository.create();
        notificationService.sendNotification();
    }
}
class AccountRepository{
    public void create(){
        System.out.println("store account object in database");
    }
}
class NotificationService{
    public void sendNotification(){
        System.out.println("send out welcome message");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        service.openAccount();
    }
}
