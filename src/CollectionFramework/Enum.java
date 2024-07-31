package CollectionFramework;

public class Enum {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //They are by-Default public, static and final
        //so since its final you cannot create final enums

        Week(){
            System.out.println("This is a constructor "+ this);
            //this is not public or protected , so only private or default
            //why?
            //we don't want to create new objects because this is not enums concept

            //Internally: public static final Week Monday = new Week();
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
    }
}
