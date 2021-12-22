package com.xworkz.streamDTO;
	
	public class HeadPhoneDTO {
		private Integer id;
		private String brand;
		private String type;
		private Integer model;
		private Double price;
		
		public HeadPhoneDTO(Integer id, String brand, String type, Integer model, Double price) {
			super();
			this.id = id;
			this.brand = brand;
			this.type = type;
			this.model = model;
			this.price = price;
		}
		public synchronized Integer getId() {
			return id;
		}
		public synchronized void setId(Integer id) {
			this.id = id;
		}
		public synchronized String getBrand() {
			return brand;
		}
		public synchronized void setBrand(String brand) {
			this.brand = brand;
		}
		public synchronized String getType() {
			return type;
		}
		public synchronized void setType(String type) {
			this.type = type;
		}
		public synchronized Integer getModel() {
			return model;
		}
		public synchronized void setModel(Integer model) {
			this.model = model;
		}
		public synchronized Double getPrice() {
			return price;
		}
		public synchronized void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "HeadPhoneDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", model=" + model + ", price="
					+ price + "]";
		}
		

	}


