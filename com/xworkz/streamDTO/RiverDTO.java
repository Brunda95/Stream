package com.xworkz.streamDTO;

	public class RiverDTO {
		private Integer id;
		private String name;
		private String state;
		private Integer length;
		private Integer noOfDams;
		public RiverDTO(Integer id, String name, String state, Integer length, Integer noOfDams) {
			super();
			this.id = id;
			this.name = name;
			this.state = state;
			this.length = length;
			this.noOfDams = noOfDams;
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
		public synchronized String getState() {
			return state;
		}
		public synchronized void setState(String state) {
			this.state = state;
		}
		public synchronized Integer getLength() {
			return length;
		}
		public synchronized void setLength(Integer length) {
			this.length = length;
		}
		public synchronized Integer getNoOfDams() {
			return noOfDams;
		}
		public synchronized void setNoOfDams(Integer noOfDams) {
			this.noOfDams = noOfDams;
		}
		@Override
		public String toString() {
			return "RiverDTO [id=" + id + ", name=" + name + ", state=" + state + ", length=" + length + ", noOfDams="
					+ noOfDams + "]";
		}
		
		
		
		
		
		
		
	}


