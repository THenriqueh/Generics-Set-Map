package entities;

import java.util.Objects;

public class Students {

	private Integer codeStudent;

	public Students() {

	}

	public Students(Integer codeStudent) {

		this.codeStudent = codeStudent;
	}

	public Integer getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(Integer codeStudent) {
		this.codeStudent = codeStudent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(codeStudent, other.codeStudent);
	}

}
