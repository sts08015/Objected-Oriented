package Chapter_6;

public class ShopService {
	private ShopService(){
	}
	private static ShopService shopservice = new ShopService();
	static ShopService getInstance() {
		return shopservice;
	}
}
