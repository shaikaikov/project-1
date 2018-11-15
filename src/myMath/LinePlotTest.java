package myMath;


import java.awt.Color;

import javax.swing.JFrame;

import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.plots.lines.LineRenderer;
import de.erichseifert.gral.ui.InteractivePanel;


public class LinePlotTest extends JFrame {
    public LinePlotTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        Polynom_able pol = new Polynom("0.2x^4-1.5x^3+3.0x^2-1x^1-5");
        Polynom_able pol2 = new Polynom("-0.2x^4+1.5x^3-3.0x^2+1x^1+5");
        System.out.println(pol2.area(-0.932, 4.822, 0.01));
        DataTable data = new DataTable(Double.class, Double.class);
        DataTable data_kizon = new DataTable(Double.class, Double.class);
        for (double x = -2.0; x <= 6.0; x+=0.25) {
            double y = pol.f(x);
            data.add(x, y);
        }
        data_kizon.add(0.25,-5.086);
        XYPlot plot = new XYPlot(data);                  
        plot.add(data_kizon);                                                   ///put red points
        
        data_kizon.add(1.75,-3.72577);
        XYPlot plot1 = new XYPlot(data);                  
        plot1.add(data_kizon);
        
        data_kizon.add(3.75,-6.113);
        XYPlot plot2 = new XYPlot(data);                  
        plot2.add(data_kizon);
        
        
        
        getContentPane().add(new InteractivePanel(plot));
        LineRenderer lines = new DefaultLineRenderer2D();
        plot.setLineRenderers(data, lines);
        Color color = new Color(0.0f, 0.3f, 1.0f);
        Color color_kizon = new Color(1.0f, 0.0f, 0.0f);
        plot.getPointRenderers(data).get(0).setColor(color);
        plot.getLineRenderers(data).get(0).setColor(color);
        plot.getPointRenderers(data_kizon).get(0).setColor(color_kizon);
    }

    public static void main(String[] args) {
        LinePlotTest frame = new LinePlotTest();
        frame.setVisible(true);
    }
    
    
    
    
    
    
    
}