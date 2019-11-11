public class Staff extends Person{
    String School;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        School = school;
        this.pay = pay;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "School='" + School + '\'' +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
