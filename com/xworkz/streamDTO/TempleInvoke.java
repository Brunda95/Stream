package com.xworkz.streamDTO;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class TempleInvoke {
		
		public static void main(String[] args) {
			
		
		TempleDTO dto=new TempleDTO(10,"Dharmastala","Darmasthala","Manjunatha",19000);
		TempleDTO dto1=new TempleDTO(20,"Shirdi","Mumbai","Sai baba",23700);
		TempleDTO dto2=new TempleDTO(30,"Kashi","Varanasi","shiva",2300);
		TempleDTO dto3=new TempleDTO(40,"Horanadu","Mudigere","Annapurneshwari",30000);
		TempleDTO dto4=new TempleDTO(50,"Srungeri","Kalsa","sharadha",12000);
		
		List<TempleDTO>  tmpl=new ArrayList<TempleDTO>();
		tmpl.add(dto4);
		tmpl.add(dto3);
		tmpl.add(dto2);
		tmpl.add(dto1);
	    tmpl.add(dto);

	     tmpl.stream().filter((v)->v.getVisitorsPerDay()>1000).sorted((d1,d2)->d2.getVisitorsPerDay().compareTo(d1.getVisitorsPerDay())).collect(Collectors.toList()).forEach((v)->System.out.println(v));
		
		
		}
	}

}
