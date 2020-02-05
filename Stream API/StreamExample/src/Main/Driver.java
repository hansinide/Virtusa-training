package Main;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Driver {

	public static void main(String[] args) {
		
		
		
		List<Student> studentList = Arrays.asList(
		new Student("Saman",85),
		new Student("Sadun",65),
		new Student("Chathura",78),
		new Student("Kasun",56),
		new Student("Nimal",65),
		new Student("Ravi",48),
		new Student("Siva",79),
		new Student("Silva",84),
		new Student("Chamara",81),
		new Student("Ruwan",90));
		
		//Filtering with stream API
	List<Student> filtered=studentList.stream()
			.filter(s -> s.getMarks()>60)
			.collect(Collectors.toList());
		
	Student stu = studentList.stream()
				 	.filter(s -> "Siva".equals(s.getName()))
				 	.findAny()
	                .orElse(null);           

	filtered.forEach(s->s.studentPrint());
	System.out.println("======================================================================================");
	
	//Sorting with Stream API
	List<Student> sortedList=studentList.stream()
			.sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
	
	sortedList.forEach(s->s.studentPrint());
	System.out.println("======================================================================================");
	
	//Mapping with Stream API
		List<Student> mappingList=studentList.stream()
				.map(s->new Student("Mr "+ s.getName(),s.getMarks()))
				.collect(Collectors.toList());
		
		mappingList.forEach(s->s.studentPrint());
		System.out.println("======================================================================================");
		
	
		
	}

}
