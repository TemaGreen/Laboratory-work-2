import java.util.Arrays;
public class Student implements Pupil
{
    private String surename; //фамилия
    private int[] mark; //оценки
    private String[] subject;//предметы

    //метод возвращающий фамилию студента
    public String getSurename()
    {
        return surename;
    }

    //метод модифицирующий фамилию
    public void setSurename(String newsurename)
    {
        surename = newsurename;
    }

    //метод возращающий i-ю оценку
    public int getMark(int i)
    {
        return mark[i];
    }

    //метод модифицирующий i-ю оценку
    public void setMark(int i, int a) {
        if ((a > 5) || (a < 2))
        {
            throw new MarkOutOfBoundsException("Выход за границы.");
        }
        mark[i] = a;
    }

    //метод возвращающий i-й предмет
    public String getSubject(int i)
    {
        return subject[i];
    }

    //метод модифицирующий i-й предмет
    public void setSubject(int i, String s) throws  DuplicateSubjectException
    {
        for(String subj : subject)
        {
            if(subj.equals(s))
            {
                throw new DuplicateSubjectException("Такой предмет уже существует");
            }
        }
        subject[i]=s;
    }

    //метод добавляющий предмет и оценку
    public void add(String s, int m) throws DuplicateSubjectException {
        for (String subject : subject) {
            if(subject != null) {
                if (subject.equals(s)) {
                    throw new DuplicateSubjectException("Такой предмет уже существует");
                }
            }
        }
        if ((m < 2) || (m > 5)) {
            throw new MarkOutOfBoundsException("Выход за границу");
        }
   /*     int i = 0;
        while ((i < mark.length) && (marks[i] != 0)) {
            i++;
        }
        if (i == marks.length) {*/
        mark = Arrays.copyOf(mark, mark.length + 1);
        mark[mark.length - 1] = m;
        subject = Arrays.copyOf(subject, subject.length + 1);
        subject[subject.length - 1] = s;
      /*  } else if (i != marks.length) {
            marks[i] = m;
            subjects[i] = s;
        }*/
    }

    //метод возвращающий размер массивов оценок и предметов
    public int getSizeArrays()
    {
        return mark.length;
    }

    //конструктор
    public Student(String n, int i)
    {
        surename = n;
        mark = new int[i];
        subject = new String[i];
        for (int j=0; j<i; j++)
            subject[j] = "";
    }
}