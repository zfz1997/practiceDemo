package practiceDemo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutTest extends JFrame {

    private static final long serialVersionUID = 1391949900949468015L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GridBagLayoutTest frame = new GridBagLayoutTest();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private GridBagLayoutTest() {  
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 500, 500);
        setTitle("GridBagLayout布局案例");
        contentPane = new JPanel();
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        contentPane.setLayout(gbl_contentPane);
        
        //上侧的工具选择面板  
        JPanel toolSelectPanel = new JPanel();  
        toolSelectPanel.setBackground(Color.green);  
        contentPane.add(toolSelectPanel, new GBC(0,0,2,1).  
                     setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));  
        //左侧的具体工具面板  
        JPanel toolConcretePanel = new JPanel();  
        toolConcretePanel.setBackground(Color.YELLOW);  
        contentPane.add(toolConcretePanel,new GBC(0,1).  
                     setFill(GBC.BOTH).setIpad(70, 90).setWeight(0, 100));  
        //右侧的绘图面板  
        JPanel drawPanel = new JPanel();  
        drawPanel.setBackground(Color.WHITE);  
        contentPane.add(drawPanel,new GBC(1,1).setFill(GBC.BOTH));  
        //下侧的颜色选择面板  
        JPanel colorPanel = new JPanel();  
        colorPanel.setBackground(Color.LIGHT_GRAY);  
        contentPane.add(colorPanel,new GBC(0,2,2,1).  
                     setFill(GBC.BOTH).setIpad(200,50).setWeight(100, 0));  
        //下侧的状态面板  
        JPanel statePanel = new JPanel();  
        statePanel.setBackground(Color.CYAN);  
        contentPane.add(statePanel,new GBC(0,3,2,1).  
                      setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 0));  
    }  
}
