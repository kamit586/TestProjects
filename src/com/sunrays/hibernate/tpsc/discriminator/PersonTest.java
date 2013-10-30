package com.sunrays.hibernate.tpsc.discriminator;

import java.util.Iterator;
import java.util.List;

public class PersonTest {

	private static PersonService personService = new PersonService();

	public static void main(String[] args) {

		// EngineerDTO dto = getEngineer();

		// DoctorDTO dto = getDoctor();

		// LawyerDTO dto = getLawyer();

		// add(dto);
		// delete(2l);
		// update(2l);
		get(2l);
		// getList();
		// search();
	}

	public static EngineerDTO getEngineer() {
		EngineerDTO engineerDTO = new EngineerDTO();
		// engineerDTO.setId(1l);// In case of Id is assigned.
		engineerDTO.setFirstName("Rahul");
		engineerDTO.setLastName("Sahu");
		engineerDTO.setDegree("B.E.");
		engineerDTO.setNoOfProjects(5);
		engineerDTO.setCompanyId("NCS#001");
		return engineerDTO;
	}

	public static DoctorDTO getDoctor() {
		DoctorDTO doctorDTO = new DoctorDTO();
		// doctorDTO.setId(2l);// In case of Id is assigned.
		doctorDTO.setFirstName("Armaan");
		doctorDTO.setLastName("Suri");
		doctorDTO.setDegree("M.S.");
		doctorDTO.setNoOfSurgeries(50);
		doctorDTO.setSpecialization("Cardiac");
		doctorDTO.setHospitalAddress("1/1 Old Palasiya, Indore");
		return doctorDTO;
	}

	public static LawyerDTO getLawyer() {
		LawyerDTO lawyerDTO = new LawyerDTO();
		// lawyerDTO.setId(3l);// In case of Id is assigned.
		lawyerDTO.setFirstName("Ravi");
		lawyerDTO.setLastName("Prasad");
		lawyerDTO.setDegree("L.L.B.");
		lawyerDTO.setNoOfCases(500);
		lawyerDTO.setCurrentClient("Sharma Ji");
		lawyerDTO.setWinPerc(67.22);
		return lawyerDTO;
	}

	public static void checkInstance(PersonDTO personDTO) {
		if (personDTO instanceof EngineerDTO) {
			EngineerDTO engineerDTO = (EngineerDTO) personDTO;
			System.out.println(engineerDTO.getId() + "\t"
					+ engineerDTO.getFirstName() + "\t"
					+ engineerDTO.getLastName() + "\t"
					+ engineerDTO.getDegree() + "\t"
					+ engineerDTO.getCompanyId() + "\t"
					+ engineerDTO.getNoOfProjects());
		}

		if (personDTO instanceof DoctorDTO) {
			DoctorDTO doctorDTO = (DoctorDTO) personDTO;
			System.out.println(doctorDTO.getId() + "\t"
					+ doctorDTO.getFirstName() + "\t" + doctorDTO.getLastName()
					+ "\t" + doctorDTO.getDegree() + "\t"
					+ doctorDTO.getSpecialization() + "\t"
					+ doctorDTO.getNoOfSurgeries() + "\t"
					+ doctorDTO.getHospitalAddress());
		}

		if (personDTO instanceof LawyerDTO) {
			LawyerDTO lawyerDTO = (LawyerDTO) personDTO;
			System.out.println(lawyerDTO.getId() + "\t"
					+ lawyerDTO.getFirstName() + "\t" + lawyerDTO.getLastName()
					+ "\t" + lawyerDTO.getDegree() + "\t"
					+ lawyerDTO.getNoOfCases() + "\t"
					+ lawyerDTO.getCurrentClient() + "\t"
					+ lawyerDTO.getWinPerc());
		}
	}

	public static void add(PersonDTO personDTO) {
		personService.add(personDTO);
	}

	public static void update(Long id) {
		PersonDTO personDTO = personService.get(id);
		personDTO.setFirstName("Raghav");
		personService.update(personDTO);
	}

	public static void delete(Long id) {
		PersonDTO personDTO = personService.get(id);
		personService.delete(personDTO);
	}

	public static void get(Long id) {
		PersonDTO personDTO = personService.get(id);
		checkInstance(personDTO);// Find the Original Class of an Object.
	}

	public static void getList() {
		List personList = personService.getList();

		Iterator iterator = personList.iterator();

		while (iterator.hasNext()) {
			PersonDTO personDTO = (PersonDTO) iterator.next();
			checkInstance(personDTO);// Find the Original Class of an Object.
		}
	}

	public static void search() {
		PersonDTO personDTO = new PersonDTO();
		personDTO.setFirstName("R");
		personDTO.setLastName("s");

		List personList = personService.search(personDTO);

		Iterator iterator = personList.iterator();

		while (iterator.hasNext()) {
			personDTO = (PersonDTO) iterator.next();
			checkInstance(personDTO);// Find the Original Class of an Object.
		}
	}

}
