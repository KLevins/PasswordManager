package framework;

import java.util.Calendar;
import java.util.Date;

public class Entry  {

    private String name;
    private String password;
    private Date date;

/*    public Entry(String name, String password, Date date) {
        setName(name);


    }*/

    public Entry setName(String name) {
        this.name = name;
        return this; //  ��������� ����� �������
    }

    public Entry setPassword(String password) {
        this.password = password;
        return this; //  ��������� ����� �������
    }

    public Entry  setChangeDate(Date date) {
        this.date = date;
        return this; //  ��������� ����� �������
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Date getDate() {
        return date;
    }

}
