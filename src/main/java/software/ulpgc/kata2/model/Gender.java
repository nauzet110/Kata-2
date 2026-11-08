package software.ulpgc.kata2.model;

public enum Gender {
    male,female;

    public static Gender from(String s){
        if ( s == null ||s.isEmpty()) return null;
        try{
            return Gender.valueOf(s.trim());
        } catch (IllegalArgumentException e){
            return null;
        }
    }
}
