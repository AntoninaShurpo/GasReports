package com.antonina.gasreports;

import com.antonina.gasreports.models.District;
import com.antonina.gasreports.models.Gas;
import com.antonina.gasreports.models.GasStation;
import com.antonina.gasreports.models.Report;

import java.util.HashSet;
import java.util.Set;

public class Executor {
    public static void main(String[] args) {
        //Set<GasStation> gasStations = new HashSet<>();


    }

    public GasStation firstGasStation() {
        GasStation first = new GasStation();
        first.setName("Station1");
        first.setZipCode(111);
        first.setAddress("Buena vista ave");

        Set<Gas> gasForFirst = new HashSet<>();
        gasForFirst.add(standardGas(3.35));
        gasForFirst.add(premiumGas(3.50));
        gasForFirst.add(exclusiveGas(5.0));
        first.setGasCollection(gasForFirst);
        return first;
    }

    public GasStation secondGasStation() {
        GasStation second = new GasStation();
        second.setName("Station2");
        second.setZipCode(112);
        second.setAddress("El Camino");

        Set<Gas> gasForSecond = new HashSet<>();
        gasForSecond.add(standardGas(3.11));
        gasForSecond.add(premiumGas(3.33));
        gasForSecond.add(exclusiveGas(4.35));
        second.setGasCollection(gasForSecond);
        return second;
    }

    public GasStation thirdGasStation() {
        GasStation third = new GasStation();
        third.setName("Station3");
        third.setZipCode(113);
        third.setAddress("Mountain road");

        Set<Gas> gasForThird = new HashSet<>();
        gasForThird.add(standardGas(3.56));
        gasForThird.add(premiumGas(3.99));
        third.setGasCollection(gasForThird);
        return third;
    }

    public GasStation forthGasStation() {
        GasStation forth = new GasStation();
        forth.setName("Station4");
        forth.setZipCode(114);
        forth.setAddress("Paradise blv");

        Set<Gas> gasForForth = new HashSet<>();
        gasForForth.add(standardGas(3.13));
        gasForForth.add(premiumGas(3.33));
        gasForForth.add(exclusiveGas(4.99));
        forth.setGasCollection(gasForForth);
        return forth;
    }

    public GasStation fifthGasStation() {
        GasStation fifth = new GasStation();
        fifth.setName("Station5");
        fifth.setZipCode(115);
        fifth.setAddress("Lovely valley");

        Set<Gas> gasForFifth = new HashSet<>();
        gasForFifth.add(standardGas(3.68));
        gasForFifth.add(premiumGas(3.87));
        gasForFifth.add(exclusiveGas(4.05));
        fifth.setGasCollection(gasForFifth);
        return fifth;
    }

    public Gas standardGas(double price) {
        Gas standard = new Gas();
        standard.setName("92");
        standard.setPrice(price);
        return standard;
    }

    public Gas premiumGas(double price) {
        Gas premium = new Gas();
        premium.setName("95");
        premium.setPrice(price);
        return premium;
    }

    public Gas exclusiveGas(double price) {
        Gas exclusive = new Gas();
        exclusive.setName("98");
        exclusive.setPrice(price);
        return exclusive;
    }

    public District blrDistrict() {
        District blr = new District();
        blr.setName("Gomelski");
        blr.setName("Minski");
        blr.setName("Mogilevski");
        blr.setName("Bitebski");
        blr.setName("Brestski");
        return blr;
    }

    public District usaDistrict() {
        District usa = new District();
        usa.setName("Californiyski");
        usa.setName("NYski");
        usa.setName("Niagarski");
        usa.setName("Nevadovki");
        usa.setName("Washingtonski");
        return usa;
    }

    public District cadDistrict() {
        District cad = new District();
        cad.setName("Torontovski");
        cad.setName("Montrealevski");
        cad.setName("Otawavski");
        cad.setName("Niagarski");
        return cad;
    }

    public District rusDistrict() {
        District rus = new District();
        rus.setName("Moscowski");
        rus.setName("Leningradski");
        rus.setName("Vladivostokski");
        rus.setName("Kaliningradski");
        return rus;
    }

    public District uaDistrict() {
        District ua = new District();
        ua.setName("Kievski");
        ua.setName("Chernigovski");
        ua.setName("Belo-serkovski");
        ua.setName("Odesski");
        ua.setName("Krymski");
        return ua;
    }

    public Report dailyReport() {
        Report daily = new Report();
        daily.setDate("Monday");
        daily.setDate("Tuesday");
        daily.setDate("Wednesday");
        daily.setDate("Thursday");
        daily.setDate("Friday");
        return daily;
    }

    public Report weeklyReport() {
        Report weekly = new Report();
        weekly.setDate("First quarterly");
        weekly.setDate("Second quarterly");
        weekly.setDate("Third quarterly");
        weekly.setDate("Fourth quarterly");
        weekly.setDate("Fifth quarterly");
        return weekly;
    }

    public Report monthlyReport() {
        Report monthly = new Report();
        monthly.setDate("Jan");
        monthly.setDate("Feb");
        monthly.setDate("Mar");
        monthly.setDate("Apr");
        monthly.setDate("May");
        return monthly;
    }

    public Report quarterlyReport() {
        Report quarterly = new Report();
        quarterly.setDate("First quarterly");
        quarterly.setDate("Second quarterly");
        quarterly.setDate("Third quarterly");
        quarterly.setDate("Fourth quarterly");
        quarterly.setDate("Fifth quarterly");
        return quarterly;
    }

    public Report annualReport() {
        Report annual = new Report();
        annual.setDate("2015");
        annual.setDate("2016");
        annual.setDate("2017");
        annual.setDate("2018");
        annual.setDate("2019");
        annual.setDate("2020");
        return annual;
    }


}
