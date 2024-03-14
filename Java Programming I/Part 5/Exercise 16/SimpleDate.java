
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public SimpleDate(SimpleDate date){
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if (day < 30){
            day += 1;
        } else if (month < 12){
            day = 1;
            month += 1;
        } else {
            day = 1;
            month = 1;
            year += 1;
        }
    }

    public void advance (int howManyDays){
        while (howManyDays > 0){
            advance();
            howManyDays--;
        }
    }

    public SimpleDate afterNumberOfDays (int days){
        SimpleDate newDate = new SimpleDate(this);
        newDate.advance(days);
        return newDate;
    }


}
