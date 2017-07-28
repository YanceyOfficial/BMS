package lib;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Manager extends JFrame implements ActionListener, ItemListener {
      
    private final CardLayout mycard;//卡片布局
    private final JPanel controlPanel, pCenter;//定义JPanel
    private final JComboBox chooseList;//定义JComboBox
    private final JMenuBar menuBar;//定义菜单栏
    private final JMenu menu;//定义菜单
    private final JMenuItem mainWindow, exit;//定义菜单项：返回主界面、退出

    public Manager() {
        setTitle("管理员模式");//设置标题
        menuBar = new JMenuBar();//新建菜单
        menu = new JMenu("选项");//新建菜单项
        mainWindow = new JMenuItem("返回主界面");//新建菜单项-返回主界面
        mainWindow.addActionListener(this);//监听返回主界面
        exit = new JMenuItem("退出系统");//新建菜单项-退出系统
        exit.addActionListener(this);//监听退出系统
        menu.add(mainWindow);//将菜单项绑定到菜单
        menu.add(exit);//将菜单项绑定到菜单
        menuBar.add(menu);//将菜单绑定到菜单栏
        setJMenuBar(menuBar);//设置菜单栏
        mycard = new CardLayout();//新建卡片布局
        pCenter = new JPanel();//在JPanel新建下拉菜单
        pCenter.setLayout(mycard);//新建卡片布局
        controlPanel = new JPanel();//在JPanel新建controlPanel
        controlPanel.setLayout(new BorderLayout());//边界布局
        chooseList = new JComboBox();//新建下拉菜单
        chooseList.addItem("请点击下拉列表选择");//向下拉菜单中添加菜单项
        chooseList.addItem("图书管理");//向下拉菜单中添加菜单项
        chooseList.addItem("读者管理");//向下拉菜单中添加菜单项
        chooseList.addItem("借书还书");//向下拉菜单中添加菜单项
        chooseList.addItem("逾期未还");//向下拉菜单中添加菜单项
        chooseList.addItemListener(this);//添加子项监听
        controlPanel.add(chooseList, "North");//设置下拉菜单位置
        pCenter.add("0", controlPanel);//调用各下拉菜单项功能
        pCenter.add("1", new Admin_book());//调用各下拉菜单项功能
        pCenter.add("2", new Admin_reader());//调用各下拉菜单项功能
        pCenter.add("3", new Return_lend());//调用各下拉菜单项功能
        pCenter.add("4", new LateNotYet());//调用各下拉菜单项功能
        add(pCenter, "Center");//添加pCenter
        setBounds(250, 150, 900, 562);//设置JFrame 尺寸、位置
        setResizable(false);//设置用户不可更改尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭JFrame
        setVisible(true);//设置可视
        
    }

    public void itemStateChanged(ItemEvent e) {
        int index = chooseList.getSelectedIndex();//索引
        String choice = String.valueOf(index);//将数字换为选项
        mycard.show(pCenter, choice);//显示pCenter
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainWindow) {//如果选择是mainWindow
            mycard.first(pCenter);//进入pCenter
            chooseList.setSelectedIndex(0);//chooseList为初始化选项
        } else if (e.getSource() == exit) {//如果选择是exit
            System.exit(0);//关闭系统
        }
    }
}
