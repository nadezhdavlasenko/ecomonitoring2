import javafx.util.Pair;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class SubscribersForm extends JFrame {
    private JButton searchButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel panel;


    public SubscribersForm() {
        setContentPane(panel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SubscribersForm();
        TreeMap<String, Abonent> abonentTreeMap = new TreeMap<String, Abonent>();
        abonentTreeMap.put("111111111", new Abonent("Petrov","Petr", "Petrovich","Yanhelia 16"));
        abonentTreeMap.put("222222222", new Abonent("Ivanov","Ivan", "Ivanovoch","Borshyagovskaya 146"));
        abonentTreeMap.put("333333333", new Abonent("Stepanov","Stepan", "Stepanovich","Politechnicheskiy 10"));
        abonentTreeMap.put("444444444", new Abonent("Andreev","Andrey", "Andreevich","Volzalnaya 1"));


        List<Abonent> abonentList = new ArrayList<Abonent>();

        for (Map.Entry<String,Abonent> entry: abonentTreeMap.entrySet()
             ) {
            abonentList.add(entry.getValue());
           // System.out.println(entry.getValue());
        }
       // Collections.sort(abonentList,);
        //abonentList.sort(Comparator.comparing(m -> m.get("sent_date"), format)));
        List<Abonent> sortedList = new ArrayList<>();
        abonentList.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach((p)->{
            sortedList.add(p);
           // System.out.println(p);
        });
       // sortedList.stream().forEach(System.out::println);


    }

}
