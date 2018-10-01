package mono.com.alamkanak.weekview;


public class WeekView_EventClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.EventClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEventClick:(Lcom/alamkanak/weekview/WeekViewEvent;Landroid/graphics/RectF;)V:GetOnEventClick_Lcom_alamkanak_weekview_WeekViewEvent_Landroid_graphics_RectF_Handler:Com.Alamkanak.Weekview.WeekView/IEventClickListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.WeekView+IEventClickListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WeekView_EventClickListenerImplementor.class, __md_methods);
	}


	public WeekView_EventClickListenerImplementor ()
	{
		super ();
		if (getClass () == WeekView_EventClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.WeekView+IEventClickListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onEventClick (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1)
	{
		n_onEventClick (p0, p1);
	}

	private native void n_onEventClick (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1);

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
