public class CustomerService {
    private CustomerRepository customerRepo;

    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void getCustomerDetails(String id) {
        String customer = customerRepo.findCustomerById(id);
        System.out.println("Service Layer: Fetched " + customer);
    }
}
