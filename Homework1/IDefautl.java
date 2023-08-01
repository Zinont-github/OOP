package Homework1;

public interface IDefautl {
    default int even(){
        return 6;
    }
    default int odd(){
        return 24;
    }
}
