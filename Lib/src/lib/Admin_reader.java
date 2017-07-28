package lib;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin_reader extends javax.swing.JPanel {

    public Admin_reader() {
        initComponents();    //构造窗体框架
        setBounds(250,150,900,562);    //设置窗口大小、所在位置
        Hyalinize H=new Hyalinize(jTable1,jScrollPane1);  //使表格透明化
        jTable1.setShowHorizontalLines(false); 
        jTable1.setShowVerticalLines(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "读者号", "读者姓名", "身份证号码", "电话", "住址", "密码", "注册日期"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 300));

        jTextField1.setText("请输入关键字...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 720, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("模糊查找");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("删除");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 310, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("添加");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 440, 170, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 100, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 100, -1));

        jTextField7.setText("000");
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, -1));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("读者号");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("读者姓名");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("身份证号码");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel5.setText("电话");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("住址");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("初始密码（默认000）");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("修改");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 310, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("欢迎你，管理员！");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 180, 110));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/title7.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;   //初始化连接
        AcessDB adb=new AcessDB();   //建立sql数据库连接
        con=adb.ADB();
        Statement st;
        try {
            st = con.createStatement();  //建立数据库连接
            String sql = ""     //查找数据库符合文本框内容的行
                    + "SELECT * FROM READER WHERE rname LIKE '%" 
                    + jTextField1.getText() + "%' OR IDcard LIKE '%" 
                    + jTextField1.getText() + "%' OR tel LIKE '%" 
                    + jTextField1.getText() + "%'";
            a=jTextField1.getText();   //将搜索框内容传输给全局变量a，再传输到各个方法
            ResultSet rs = st.executeQuery(sql);   //执行sql语句并将结果返回
            DefaultTableModel TableModel = (DefaultTableModel) jTable1.getModel();   //初始化表格
            TableModel.setRowCount(0);   //清空表格内容
            while (rs.next()) {      //将搜索结果导入表格
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("rname"), rs.getString("IDcard"), rs.getString("tel"), rs.getString("address"), rs.getString("password"),rs.getString("registertime")});
            }
            rs.close();   //关闭数据库的连接
            st.close();
        } catch (SQLException ex) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

String a="";
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = null;    //初始化连接
        AcessDB adb=new AcessDB();   //建立sql数据库连接
        con=adb.ADB();
        Statement st;
        try {
            st = con.createStatement();    //建立数据库连接
            int i=jTable1.getSelectedRow();     //得到选中行所在的行数
            if(i<0){                       //判断是否已经选中数据
                JOptionPane.showMessageDialog(this, "未选定行");
            }
            else{
            Object o=jTable1.getValueAt(i, 0);       //得到选中行第一格中的内容
            String s=o.toString();
           
            int k = st.executeUpdate("DELETE FROM READER WHERE rno='"+s+"'");    //删除数据库中的相应内容
            
		if (k == 1) {     //判断是否已经删除
                   JOptionPane.showMessageDialog(this, "删除成功");       //弹出提示框
                   jTable1.repaint();
		}
                  st = con.createStatement();
            String sql = "SELECT * FROM READER WHERE rname LIKE '%" + a + "%'";
            ResultSet rs = st.executeQuery(sql);     //执行sql语句并将结果返回
            DefaultTableModel TableModel = (DefaultTableModel) jTable1.getModel();//初始化表格
            TableModel.setRowCount(0);   //清空表格内容
            while (rs.next()) {    //将搜索结果导入表格
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("rname")
                        , rs.getString("IDcard"), rs.getString("tel"), rs.getString("address"), rs.getString("password")
                        ,rs.getString("registertime")});
            }
            }
        } catch (SQLException ex) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con = null;    //初始化连接
        AcessDB adb=new AcessDB();   //建立sql数据库连接
        con=adb.ADB();
        Statement st;
        try {
            st = con.createStatement();     //建立数据库连接
            int j = st.executeUpdate(""      //将新建立的读者信息录入数据库
                    + "INSERT INTO READER(rno,rname,IDcard,tel,address,password,registertime) "
                    + "VALUES('" +jTextField2.getText() + "','" +jTextField4.getText() + "','"
                    +jTextField8.getText() + "','" +jTextField5.getText() + "','" 
                    +jTextField3.getText() + "','" +jTextField7.getText() 
                    + "',CONVERT(varchar(30),GETDATE(),120))");
            if (j == 1) {            //判断sql语句是否执行
			JOptionPane.showMessageDialog(this, "读者信息添加成功");     //弹出提示框
		} 
            st = con.createStatement();       //再次建立与数据库的连接
            String sql = "SELECT * FROM READER WHERE rname LIKE '%" + a + "%'";    //查找数据库符合文本框内容的行   
            ResultSet rs = st.executeQuery(sql);     //执行sql语句并将结果返回
            DefaultTableModel TableModel = (DefaultTableModel) jTable1.getModel();//初始化表格
            TableModel.setRowCount(0);   //清空表格内容
            while (rs.next()) {    //将搜索结果导入表格
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("rname")
                        , rs.getString("IDcard"), rs.getString("tel"), rs.getString("address"), rs.getString("password")
                        ,rs.getString("registertime")});
            }
            st.close();
        } catch (SQLException ex) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }       
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    public String getRow(Object o){
        return (o.toString());
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Connection con = null;    //初始化连接
        AcessDB adb=new AcessDB();   //建立sql数据库连接
        con=adb.ADB();
        Statement st;
        try {
            st = con.createStatement();      //建立数据库连接
           for(int i=0;i<jTable1.getHeight()-1;i++){   //将表格当前行的内容记录
            String[] s=new String[7];
            for(int j=0;j<7;j++){
            s[j]=getRow(jTable1.getValueAt(i, j));
            }
            int k = st.executeUpdate("DELETE FROM READER WHERE rno='"+s[0]+"'");     //执行sql语句，将已更新的数据信息写入数据库
            st = con.createStatement();
            int j = st.executeUpdate("INSERT INTO READER(rno,rname,IDcard,tel,address,password,registertime) VALUES('" +s[0] + "'"
                    + ",'" +s[1] + "','"+s[2] + "','" +s[3] + "','" +s[4] + "','" +s[5] + "','"+s[6] + "')");
          
           }
        } catch (SQLException ex) {
        } catch(java.lang.ArrayIndexOutOfBoundsException e1){
        }finally {
            try {
                con.close();
                JOptionPane.showMessageDialog(this, "读者信息修改成功");   //返回提示框
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
