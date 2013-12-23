package nl.topicus.wqplot.components.plugins;

public class JQPlotPyramidAxisRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

	private static final JQPlotPyramidAxisRenderer INSTANCE = new JQPlotPyramidAxisRenderer();

	private JQPlotPyramidAxisRenderer()
	{
		super("$.jqplot.PyramidAxisRenderer", JQPlotPyramidAxisRendererResourceReference.get());
	}

	public static JQPlotPyramidAxisRenderer get()
	{
		return INSTANCE;
	}
}
