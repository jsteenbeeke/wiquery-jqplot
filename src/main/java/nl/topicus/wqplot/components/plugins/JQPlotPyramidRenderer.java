package nl.topicus.wqplot.components.plugins;

public class JQPlotPyramidRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

	private static final JQPlotPyramidRenderer INSTANCE = new JQPlotPyramidRenderer();

	private JQPlotPyramidRenderer()
	{
		super("$.jqplot.PyramidRenderer", JQPlotPyramidRendererResourceReference.get());
	}

	public static JQPlotPyramidRenderer get()
	{
		return INSTANCE;
	}
}
