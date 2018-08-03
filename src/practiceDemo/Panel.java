package practiceDemo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	public static void main(String[] args) {
		
		Panel a=new Panel();
		a.setSize(500,500);//设置窗体大小
		
		
		
		
		JPanel panel_main=new JPanel();
		JPanel toolSelectPanel = new JPanel();  
        toolSelectPanel.setBackground(Color.green);  
        panel_main.add(toolSelectPanel, new GBC(0,0,2,1).  
                     setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));
        JPanel toolConcretePanel = new JPanel();  
        toolConcretePanel.setBackground(Color.YELLOW);  
        panel_main.add(toolConcretePanel,new GBC(0,1).  
                     setFill(GBC.BOTH).setIpad(70, 90).setWeight(0, 100));
        JPanel drawPanel = new JPanel();  
        drawPanel.setBackground(Color.WHITE);
        panel_main.add(drawPanel,new GBC(1,1).setFill(GBC.BOTH));
        JPanel colorPanel = new JPanel();  
        colorPanel.setBackground(Color.LIGHT_GRAY);
        panel_main.add(colorPanel,new GBC(0,2,2,1).  
                setFill(GBC.BOTH).setIpad(200,50).setWeight(100, 0));
        JPanel statePanel = new JPanel();  
        statePanel.setBackground(Color.CYAN);  
        panel_main.add(statePanel,new GBC(0,3,2,1).  
                setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 0));
        
		
		a.setVisible(true);
        
        
        
        
	}
	
	
	
	
	
	
	private void addGridBagPanes() {  
        //上侧的工具选择面板  
        JPanel toolSelectPanel = new JPanel();  
        toolSelectPanel.setBackground(Color.green);  
        this.add(toolSelectPanel, new GBC(0,0,2,1).  
                     setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));  
        //左侧的具体工具面板  
        JPanel toolConcretePanel = new JPanel();  
        toolConcretePanel.setBackground(Color.YELLOW);  
        this.add(toolConcretePanel,new GBC(0,1).  
                     setFill(GBC.BOTH).setIpad(70, 90).setWeight(0, 100));  
        //右侧的绘图面板  
        JPanel drawPanel = new JPanel();  
        drawPanel.setBackground(Color.WHITE);  
        this.add(drawPanel,new GBC(1,1).setFill(GBC.BOTH));  
        //下侧的颜色选择面板  
        JPanel colorPanel = new JPanel();  
        colorPanel.setBackground(Color.LIGHT_GRAY);  
        this.add(colorPanel,new GBC(0,2,2,1).  
                     setFill(GBC.BOTH).setIpad(200,50).setWeight(100, 0));  
        //下侧的状态面板  
        JPanel statePanel = new JPanel();  
        statePanel.setBackground(Color.CYAN);  
        this.add(statePanel,new GBC(0,3,2,1).  
                      setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 0));  
    }  
}
