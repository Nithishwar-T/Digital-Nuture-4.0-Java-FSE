public class Main {
    public static void main(String[] args) {
       
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send();

        System.out.println("-----------------------");

       
        Notifier emailSms = new SMSNotifierDecorator(new EmailNotifier());
        emailSms.send();

        System.out.println("-----------------------");

        Notifier fullNotify = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                    new EmailNotifier()));
        fullNotify.send();
    }
}
