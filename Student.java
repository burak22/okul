public class Student {
    String name;
    int stuNo;
    int somestr;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;
    
    Student(String Name,int StuNo,int Somestr,Course C1, Course C2,Course C3){
        name = Name;
        stuNo = StuNo;
        somestr = Somestr;
        c1 = C1;
        c2 = C2;
        c3 = C3;
    }
    public void addBulkExamNote(int note1,int note2, int note3){
        this.c1.note = note1;
        this.c2.note = note2;
        this.c3.note = note3;
    }
    public void addBulkQuizNote(int note1,int note2,int note3){
        this.c1.quizNote = note1;
        this.c2.quizNote = note2;
        this.c3.quizNote = note3;
    }
    public void calcAvg(){
        this.average = ((this.c1.note * 0.8f) + (this.c1.quizNote * 0.2f) + (this.c2.note * 0.7f) + (this.c2.quizNote * 0.3f) + (this.c3.note * 0.6f) + (this.c3.quizNote * 0.4f))/3;
        this.isPass = (average >=55)? true:false;
    }
    public void printNotes(){
        System.out.println("------------------SINAVLAR---------------------");
        System.out.printf("%s: %d\n%s: %d\n%s: %d",this.c1.name,this.c1.note,this.c2.name,this.c2.note,this.c3.name,this.c3.note);
        System.out.println("\n----------------SÖZLÜLER---------------------");
        System.out.printf("%s: %d\n%s: %d\n%s: %d",this.c1.name,this.c1.quizNote,this.c2.name,this.c2.quizNote,this.c3.name,this.c3.quizNote);
        System.out.println("\nDÖNEM ORTALAMASI: " + average);
    }
}
