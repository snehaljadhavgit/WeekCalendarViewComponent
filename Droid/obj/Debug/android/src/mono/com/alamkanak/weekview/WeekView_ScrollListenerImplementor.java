package mono.com.alamkanak.weekview;


public class WeekView_ScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.ScrollListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFirstVisibleDayChanged:(Ljava/util/Calendar;Ljava/util/Calendar;)V:GetOnFirstVisibleDayChanged_Ljava_util_Calendar_Ljava_util_Calendar_Handler:Com.Alamkanak.Weekview.WeekView/IScrollListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.WeekView+IScrollListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WeekView_ScrollListenerImplementor.class, __md_methods);
	}


	public WeekView_ScrollListenerImplementor ()
	{
		super ();
		if (getClass () == WeekView_ScrollListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.WeekView+IScrollListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFirstVisibleDayChanged (java.util.Calendar p0, java.util.Calendar p1)
	{
		n_onFirstVisibleDayChanged (p0, p1);
	}

	private native void n_onFirstVisibleDayChanged (java.util.Calendar p0, java.util.Calendar p1);

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
