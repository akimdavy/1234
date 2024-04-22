package lv.venta.controller2;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
	@Setter(value = AccessLevel.NONE)
	private int id;
	private String title;
	private String decription;
	private float price;
	private int quality;
	
	private static int counter = 1;
	
	public void setId() {
		this.id = counter++;
	}
	
	public Product(String title, String description, float price, int quantity) {
		setId();
		setTitle(title);
		setDescription(description);
		setPrice(price);
		setQuantity(quantity);
	}
}
