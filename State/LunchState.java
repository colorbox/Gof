public class LunchState implements State{
    private static LunchState singleton = new LunchState();
    private LunchState(){}
    public static State getInstance(){
	return singleton;
    }
    public void doClock(Context context,int hour){
	if(hour >= 13 || hour < 12){
	    context.changeState(DayState.getInstance());
	}
    }
    public void doUse(Context context){
	context.recordLog("非常:金庫使用(昼間)");
    }
    public void doAlarm(Context context){
	context.callSecurityCenter("非常ベル(昼間)");
    }
    public void doPhone(Context context){
	context.callSecurityCenter("通常の会話(昼間)");
    }
    public String toString(){
	return "[昼食]";
    }
}
