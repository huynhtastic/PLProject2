package huynh;

import java.text.NumberFormat;

/**
 * Created by Eric on 2/19/2016.
 */
public class CheckingAccount extends Account {

    private double MonthlyFee;

    public void subtractMonthlyFee(){

    }

    public void setMonthlyFee(){
        MonthlyFee = 1;
    }

    public double getMonthlyFee(){
        return MonthlyFee;
    }

    public String getMonthlyFeeFormatted(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(MonthlyFee);
    }
}
