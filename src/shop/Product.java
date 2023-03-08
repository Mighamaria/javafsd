/**
 * 
 */
package shop;

/**
 * @author Administrator
 *
 */
public class Product {
	private int pdtId;
	public String pdtName;
	public int pdtPrice;
	
	public int getPdtId() {
		return pdtId;
	}
	public void setPdtId(int pdtId) {
		this.pdtId = pdtId;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public int getPdtPrice() {
		return pdtPrice;
	}
	public void setPdtPrice(int pdtPrice) {
		this.pdtPrice = pdtPrice;
	}
	/**
	 * 
	 */
//	public Product() {
//		// TODO Auto-generated constructor stub
//		
//		
//	}
	public Product(int pdtId, String pdtName, int pdtPrice) {
		super();
		this.pdtId = pdtId;
		this.pdtName = pdtName;
		this.pdtPrice = pdtPrice;
	}

}
