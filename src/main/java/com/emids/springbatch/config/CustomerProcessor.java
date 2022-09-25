package com.emids.springbatch.config;

import com.emids.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }

//        String str_date = customer.getDob();
//        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
//        Date date = formatter.parse(str_date);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        if(calendar.get(Calendar.YEAR)>2000) {
//            return customer;
//        }else{
//            return null;
//        }


        return customer;
    }
}