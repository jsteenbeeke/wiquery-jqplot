package nl.topicus.wqplot.components.plugins;

public class JQPlotPyramidGridRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

	private static final JQPlotPyramidGridRenderer INSTANCE = new JQPlotPyramidGridRenderer();

	private JQPlotPyramidGridRenderer()
	{
		super("$.jqplot.PyramidGridRenderer", JQPlotPyramidGridRendererResourceReference.get());
	}

	public static JQPlotPyramidGridRenderer get()
	{
		return INSTANCE;
	}
}
