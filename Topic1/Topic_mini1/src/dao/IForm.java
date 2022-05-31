package dao;

import dao.mem.InputComponent;

public interface IForm {
    void addComponent(InputComponent inputComponent);

    boolean validateForm();
}
