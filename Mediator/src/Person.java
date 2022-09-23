public  class Person {
    private String name;
    private int age;
    private Gender gender;
    private int requestAge;
    private MarriageAgency marriageAgency;
    Person(String name,int age,Gender gender,int requestAge,MarriageAgency marriageAgency){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.requestAge=requestAge;
        this.marriageAgency=marriageAgency;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getRequestAge() {
        return requestAge;
    }

    public MarriageAgency getMarriageAgency() {
        return marriageAgency;
    }

    void findPartner(){
        marriageAgency.pair(this);
    }
}
enum Gender{
    MALE,FEMALE;
}