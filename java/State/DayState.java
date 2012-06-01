public class DayState implements State{
    private static DayState singleton = new DayState();
    private DayState(){}
    public static State getInstance(){
	return singleton;
    }
    public void doClock(Context context,int hour){
	if(hour < 9 || hour >=17){
	    context.changeState(NightState.getInstance());
	}else if(hour < 13 && hour >= 12){
	    context.changeState(LunchState.getInstance());
	}
    }
    public void doUse(Context context){
	context.recordLog("金庫使用(昼間)");
    }
    public void doAlarm(Context context){
	context.callSecurityCenter("非常ベル(昼間)");
    }
    public void doPhone(Context context){
	context.callSecurityCenter("通常の会話(昼間)");
    }
    public String toString(){
	return "[昼間]";
    }
}
