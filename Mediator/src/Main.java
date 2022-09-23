public class Main {
    public static void main(String[] args) {
        MarriageAgency marriageAgency=new MarriageAgencyImpl();
        Person jojo = new Person("jojo",25,Gender.MALE,26,marriageAgency);
        Person Talor=new Person("Talor",30,Gender.FEMALE,25,marriageAgency);
        Person IronMan=new Person("Tony",30,Gender.MALE,26,marriageAgency);
        Person HongKongDoll=new Person("HongKongDoll",26,Gender.FEMALE,25,marriageAgency);
        marriageAgency.register(jojo);
        marriageAgency.register(Talor);
        marriageAgency.register(IronMan);
        marriageAgency.register(HongKongDoll);
//        jojo.findPartner();
        marriageAgency.pair(jojo);
    }
}
