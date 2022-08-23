public class StaticVAriables {


    int empid;
    int salary;
    static String ceo;
    public void survey()
    {
            System.out.println(empid + ":" + salary + ":" +ceo );
        }
}


 class Demo{
    public static void main(String[] args) {

        StaticVAriables navin = new StaticVAriables();
        navin.empid= 15;

        navin.salary= 5000;

        StaticVAriables mahesh = new StaticVAriables();
        mahesh.salary= 5900;


        mahesh.empid= 78;

        StaticVAriables.ceo="sanju";


        navin.survey();
        mahesh.survey();
    }
}
