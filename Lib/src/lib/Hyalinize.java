/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.awt.*;
import javax.swing.table.*;
import javax.swing.*;

public class Hyalinize {
    JTable j=null;
    JScrollPane jsp=null;
    Hyalinize(JTable j,JScrollPane jsp){
        this.j=j;
        this.jsp=jsp;
        j.setOpaque(false);   //将表格主题设置为透明
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();   //初始化渲染器,用于将表格单元格内设为透明
        render.setOpaque(false);   //将渲染器设置为透明
        j.setDefaultRenderer(Object.class, render);     //将渲染器导入表格主体
        Dimension viewSize = new Dimension();    //初始化尺寸控制构件
        viewSize.width = j.getColumnModel().getTotalColumnWidth();  //获取合适的表格宽度
        viewSize.height = 10*j.getRowHeight();    //获取合适的表格高度
        j.setPreferredScrollableViewportSize(viewSize);  //将设置好的显示范围导入表格
        jsp.getViewport().setOpaque(false);    //将JScrollPane框架设为透明
        jsp.setOpaque(false);         //将JScrollPane主体设为透明
        jsp.setViewportView(j);       //将表格加入修改过的JScrollPane
        JTableHeader header = j.getTableHeader();   //获取表格表头
        header.setPreferredSize(new Dimension(30, 26));    //套用已经设置好的显示范围
        header.setOpaque(false);        //将表头设为透明
        header.getTable().setOpaque(false);   
        header.setDefaultRenderer(render);  //将渲染器导入表头
        TableCellRenderer headerRenderer = header.getDefaultRenderer();  
        if (headerRenderer instanceof JLabel)   // 将表头单元格内设为透明
        {  
            ((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);   
            ((JLabel) headerRenderer).setOpaque(false);   
        }       
        jsp.setColumnHeaderView(j.getTableHeader());
        jsp.getColumnHeader().setOpaque(false);
    }
}
