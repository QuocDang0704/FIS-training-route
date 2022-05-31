package dao;

public class DateValidation implements IValidation {
    private String format = "dd-mm-yyyy";
    @Override
    public boolean validate(String data) {
        return false;
    }
}
