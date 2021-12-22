package com.xworkz.streamDTO;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class CafeInvoke{
	public static void main(String[] args) {
		CafeDTO dto=new CafeDTO(1,"Doms Cafe","Banglor",4.1f);
		CafeDTO dto1=new CafeDTO(2,"McDonalds","Mysore",4.5f);
		CafeDTO dto2=new CafeDTO(3,"Cfe katte","Tiptur",3.2f);
		CafeDTO dto3=new CafeDTO(4,"CafeAda","Arsikere",2.0f);
		CafeDTO dto4=new CafeDTO(5,"Coffe day","Hyderabad",3.0f);
		
		List<CafeDTO> cafe=new ArrayList<CafeDTO>();
		cafe.add(dto4);
		cafe.add(dto3);
		cafe.add(dto2);
		cafe.add(dto1);
		cafe.add(dto);
		
		cafe.stream().filter((e)->e.getRating()>3).sorted((d1,d2)->d2.getName().compareTo(d1.getName())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
	}
	}


