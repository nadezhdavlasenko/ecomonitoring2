import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Abonent {
    private String surname;
    private String name;
    private String patronymic;
    private String address;

//    public Abonent(String surname, String name, String patronymic, String address) {
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.address = address;
//    }


}