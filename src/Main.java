public class Main {
    public static void main(String[] args) throws DuplicateSubjectException {
        Pupil boy = new Schoolboy("Хамидуллин", 3);
        boy.setMark(0, 5);
        boy.setMark(1, 4);
        boy.setMark(2, 3);
        boy.setSubject(0, "Алгебра");
        boy.setSubject(1, "История");
        boy.setSubject(2, "Русский язык");
        boy.add("Физика", 4);
        Pupils.printMarks(boy);
        Pupils.printSubjects(boy);
        System.out.println(Pupils.avarage(boy));
        System.out.println(boy.getMark(1));
        System.out.println(boy.getSubject(1));
        System.out.println(boy.getSurename());

        // boy.setSubject(2,"История");
        // boy.setMark(2,9);
        //boy.add("История",4);
        //boy.add("Литература", 9);
    }
}
