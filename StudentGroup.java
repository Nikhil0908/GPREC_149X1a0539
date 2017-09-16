import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws IllegalArgumentException {
		// Add your implementation here
		for(i=0;i<students.length;i++)
		{
			if(students[i]!=null)
			{
				return students[i];
			}
			else
			return null;
		}		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		for(i=0;i<students.length;i++)
		{
			if(students[i]!=null)
			{
				students[i].id=sc.nextInt();
				students[i].fullName=sc.next();
				students[i].birthDate=sc.nextDate();	
				students[i].avgMarks=scan.nextDouble();		
			}
			
		}
		
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		// Add your implementation here
		if([index]<0||index>=students.length)
		return null;
		else
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(student!=null)
		students[index]=student;
		else
		return null;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		LinkedList lin=LinkedList(Student students);
		lin.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		LinkedList lin=LinkedList(Student students);
		lin.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		LinkedList lin=LinkedList(Student students);
		lin.add(student,index);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		LinkedList lin=LinkedList(Student students);
		lin.remove(students[index]);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		LinkedList lin=LinkedList(Student students);
		lin.remove(students[index]);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
