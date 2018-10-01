package md54b2670f9f7f2635ad33e9386cc6898af;


public class MainActivity_MyDateTimeInterpreter
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.DateTimeInterpreter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_interpretDate:(Ljava/util/Calendar;)Ljava/lang/String;:GetInterpretDate_Ljava_util_Calendar_Handler:Com.Alamkanak.Weekview.IDateTimeInterpreterInvoker, BindingsWeekView\n" +
			"n_interpretTime:(I)Ljava/lang/String;:GetInterpretTime_IHandler:Com.Alamkanak.Weekview.IDateTimeInterpreterInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("WeekCalendarViewComponent.Droid.MainActivity+MyDateTimeInterpreter, WeekCalendarViewComponent.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity_MyDateTimeInterpreter.class, __md_methods);
	}


	public MainActivity_MyDateTimeInterpreter ()
	{
		super ();
		if (getClass () == MainActivity_MyDateTimeInterpreter.class)
			mono.android.TypeManager.Activate ("WeekCalendarViewComponent.Droid.MainActivity+MyDateTimeInterpreter, WeekCalendarViewComponent.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_MyDateTimeInterpreter (boolean p0)
	{
		super ();
		if (getClass () == MainActivity_MyDateTimeInterpreter.class)
			mono.android.TypeManager.Activate ("WeekCalendarViewComponent.Droid.MainActivity+MyDateTimeInterpreter, WeekCalendarViewComponent.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public java.lang.String interpretDate (java.util.Calendar p0)
	{
		return n_interpretDate (p0);
	}

	private native java.lang.String n_interpretDate (java.util.Calendar p0);


	public java.lang.String interpretTime (int p0)
	{
		return n_interpretTime (p0);
	}

	private native java.lang.String n_interpretTime (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
