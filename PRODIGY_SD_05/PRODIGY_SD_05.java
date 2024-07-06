import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PRODIGY_SD_05 {
    public static void main(String[] args) {
        String url = "https://www.bookchor.com/store/36/39-store";
        try {
            Document document = Jsoup.connect(url).get();
            Elements products = document.select(".product");
            String csvFilePath = "product_data.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath))) {
                writer.write("Product Name,Price,Rating\n");
                for (Element product : products) {
                    String productName = product.select(".product-name").text();
                    String price = product.select(".product-price").text();
                    String rating = product.select(".product-rating").text();
                    writer.write(productName + "," + price + "," + rating + "\n");
                }
                System.out.println("Data has been successfully scraped and saved to " + csvFilePath);
            } catch (IOException e) {
                System.err.println("Error writing to CSV file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error connecting to the website: " + e.getMessage());
        }
    }
}
