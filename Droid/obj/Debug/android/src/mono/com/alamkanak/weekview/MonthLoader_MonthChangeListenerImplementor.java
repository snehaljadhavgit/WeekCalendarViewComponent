package mono.com.alamkanak.weekview;


public class MonthLoader_MonthChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.alamkanak.weekview.MonthLoader.MonthChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMonthChange:(II)Ljava/util/List;:GetOnMonthChange_IIHandler:Com.Alamkanak.Weekview.MonthLoader/IMonthChangeListenerInvoker, BindingsWeekView\n" +
			"";
		mono.android.Runtime.register ("Com.Alamkanak.Weekview.MonthLoader+IMonthChangeListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MonthLoader_MonthChangeListenerImplementor.class, __md_methods);
	}


	public MonthLoader_MonthChangeListenerImplementor ()
	{
		super ();
		if (getClass () == MonthLoader_MonthChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Alamkanak.Weekview.MonthLoader+IMonthChangeListenerImplementor, BindingsWeekView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


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
