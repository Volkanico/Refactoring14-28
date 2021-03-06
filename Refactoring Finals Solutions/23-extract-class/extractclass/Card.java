package refactoritzacions;

import java.util.Date;

public class Card {
    private String creditCard;
    private Date creditCardDate;
    private int creditCardControlNumber;

    public Card(String creditCard, Date creditCardDate, int creditCardControlNumber) {
        this.creditCard = creditCard;
        this.creditCardDate = creditCardDate;
        this.creditCardControlNumber = creditCardControlNumber;
    }

    public boolean isValid () {
        boolean result = false;
        // Some code here...
        return result;
    }


    public boolean isCardExpired () {
        return creditCardDate.before(new Date());
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Date getCreditCardDate() {
        return creditCardDate;
    }

    public void setCreditCardDate(Date creditCardDate) {
        this.creditCardDate = creditCardDate;
    }

    public int getCreditCardControlNumber() {
        return creditCardControlNumber;
    }

    public void setCreditCardControlNumber(int creditCardControlNumber) {
        this.creditCardControlNumber = creditCardControlNumber;
    }
}


