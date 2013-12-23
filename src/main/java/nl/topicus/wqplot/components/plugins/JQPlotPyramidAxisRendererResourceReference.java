package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotPyramidAxisRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = 747684293353212031L;

	private static JQPlotPyramidAxisRendererResourceReference INSTANCE =
		new JQPlotPyramidAxisRendererResourceReference();

	private JQPlotPyramidAxisRendererResourceReference()
	{
		super(JQPlotPyramidAxisRendererResourceReference.class, "jqplot.pyramidAxisRenderer.js");
	}

	public static JQPlotPyramidAxisRendererResourceReference get()
	{
		return INSTANCE;
	}
}
