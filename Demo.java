import java.applet.Applet; 
import java.awt.*;
//<applet code="demo.class" height=400 width=400></applet>
public class Demo extends Applet 
{ 
Font font = new Font( "Garamond", Font.ITALIC, 18 );
String [] line = { "One potato", "Two potato", "Three potato", "Four"  };
public void paint( Graphics g )
 {
	 super.paint( g );
	g.setFont( font ); 
	FontMetrics fm = g.getFontMetrics( );
	 int textHeight = fm.getHeight( );
	int yPos = textHeight;	
	for ( int k = 0; k < line.length; k++ )
	{
		g.drawString( line[k], 20, yPos );
		 yPos += textHeight;
	}
}
}