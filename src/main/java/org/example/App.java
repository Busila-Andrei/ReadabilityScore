package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    String text;
    int characters;
    int words;
    int sentences;
    int syllables = 0;
    int polysyllables = 0;
    float score;

    public App (String text) {
        this.text = text;
        print();


    }
    public void print() {
        System.out.println("The text is:");
        System.out.println(getText());
        System.out.println();
        System.out.println("Words: " + getWords());
        System.out.println("Sentences: " + getSentences());
        System.out.println("Characters: " + getCharacters());
        System.out.println("Syllables: " + getSyllables());
        System.out.println("Polysyllables: " + getPolysyllables());
        System.out.println();
        action();
        System.out.println();
        System.out.println("This text should be understood in average by " + ageAverage() + " year olds.");
    }
    public void action() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): all");
        System.out.println();
        switch ("all"){
            case "ARI":
                ageARI(AutomatedReadabilityIndex());
                break;
            case "FK":
                ageFK(FleschKincaidReadability());
                break;
            case "SMOG":
                ageSMOG(SimpleMeasureOfGobbledygook());
                break;
            case "CL":
                ageCL(ColemanLiau());
                break;
            case "all":
                ageARI(AutomatedReadabilityIndex());
                ageFK(FleschKincaidReadability());
                ageSMOG(SimpleMeasureOfGobbledygook());
                ageCL(ColemanLiau());
                break;
        }

    }

    public String getText() {
        return text;
    }
    public int getWords() {
        words = text.split("\\s").length;
        return words;
    }
    public int getCharacters() {
        characters = text.replaceAll("\\s","").split("").length;
        return characters;
    }
    public int getSentences() {
        sentences = text.split("[.!?]").length;
        return sentences;
    }
    public int getSyllables() {
        String text2 = text;

        text2 = text2.toLowerCase();
        text2 = text2.replaceAll(" the ", " a ");
        text2 = text2.replaceAll(" we ", " a ");
        text2 = text2.replaceAll("e\\b", "n");
        text2 = text2.replaceAll("[aeiouy]{2,}", "a");
        text2 = text2.replaceAll(",", "");
        text2 = text2.replaceAll("[0-9]+", "a");
        text2 = text2.replaceAll("[^aeiouy ]", "");

        String[] s = text2.split(" ");
        for (String value : s) {
            if (value.length() > 2)
                polysyllables++;
        }

        text2 = text2.replaceAll("\\s+", "");

        syllables = text2.length();

        return syllables;
    }
    public int getPolysyllables(){
        return polysyllables;
    }






    public void ageARI(float score) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch ( Math.round(score)){
            case 1:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 6 year olds).");
                break;
            case 2:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 7 year olds).");
                break;
            case 3:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 9 year olds).");
                break;
            case 4:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 10 year olds).");
                break;
            case 5:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 11 year olds).");
                break;
            case 6:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 12 year olds).");
                break;
            case 7:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 13 year olds).");
                break;
            case 8:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 14 year olds).");
                break;
            case 9:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 15 year olds).");
                break;
            case 10:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 16 year olds).");
                break;
            case 11:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 17 year olds).");
                break;
            case 12:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 18 year olds).");
                break;
            case 13:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 24 year olds).");
                break;
            case 14:
                System.out.println("Automated Readability Index: " + df.format(AutomatedReadabilityIndex()) + " (about 24+ year olds).");
                break;
        }
    }
    public void ageFK(float score){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch ( Math.round(score)){
            case 1:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 6 year olds).");
                break;
            case 2:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 7 year olds).");
                break;
            case 3:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 9 year olds).");
                break;
            case 4:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 10 year olds).");
                break;
            case 5:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 11 year olds).");
                break;
            case 6:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 12 year olds).");
                break;
            case 7:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 13 year olds).");
                break;
            case 8:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 14 year olds).");
                break;
            case 9:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 15 year olds).");
                break;
            case 10:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 16 year olds).");
                break;
            case 11:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 17 year olds).");
                break;
            case 12:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 18 year olds).");
                break;
            case 13:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 24 year olds).");
                break;
            case 14:
                System.out.println("Flesch–Kincaid readability tests: " + df.format(FleschKincaidReadability()) + " (about 24+ year olds).");
                break;
        }
    }
    public void ageSMOG(float score){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch ( Math.round(score)){
            case 1:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 6 year olds).");
                break;
            case 2:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 7 year olds).");
                break;
            case 3:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 9 year olds).");
                break;
            case 4:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 10 year olds).");
                break;
            case 5:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 11 year olds).");
                break;
            case 6:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 12 year olds).");
                break;
            case 7:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 13 year olds).");
                break;
            case 8:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 14 year olds).");
                break;
            case 9:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 15 year olds).");
                break;
            case 10:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 16 year olds).");
                break;
            case 11:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 17 year olds).");
                break;
            case 12:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 18 year olds).");
                break;
            case 13:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 24 year olds).");
                break;
            case 14:
                System.out.println("Simple Measure of Gobbledygook: " + df.format(SimpleMeasureOfGobbledygook()) + " (about 24+ year olds).");
                break;
        }
    }
    public void ageCL(float score){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch ( Math.round(score)){
            case 1:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 6 year olds).");
                break;
            case 2:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 7 year olds).");
                break;
            case 3:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 9 year olds).");
                break;
            case 4:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 10 year olds).");
                break;
            case 5:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 11 year olds).");
                break;
            case 6:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 12 year olds).");
                break;
            case 7:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 13 year olds).");
                break;
            case 8:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 14 year olds).");
                break;
            case 9:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 15 year olds).");
                break;
            case 10:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 16 year olds).");
                break;
            case 11:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 17 year olds).");
                break;
            case 12:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 18 year olds).");
                break;
            case 13:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 24 year olds).");
                break;
            case 14:
                System.out.println("Coleman–Liau index: " + df.format(ColemanLiau()) + " (about 24+ year olds).");
                break;
        }
    }
    public float ageAverage(){
        return (float)(age(AutomatedReadabilityIndex()) + age(FleschKincaidReadability()) + age(SimpleMeasureOfGobbledygook()) + age(ColemanLiau()))/4;
    }
    public int age(float score) {
        int a = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch ( Math.round(score)){
            case 1:
                a = 6;
                break;
            case 2:
                a = 7;
                break;
            case 3:
                a = 8;
                break;
            case 4:
                a = 10;
                break;
            case 5:
                a = 11;
                break;
            case 6:
                a = 12;
                break;
            case 7:
                a = 13;
                break;
            case 8:
                a = 14;
                break;
            case 9:
                a = 15;
                break;
            case 10:
                a = 16;
                break;
            case 11:
                a = 17;
                break;
            case 12:
                a = 18;
                break;
            case 13:
                a = 24;
                break;
            case 14:
                a = 25;
                break;
        }
        return a;
    }



    public float AutomatedReadabilityIndex() {
        score = (float) ((4.71 *  characters / words) + (0.5 *  words / sentences) - 21.43);
        return score;
    }
    public float FleschKincaidReadability() {
        score = (float) ((0.39 *  words / sentences) + (11.8 *  syllables / words) - 15.59);
        return score;
    }
    public float SimpleMeasureOfGobbledygook() {
        float radical = (float) Math.sqrt((float) polysyllables * 30 / sentences);
        score = (float) (1.043 *  radical + 3.1291);
        return score;
    }
    public float ColemanLiau() {
        float L = (float) characters / words * 100;
        float S = (float) sentences / words * 100;
        score = (float) ((0.0588 * L) - (0.296 * S) - 15.8);
        return score;
    }




    public static void main(String[] args) throws FileNotFoundException {
        String
                text = "";
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            text = scanner.nextLine();
        }
        scanner.close();
        new App(text);
    }
}
