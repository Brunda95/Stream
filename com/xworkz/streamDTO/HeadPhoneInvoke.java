package com.xworkz.streamDTO;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class HeadPhoneInvoke {
		public static void main(String[] args) {
			HeadPhoneDTO dto=new HeadPhoneDTO(1,"oppo","Wired",210058,1300d);
			HeadPhoneDTO dto1=new HeadPhoneDTO(2,"Realme","Wireless",20034,2695d);
			HeadPhoneDTO dto2=new HeadPhoneDTO(3,"Samsung Galaxy","Wired",21456,11999d);
			HeadPhoneDTO dto3=new HeadPhoneDTO(4,"Boat"," Wired",20012,299d);
			HeadPhoneDTO dto4=new HeadPhoneDTO(5,"MI","Wireless Bluetooth",20912,319d);
			
			List<HeadPhoneDTO> head=new ArrayList<HeadPhoneDTO>();
			head.add(dto4);
			head.add(dto3);
			head.add(dto2);
			head.add(dto1);
			head.add(dto);
			
			head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).collect(Collectors.toList()).forEach((d)->System.out.println(d));
			System.out.println(System.lineSeparator());
			
			System.out.println(System.lineSeparator());
			head.stream().filter((t)->t.getType()=="Wireless").sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
		
			System.out.println(System.lineSeparator());
	      head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).map((a)->a.getModel()).collect(Collectors.toList()).forEach((a)->System.out.println(a));
		}

	}


