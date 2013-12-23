package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotPyramidRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -8778685814282031382L;

	private static JQPlotPyramidRendererResourceReference INSTANCE =
		new JQPlotPyramidRendererResourceReference();

	private JQPlotPyramidRendererResourceReference()
	{
		super(JQPlotPyramidRendererResourceReference.class, "jqplot.pyramidRenderer.js");
	}

	public static JQPlotPyramidRendererResourceReference get()
	{
		return INSTANCE;
	}
}
