import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class droppoint{
    public class Customer{
        private String FIO;
        private String tel;
        private String date;
        private String address;

        public Customer(String FIO, String tel, String date, String address){
            this.FIO = FIO;
            this.tel = tel;
            this.date = date;
            this.address = address;
        }
            public String getFIO(){
                return FIO;
            }
            public String getTel(){
                return tel;
            }
            public String getDate(){
                return date;
            }
            public String getAddress(){
                return address;
            }
        }
        public class Order{
        private int price;
        private int order_id;

        public Order(int price, int order_id){
            this.price = price;
            this.order_id = order_id;
        }
        public int getPrice(){
            return price;
        }
        public int getOrder_id(){
            return order_id;
        }
        public class Provider{
            private String company_name;
            private String creation_age;
            private String country;
        public Provider(String company_name, String creation_age, String country){
        this.company_name = company_name;
        this.creation_age = creation_age;
        this.country = country;
        }
        public String getCompany_name(){
            return company_name;
        }
        public String getCreation_age(){
            return creation_age;
        }
        public String getCountry(){
            return country;
        }
        }
        public class Operation{
            private String order_operation;
            private String operation_date;
            private int order_id;
            private String tel;
            public Operation(String order_operation, String operation_date, int order_id, String tel){
                this.order_operation = order_operation;
                this.operation_date = operation_date;
                this.order_id = order_id;
                this.tel = tel;
            }
            public String getOrder_operation(){
                return order_operation;
            }
            public String getOperation_date(){
                return operation_date;
            }
            public int getOrder_id(){
                return order_id;
            }
            public String getTel(){
                return tel;
            }
        }
        public class DropPointDataBase {
            private List<Customer> customers;
            private List<Order> orders;
            private List<Provider> providers;
            private List<Operation> operations;
        
        
                public void addCustomer(Customer customer) {
                    customers.add(customer);
            }
        
                public void addOrder(Order order) {
                    orders.add(order);
            }
        
                public void addTicket(Provider provider) {
                    providers.add(provider);
            }
        
                public void addOperation(Operation operation) {
                    operations.add(operation);
            }
        
                public void printCustomerList() {
                    if (customers.isEmpty()){
                      System.out.println("Список пользователей пуст");  
                    }
                    else{
                        System.out.println("Список пользователей:");
                        System.out.println("----------------------------------");
                        for (Customer customer : customers) {
                            System.out.println("ФИО: " + customer.getFIO());
                            System.out.println("Телефон: " + customer.getTel());
                            System.out.println("Дата рождения: " + customer.getDate());
                            System.out.println("Адрес: " + customer.getAddress());
                            System.out.println("----------------------------------");
                        }
                }
                    }
            
        
                public void printTicketList() {
                    if (providers.isEmpty()){
                      System.out.println("Список производителей пуст");  
                    }
                    else{
                        System.out.println("Список производителей:");
                        System.out.println("----------------------------------");
                        for (Provider provider : providers) {
                            System.out.println("Название компании: " + provider.getCompany_name());
                            System.out.println("Год создания компании: " + provider.getCreation_age());
                            System.out.println("Страна компании: " + provider.getCountry());
                            System.out.println("----------------------------------");
                        }
                }
            }
        
                public void printOrderList() {
                    if (orders.isEmpty()){
                        System.out.println("Список заказов пуст");  
                      }
                      else{
                          System.out.println("Список заказов:");
                          System.out.println("----------------------------------");
                          for (Order order : orders) {
                              System.out.println("Цена заказа: " + order.getPrice());
                              System.out.println("ID заказа: " + order.getOrder_id());
                              System.out.println("----------------------------------");
                          }
                }
            }
        
                public void printOperationList() {
                    if (operations.isEmpty()){
                        System.out.println("Список операций пуст");  
                      }
                      else{
                          System.out.println("Список операций:");
                          System.out.println("----------------------------------");
                          for (Operation operation : operations) {
                              System.out.println("Операция: " + operation.getOrder_operation());
                              System.out.println("Дата операции: " + operation.getOperation_date());
                              System.out.println("ID заказа: " + operation.getOrder_id());
                              System.out.println("Телефон: " + operation.getTel());
                              System.out.println("----------------------------------");
                          } 
                }
            }
        
                public Customer inputCustomerFromUser() {
                String FIO;
                String tel;
                String Date;
                String address;
                Scanner in = new Scanner(System.in);
                System.out.println("Введите ФИО: ");
                FIO = in.nextLine();
                System.out.println("Введите телефон: ");
                tel = in.nextLine();
                System.out.println("Введите дату рождения: ");
                Date = in.nextLine();
                System.out.println("Введите адрес: ");
                address = in.nextLine();
                in.close();
                return new Customer(FIO, tel, Date, address);
            
            }
        
                public Order inputOrderFromUser() {
                  int price;
                  int order_id;
                    Scanner in = new Scanner(System.in);
                System.out.println("Введите цену заказа: ");
                price = in.nextInt();
                System.out.println("Введите ID заказа: ");
                order_id = in.nextInt();
                in.close();
                return new Order(price, order_id);
            }
        
                public Provider inputProviderFromUser() {
                    String company_name;
                    String creation_age;
                    String country;
                    Scanner in = new Scanner(System.in);
                    System.out.println("Введите название компании ");
                    company_name = in.nextLine();
                    System.out.println("Введите год создания компании ");
                    creation_age = in.nextLine();
                    System.out.println("Введите страну компании ");
                    country = in.nextLine();
                    in.close();
                    return new Provider(company_name, creation_age, country);
            }
        
                public Operation inputOperationFromUser() {
                    String order_operation;
                    String operation_date;
                    int order_id;
                    String tel;
                    Scanner in = new Scanner(System.in);
                    System.out.println("Введите тип операции (выдача товара или возврат товара):  ");
                    order_operation = in.nextLine();
                    System.out.println("Введите дату операции: ");
                    operation_date = in.nextLine();
                    System.out.println("Введите ID заказа: ");
                    order_id = in.nextInt();
                    System.out.println("Введите телефон: ");
                    tel = in.nextLine();
                    in.close();
                    return new Operation(order_operation, operation_date, order_id, tel);

            }
        }
    }
}