package dao;

public interface IComponent {
    void setData(String data);

    void display();

    void setValidation(IValidation validation);

    boolean validate();
}
