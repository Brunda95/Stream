package com.xworkz.streamDTO;

	public class TempleDTO {
		private Integer id;
		private String name;
		private String location;
		private String mainGod;
		private Integer visitorsPerDay;
		public TempleDTO(Integer id, String name, String location, String mainGod, Integer visitorsPerDay) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.mainGod = mainGod;
			this.visitorsPerDay = visitorsPerDay;
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
		public synchronized String getMainGod() {
			return mainGod;
		}
		public synchronized void setMainGod(String mainGod) {
			this.mainGod = mainGod;
		}
		public synchronized Integer getVisitorsPerDay() {
			return visitorsPerDay;
		}
		public synchronized void setVisitorsPerDay(Integer visitorsPerDay) {
			this.visitorsPerDay = visitorsPerDay;
		}
		@Override
		public String toString() {
			return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", mainGod=" + mainGod
					+ ", visitorsPerDay=" + visitorsPerDay + "]";
		}
		

	}

}
