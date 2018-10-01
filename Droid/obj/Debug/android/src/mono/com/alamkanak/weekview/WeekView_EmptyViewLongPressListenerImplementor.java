package mono.com.alamkanak.weekview;


public class WeekView_EmptyViewLongPressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.EmptyViewLongPressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEmptyViewLongPress:(Ljava/util/Calendar;)V:GetOnEmptyViewLongPress_Ljava_util_Calendar_Handler:Com.Alamkanak.Weekview.WeekView/IEmptyViewLongPressListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.WeekView+IEmptyViewLongPressListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WeekView_EmptyViewLongPressListenerImplementor.class, __md_methods);
	}


	public WeekView_EmptyViewLongPressListenerImplementor ()
	{
		super ();
		if (getClass () == WeekView_EmptyViewLongPressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.WeekView+IEmptyViewLongPressListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onEmptyViewLongPress (java.util.Calendar p0)
	{
		n_onEmptyViewLongPress (p0);
	}

	private native void n_onEmptyViewLongPress (java.util.Calendar p0);

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
