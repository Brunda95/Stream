package com.xworkz.streamDTO;

	public class CafeDTO {
		private Integer id;
		private String name;
		private String location;
		private Float  rating;
		public CafeDTO(Integer id, String name, String location, Float rating) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.rating = rating;
		}
		public synchronized Integer getId() {
			return id;
		}
		public synchronized void setId(Integer id) {
			this.id = id;
		}
		public synchronized String getName() {
			return name;
		}
		public synchronized void setName(String name) {
			this.name = name;
		}
		public synchronized String getLocation() {
			return location;
		}
		public synchronized void setLocation(String location) {
			this.location = location;
		}
		public synchronized Float getRating() {
			return rating;
		}
		public synchronized void setRating(Float rating) {
			this.rating = rating;
		}
		@Override
		public String toString() {
			return "CafeDTO [id=" + id + ", name=" + name + ", location=" + location + ", rating=" + rating + "]";
		}
		
		

	}


