package com.walking.lesson17_enum.task1.answer;

public enum GreetingType {
    HI("Hi","Hello"), BYE("Bye","Good Bye"), HOW_ARE_YOU("How are you","How are you doing"), UNKNOWN(null, "Unknown message");
    private final String keyPhrase;
   private final String answer;

    GreetingType(String keyPhrase, String answer) {
        this.keyPhrase = keyPhrase;
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }

    public static GreetingType findGreetingAnwer(String word) {
        if (word == null)
            return UNKNOWN;

        for ( GreetingType item: GreetingType.values()){
            if(item.keyPhrase.equals(word)){
                return item;
            }
        }

        return UNKNOWN;
    }
}
