package md525515aaea8e1e7b653700744ebd40935;


public class PasswordToggleViewRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.XForms.Android.TextInputLayout.PasswordToggleViewRenderer, Syncfusion.Core.XForms.Android", PasswordToggleViewRenderer.class, __md_methods);
	}


	public PasswordToggleViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PasswordToggleViewRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.XForms.Android.TextInputLayout.PasswordToggleViewRenderer, Syncfusion.Core.XForms.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public PasswordToggleViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == PasswordToggleViewRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.XForms.Android.TextInputLayout.PasswordToggleViewRenderer, Syncfusion.Core.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public PasswordToggleViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PasswordToggleViewRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.XForms.Android.TextInputLayout.PasswordToggleViewRenderer, Syncfusion.Core.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();

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
