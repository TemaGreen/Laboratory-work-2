public class Pupils
{
    //метод выводящий на экран оценки
    public static void printMarks(Pupil p)
    {
        for(int i = 0; i<p.getSizeArrays();i++)
        {
            System.out.println(p.getMark(i));
        }
    }

    //метод выводящий на экран предметы
    public static void printSubjects(Pupil p)
    {
        for(int i = 0; i<p.getSizeArrays();i++)
        {
            System.out.println(p.getSubject(i));
        }
    }

    //метод считающий среднее арифметическое оценок
    public static  double avarage(Pupil p)
    {
        double sum =0;
        for (int i = 0; i<p.getSizeArrays();i++)
        {
            sum += p.getMark(i);
        }
        double res = sum / p.getSizeArrays();
        return res;
    }
}

