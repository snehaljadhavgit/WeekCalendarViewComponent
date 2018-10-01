package md54b2670f9f7f2635ad33e9386cc6898af;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.WeekView.EventClickListener,
		com.alamkanak.weekview.WeekView.EventLongPressListener,
		com.alamkanak.weekview.MonthLoader.MonthChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onEventClick:(Lcom/alamkanak/weekview/WeekViewEvent;Landroid/graphics/RectF;)V:GetOnEventClick_Lcom_alamkanak_weekview_WeekViewEvent_Landroid_graphics_RectF_Handler:Com.Alamkanak.Weekview.WeekView/IEventClickListenerInvoker, BindingsWeekView\n" +
			"n_onEventLongPress:(Lcom/alamkanak/weekview/WeekViewEvent;Landroid/graphics/RectF;)V:GetOnEventLongPress_Lcom_alamkanak_weekview_WeekViewEvent_Landroid_graphics_RectF_Handler:Com.Alamkanak.Weekview.WeekView/IEventLongPressListenerInvoker, BindingsWeekView\n" +
			"n_onMonthChange:(II)Ljava/util/List;:GetOnMonthChange_IIHandler:Com.Alamkanak.Weekview.MonthLoader/IMonthChangeListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("WeekCalendarViewComponent.Droid.MainActivity, WeekCalendarViewComponent.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("WeekCalendarViewComponent.Droid.MainActivity, WeekCalendarViewComponent.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onEventClick (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1)
	{
		n_onEventClick (p0, p1);
	}

	private native void n_onEventClick (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1);


	public void onEventLongPress (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1)
	{
		n_onEventLongPress (p0, p1);
	}

	private native void n_onEventLongPress (com.alamkanak.weekview.WeekViewEvent p0, android.graphics.RectF p1);


	public java.util.List onMonthChange (int p0, int p1)
	{
		return n_onMonthChange (p0, p1);
	}

	private native java.util.List n_onMonthChange (int p0, int p1);

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
