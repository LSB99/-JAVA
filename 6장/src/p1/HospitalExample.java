package p1;

public class HospitalExample {

	public static void main(String[] args) {
		
		DoctorValue doctorvo = new DoctorValue();
		NurseValue nursevo = new NurseValue();
		PatientValue patientvo = new PatientValue();
		PersonValue personvo = new PersonValue();
		
		
		System.out.println("Doctor Info : "+doctorvo.getInfo());
		System.out.println("Nurse Info : "+nursevo.getInfo());
		System.out.println("Paitent Info : "+patientvo.getInfo());
		System.out.println("Person Info : "+personvo.getInfo());
	}
}
