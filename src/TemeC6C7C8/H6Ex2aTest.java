package TemeC6C7C8;

public class H6Ex2aTest {

	public static void main(String[] args) {
       H6Ex2 teacher = new H6Ex2();
        teacher.setCourse("English");
        teacher.setExperienceYears(30);
        teacher.setSchedule("Monday - Friday, 7am - 3pm");
        
        if (teacher.getCourse().equals("Java") && teacher.getExperienceYears() >= 3 && !teacher.getSchedule().contains("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}
