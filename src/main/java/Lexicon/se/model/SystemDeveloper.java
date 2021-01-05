package Lexicon.se.model;

import Lexicon.se.model.Employee;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    private String[] certificates;
    private String [] languages;

    public SystemDeveloper() {
        certificates = new String[0];
        languages = new String[0];
    }

    @Override
    public void calculateSalary() {
        int baseSalary = 25000;
        int extraPriceCertificate = 1000;
        int extraPriceProgrammingLanguage = 1500;
        double calcSalary = baseSalary +
                (extraPriceCertificate * certificates.length) +
                (extraPriceProgrammingLanguage * languages.length);
this.setSalary(calcSalary);
    }

    public  void addLanguage(String programmingLanguage){
        String[] newArray = Arrays.copyOf(languages, languages.length + 1);
        newArray[newArray.length - 1] = programmingLanguage;
        this.setLanguages(newArray);
    }

    public void addCertificate(String certName) {
        String[] newArr = Arrays.copyOf(certificates, certificates.length + 1);
        newArr[newArr.length - 1] = certName;
        this.setCertificates(newArr);


    }
    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
