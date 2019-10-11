package model;


public class Account {

	private Service.serviceType service;
	private boolean existing;
	//private Date lastSuccesfulRefresh;
	
	public Account(Service.serviceType newService) {
		setService(newService);
	}
	
	
	////////////////
	public Service.serviceType getService() {
		return service;
	}

	public void setService(Service.serviceType service) {
		this.service = service;
	}

	
	public boolean isExisting() {
		return existing;
	}

	public void setExisting(boolean existing) {
		this.existing = existing;
	}
}
