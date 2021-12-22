package com.xworkz.streamDTO;

	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class ZooInvoke{
		public static void main(String[] args) {
			ZooDTO dto=new ZooDTO(1,"Mysore Zoo","Mysore",300);
			ZooDTO dto1=new ZooDTO(2,"Nagrahole","Mysore",250);
			ZooDTO dto2=new ZooDTO(3,"Lion Safar","Dandeli",100);
			ZooDTO dto3=new ZooDTO(4,"Banergata","Banglore",200);
			ZooDTO dto4=new ZooDTO(5,"Bandipur","Mysore",200);
			
			Stream<ZooDTO> str=Stream.of(dto,dto1,dto2,dto3,dto4);
			List<ZooDTO>  temp=str.sorted((e1,e2)->e2.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList());
			temp.forEach((e)->System.out.println(e));
			
		}


}
