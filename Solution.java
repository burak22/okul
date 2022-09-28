public class Solution {
    public static void main(String[] args) {
        Course c1 = new Course("Tarih", "102", "TRH102");
        Course c2 = new Course("Matematik","102","MATH102");
        Course c3 = new Course("Kimya", "101", "CHEM101");
        Teacher t1 = new Teacher("Mahmut", "555", c1);
        Student s1 = new Student("Mehmet", 55, 2, c1, c2, c3);
        s1.addBulkExamNote(55, 60, 85);
        s1.addBulkQuizNote(100, 80, 70);
        s1.calcAvg();
        s1.printNotes();
    }
}
