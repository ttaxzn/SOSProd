package Production;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class SosGuiTest {

    private SosGui sosGui;

    @Before
    public void setUp() throws Exception {
        sosGui = new SosGui();
    }

    @After
    public void tearDown() throws Exception {
        sosGui.dispose();
    }

    @Test
    public void testSimpleGameSelectedByDefault() {
        JRadioButton simpleGameButton = (JRadioButton) sosGui.getContentPane().getComponent(1);
        assertTrue(simpleGameButton.isSelected());
    }

  

   

    @Test
    public void testHumanBlueSelectedByDefault() {
        JRadioButton humanBlueButton = (JRadioButton) sosGui.getContentPane().getComponent(6);
        assertTrue(humanBlueButton.isSelected());
    }

    @Test
    public void testBlueSymbolSelectedByDefault() {
        JRadioButton blueSButton = (JRadioButton) sosGui.getContentPane().getComponent(8);
        assertTrue(blueSButton.isSelected());
    }

   

    @Test
    public void testRedSymbolSelectedByDefault() {
        JRadioButton redSButton = (JRadioButton) sosGui.getContentPane().getComponent(15);
        assertTrue(redSButton.isSelected());
    }

   

}
