package vn.edu.iuh.fit.backEnd.enums;

public enum EmployeeStatus {
    WORKING(1),
    TEMPORARY_LAYOFF (0),
    RESIGN(-1);

    private int value;

    EmployeeStatus(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
