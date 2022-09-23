import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyImpl implements MarriageAgency {
    List<Person> partners=new ArrayList<>();
    @Override
    public void register(Person person) {
        partners.add(person);
    }
    @Override
    public void pair(Person person) {
        for(Person partner:partners){
            if(partner.getAge()==person.getRequestAge()&&partner.getGender()!=person.getGender()){
                System.out.println("今晚"+person.getName()+"和"+partner.getName()+"约饭");
            }
        }
    }
}
