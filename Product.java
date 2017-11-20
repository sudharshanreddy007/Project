package homeAPP;
public class Product{

	int productID;
    String productName;
    String productStatus;
    double ProductPrice;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}

/*
The constructor initializes the value of productID, name & price with
the given values .Initially the status of the product is set to Available*/
    Product(int prodID,String prodName, double ProdPrice)
    {
         productID = prodID;
         productName= prodName;
         ProductPrice = ProdPrice;
         productStatus = "Available"; /*set it to Available*/
    }
}