public class Practice 
{

//Instance field
    private int number;

//Default constructor
    public Practice() {
        number = 0;
    }

//The method gets called
    public Practice(int num) {
        number = num;
    }

    //if inserted parameter is less than or equal to 5 then the number value is multiplied by the parameter
    //if inserted parameter is more than that the insert is added to the number value
    public int practiceChanger(int insert) {
        if (insert <= 5) {
            return number * insert;
        }
        else {
            return number + insert;
        }
    }

    public String toString(){
        return "number = " + number;
    }
}