package com.concordia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
    private BigDecimal amount;
    private Currency currency= NumberFormat.getCurrencyInstance(Locale.US).getCurrency();
    private RoundingMode roundingMode=RoundingMode.CEILING;

    public CurrencyClass(BigDecimal amount, Currency currency, RoundingMode roundingMode) {
        this.amount = amount;
        this.currency = currency;
        this.roundingMode = roundingMode;
    }

    public String getFormatedValue(){
        java.text.NumberFormat money = java.text.NumberFormat.getCurrencyInstance();
        money.setCurrency(currency);
        money.setRoundingMode(roundingMode);
        return money.format(amount);
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public void setAmount(BigDecimal amount) {

        this.amount = amount;
    }

    public Currency getCurrency() {

        return currency;
    }

    public void setCurrency(Currency currency) {

        this.currency = currency;
    }

    public RoundingMode getRoundingMode() {

        return roundingMode;
    }

    public void setRoundingMode(RoundingMode roundingMode) {

        this.roundingMode = roundingMode;
    }
}
