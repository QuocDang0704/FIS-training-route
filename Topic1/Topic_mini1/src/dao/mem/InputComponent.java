package dao.mem;

import dao.IValidation;
import dao.StringMaxLengthValidatetion;

public class InputComponent implements dao.IComponent {
    private IValidation validation;
    private String data;

    public InputComponent() {
        this.validation = new StringMaxLengthValidatetion();
        this.data = "";
    }

    @Override
    public void setData(String data){
        this.data = data;
    }
    @Override
    public void display(){
        System.out.printf("Data:" +this.data+" ");
    }

    @Override
    public void setValidation(IValidation validation){
        this.validation = validation;
    }
    @Override
    public boolean validate(){
        return this.validation.validate(this.data);
    }
}
