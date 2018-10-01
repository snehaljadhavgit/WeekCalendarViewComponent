package mono.com.alamkanak.weekview;


public class WeekView_EmptyViewClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.EmptyViewClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEmptyViewClicked:(Ljava/util/Calendar;)V:GetOnEmptyViewClicked_Ljava_util_Calendar_Handler:Com.Alamkanak.Weekview.WeekView/IEmptyViewClickListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.WeekView+IEmptyViewClickListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WeekView_EmptyViewClickListenerImplementor.class, __md_methods);
	}


	public WeekView_EmptyViewClickListenerImplementor ()
	{
		super ();
		if (getClass () == WeekView_EmptyViewClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.WeekView+IEmptyViewClickListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onEmptyViewClicked (java.util.Calendar p0)
	{
		n_onEmptyViewClicked (p0);
	}

	private native void n_onEmptyViewClicked (java.util.Calendar p0);

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
