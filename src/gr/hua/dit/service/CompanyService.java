package gr.hua.dit.service;

import java.util.List;

import gr.hua.dit.entity.Positions;
import gr.hua.dit.entity.Student;

public interface CompanyService {
	void saveCompanyPosition(String name, String category);

	List<Positions> companyPositions(String compName);

	List<Student> StudentsForPosition(String compName, int posID);

	boolean saveStudentsForPosition(int posID, int studentID);

}
