package com.example.test4;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Have you travelled to any countries affected with COVID-19 since mid-Dec 2019?",
            "Cough",
            "Fever / A high temperature of over 37.5°C",
            "Shortness of breath (at days 5-7 after having a fever)",
            "Chest pain",
            "Sore throat",
            "Headache",
            "Muscle aches",
            "Vomiting",
            "Diarrhea",
            "Abdominal pain"
    };

    private String mChoices [][] = {
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"}
    };

    private String mCorrectAnswers[] = {
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes",
            "Yes"
    };

    private String mClassify[] = {
            "Safe",
            "Mid Risk",
            "High Risk"
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String getClassify(int a) {
        String state = mClassify[a];
        return state;
    }
}
