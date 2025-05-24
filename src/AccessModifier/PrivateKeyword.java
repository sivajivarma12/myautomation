package AccessModifier;

public class PrivateKeyword {
	
	private String url ="sivaji.com";
	
	

	public String getUrl() {
		return url;
	}



	public void setUrl(String newurl) {
		 url = newurl;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateKeyword pvt = new PrivateKeyword();
		System.out.println(pvt.url);
		pvt.setUrl("hello.com");
		System.out.println(pvt.getUrl());
	}

}
