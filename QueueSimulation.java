import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Customer {
    private int customerId;
    private int waitTime; // Müşterinin bekleme süresi
    private int productCount; // Müşterinin aldığı ürün sayısı

    public Customer(int customerId, int productCount) {
        this.customerId = customerId;
        this.productCount = productCount;
        this.waitTime = calculateWaitTime(); // Bekleme süresini hesapla
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public int getProductCount() {
        return productCount;
    }

    // Müşterinin bekleme süresini hesaplayan metot
    private int calculateWaitTime() {
        return productCount * 2; // Her ürün için 2 dakika bekleniyor
    }
}

public class QueueSimulation {
    private Queue<Customer> queue = new LinkedList<>();
    private Random random = new Random();

    public void generateCustomers(int numberOfCustomers) {
        for (int i = 1; i <= numberOfCustomers; i++) {
            int productCount = random.nextInt(5) + 1; // 1 ila 5 arasında rastgele ürün sayısı
            queue.add(new Customer(i, productCount));
        }
    }

    public void processQueue() {
        while (!queue.isEmpty()) {
            Customer customer = queue.poll(); // Kuyruğun ilk müşterisini çıkar
            System.out.println("Müşteri " + customer.getCustomerId() +
                               ": " + customer.getProductCount() + " ürün aldı ve " +
                               customer.getWaitTime() + " dakika kasada bekledi.");
        }
    }

    public static void main(String[] args) {
        QueueSimulation simulation = new QueueSimulation();

        // Müşteri kuyruğu oluştur
        simulation.generateCustomers(10); // 10 müşteri için kuyruğu oluştur
        
        // Kuyruğu simüle et
        simulation.processQueue();
    }
}


