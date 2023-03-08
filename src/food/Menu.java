/**
 * 
 */
package food;

/**
 * @author Administrator
 *
 */
public class Menu {
//	@Override
//	public String toString() {
//		System.out.println("Select the id of food ");
//		return "Menu [nam=" + nam + ", price=" + price + "]";
//	}
//	public String getNam() {
//		return nam;
//	}
//	public void setNam(String nam) {
//		this.nam = nam;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
//	public Menu(String nam, String price) {
//		super();
//		this.nam = nam;
//		this.price = price;
//	}
	public String nam;
	public String price;
	
	@Override
	public String toString() {
		return "Item=" + nam + ", price=" + price + ", id=" + idf ;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getIdf() {
		return idf;
	}
	public void setIdf(String idf) {
		this.idf = idf;
	}
	private String idf;
	public Menu(String nam, String price, String idf) {
		super();
		this.nam = nam;
		this.price = price;
		this.idf = idf;
	}

}
