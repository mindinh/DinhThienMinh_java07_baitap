package buoi12.baitap;

public interface ManageCompany {
	public void assignEmployeeToDepartmentHead();
	public void outputCompanyPersonnel();
	public void inputCompanyPersonnel();
	public void findHighestPaidEmployee();
	public void findMaxNumOfEmpsOfHeads();
	public boolean findPersonnelById(String id);
	public void insertAPersonnel();
	public void removeAPersonnel();
	public double totalCompanySalary();
	public void findDirectorWithMostShares();
	public void eachDirectorIncome();
	public void sortPersonnelAlphabet();
	public void sortPersonnelSalaryDesc();
	
}
