package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotPyramidGridRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = 5940872986301597635L;

	private static JQPlotPyramidGridRendererResourceReference INSTANCE =
		new JQPlotPyramidGridRendererResourceReference();

	private JQPlotPyramidGridRendererResourceReference()
	{
		super(JQPlotPyramidGridRendererResourceReference.class, "jqplot.pyramidGridRenderer.js");
	}

	public static JQPlotPyramidGridRendererResourceReference get()
	{
		return INSTANCE;
	}
}
