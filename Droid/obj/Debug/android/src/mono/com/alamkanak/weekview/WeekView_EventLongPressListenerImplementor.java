package mono.com.alamkanak.weekview;


public class WeekView_EventLongPressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.EventLongPressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEventLongPress:(Lcom/alamkanak/weekview/WeekViewEvent;Landroid/graphics/RectF;)V:GetOnEventLongPress_Lcom_alamkanak_weekview_WeekViewEvent_Landroid_graphics_RectF_Handler:Com.Alamkanak.Weekview.WeekView/IEventLongPressListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.WeekView+IEventLongPressListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WeekView_EventLongPressListenerImplementor.class, __md_methods);
	}


	public WeekView_EventLongPressListenerImplementor ()
	{
		super ();
		if (getClass () == WeekView_EventLongPressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.WeekView+IEventLongPressListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onEventLongPress (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1)
	{
		n_onEventLongPress (p0, p1);
	}

	private native void n_onEventLongPress (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1);

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
