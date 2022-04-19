package MavenProject.JenkinsJobs;

import org.testng.annotations.Test;

public class JenkinsTest {
	NoteClass noteClass = new NoteClass("Shakespears");
	
	@Test(priority=1)
	public void printNotes() {
		System.out.println("Printing notes..." + noteClass.getNotes());
		System.out.println("Notes printed.");
	}
	
	@Test(priority=0)
	void writeNotes() {
		System.out.println("Writing notes...");
		noteClass.setNotes(" is a historical person");
	}
	
	private class NoteClass {
		private String strNotes;
		
		public NoteClass(String strNotes) {
			this.strNotes = strNotes;
		}
		
		public String getNotes() {
			return strNotes;
		}
		
		public void setNotes(String strNotes) {
			this.strNotes += strNotes;
		}
	}
}
