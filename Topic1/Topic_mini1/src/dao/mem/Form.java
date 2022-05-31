package dao.mem;

import dao.IComponent;
import dao.IForm;

import java.util.List;

public class Form implements IForm {
    private List<IComponent> components;

    public Form() {
    }

    @Override
    public void addComponent(InputComponent inputComponent){
        this.components.add(inputComponent);
    }
    @Override
    public boolean validateForm(){
        return false;
    }
}
