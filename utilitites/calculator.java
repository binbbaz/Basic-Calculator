/*     */ package utilitites;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class calculator extends JFrame {
/*  12 */   String check = ""; String temp; private JButton clear; private JButton div; private JButton eight; private JButton equal; private JButton five; private JButton four; private JScrollPane jScrollPane1; private JTextArea jTextArea1; private JButton minus; private JButton multiply; private JButton nine; private JButton one; private JButton plus; private JButton seven; private JButton six; private JButton three; private JButton two; private JButton zero; private void initComponents() { this.jScrollPane1 = new JScrollPane(); this.jTextArea1 = new JTextArea(); this.two = new JButton(); this.three = new JButton(); this.four = new JButton(); this.five = new JButton(); this.six = new JButton(); this.seven = new JButton(); this.eight = new JButton(); this.nine = new JButton(); this.zero = new JButton(); this.equal = new JButton(); this.plus = new JButton(); this.minus = new JButton(); this.multiply = new JButton(); this.div = new JButton(); this.one = new JButton(); this.clear = new JButton(); setDefaultCloseOperation(3); this.jScrollPane1.setHorizontalScrollBarPolicy(31); this.jScrollPane1.setVerticalScrollBarPolicy(21); this.jTextArea1.setColumns(20); this.jTextArea1.setEditable(false); this.jTextArea1.setRows(5); this.jScrollPane1.setViewportView(this.jTextArea1); this.two.setText("2"); this.two.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.twoActionPerformed(evt); } }
/*     */       ); this.three.setText("3"); this.three.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.threeActionPerformed(evt); } }
/*     */       ); this.four.setText("4"); this.four.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.fourActionPerformed(evt); } }
/*     */       ); this.five.setText("5"); this.five.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.fiveActionPerformed(evt); } }
/*     */       ); this.six.setText("6"); this.six.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.sixActionPerformed(evt); } }
/*  17 */       ); this.seven.setText("7"); this.seven.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.sevenActionPerformed(evt); } }); this.eight.setText("8"); this.eight.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.eightActionPerformed(evt); } }); this.nine.setText("9"); this.nine.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.nineActionPerformed(evt); } }); this.zero.setText("0"); this.zero.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.zeroActionPerformed(evt); } }); this.equal.setText("="); this.equal.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.equalActionPerformed(evt); } }); this.plus.setText("+"); this.plus.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.plusActionPerformed(evt); } }); this.minus.setText("-"); this.minus.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.minusActionPerformed(evt); } }); this.multiply.setText("*"); this.multiply.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.multiplyActionPerformed(evt); } }); this.div.setText("/"); this.div.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.divActionPerformed(evt); } }); this.one.setText("1"); this.one.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.oneActionPerformed(evt); } }); this.clear.setText("c"); this.clear.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) { calculator.this.clearActionPerformed(evt); } }); GroupLayout layout = new GroupLayout(getContentPane()); getContentPane().setLayout(layout); layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.four).addComponent(this.seven).addComponent(this.zero).addComponent(this.one)).addGap(14, 14, 14).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.eight).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.nine)).addGroup(layout.createSequentialGroup().addComponent(this.two).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.three)).addGroup(layout.createSequentialGroup().addComponent(this.five).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.six)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.clear).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.equal))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.minus, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.div, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.multiply, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addComponent(this.plus)).addContainerGap())); layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jScrollPane1, -2, 24, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.two, -1, 33, 32767).addComponent(this.three, -1, 33, 32767).addComponent(this.one, -1, 33, 32767)).addComponent(this.plus, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.four, -2, 33, -2).addComponent(this.five, -2, 33, -2).addComponent(this.six, -2, 33, -2).addComponent(this.minus, -2, 33, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.seven, -2, 33, -2).addComponent(this.eight, -2, 33, -2).addComponent(this.nine, -2, 33, -2).addComponent(this.multiply, -2, 33, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.zero, -2, 33, -2).addComponent(this.equal, -2, 33, -2).addComponent(this.div, -2, 33, -2).addComponent(this.clear, -2, 33, -2)).addGap(0, 9, 32767))); pack(); } public double sum(String beforePlus, String afterPlus) { double num1 = Double.parseDouble(beforePlus); double num2 = Double.parseDouble(afterPlus); return num1 + num2; } public double minus(String beforeMinus, String afterMinus) { double num1 = Double.parseDouble(beforeMinus); double num2 = Double.parseDouble(afterMinus); return num1 - num2; } public double multiply(String beforeMultiply, String afterMultiply) { double num1 = Double.parseDouble(beforeMultiply); double num2 = Double.parseDouble(afterMultiply); return num1 * num2; } public calculator() { super("calculator");
/
/*     */ 
/*     */     
/* 340 */     this.temp = ""; initComponents(); }
/*     */   public double divide(String beforeDivide, String afterDivide) { double num1 = Double.parseDouble(beforeDivide); double num2 = Double.parseDouble(afterDivide); return num1 / num2; }
/*     */   private void sevenActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/* 343 */   private void eightActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); } private void zeroActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); } private void plusActionPerformed(ActionEvent evt) { this.check = "+";
/* 344 */     this.temp = this.jTextArea1.getText();
/* 345 */     this.jTextArea1.setText(""); } private void equalActionPerformed(ActionEvent evt) { double answer1, answer2, answer3, answer4; switch (this.check) { case "+": answer1 = sum(this.temp, this.jTextArea1.getText()); this.jTextArea1.setText(answer1 + ""); return;case "*": answer2 = multiply(this.temp, this.jTextArea1.getText()); this.jTextArea1.setText(answer2 + ""); return;case "/": answer3 = divide(this.temp, this.jTextArea1.getText()); this.jTextArea1.setText(answer3 + ""); return;case "-": answer4 = minus(this.temp, this.jTextArea1.getText()); this.jTextArea1.setText(answer4 + ""); return; }  this.jTextArea1.setText(this.jTextArea1.getText()); } private void oneActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); } private void twoActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); } private void threeActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/*     */   private void fourActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/*     */   private void fiveActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/*     */   private void sixActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/*     */   private void nineActionPerformed(ActionEvent evt) { this.jTextArea1.setText(this.jTextArea1.getText() + evt.getActionCommand()); }
/* 350 */   private void minusActionPerformed(ActionEvent evt) { this.check = "-";
/* 351 */     this.temp = this.jTextArea1.getText();
/* 352 */     this.jTextArea1.setText(""); }
/*     */ 
/*     */ 
/*     */   
/*     */   private void multiplyActionPerformed(ActionEvent evt) {
/* 357 */     this.check = "*";
/* 358 */     this.temp = this.jTextArea1.getText();
/* 359 */     this.jTextArea1.setText("");
/*     */   }
/*     */ 
/*     */   
/*     */   private void divActionPerformed(ActionEvent evt) {
/* 364 */     this.check = "/";
/* 365 */     this.temp = this.jTextArea1.getText();
/* 366 */     this.jTextArea1.setText("");
/*     */   }
/*     */ 
/*     */   
/*     */   private void clearActionPerformed(ActionEvent evt) {
/* 371 */     this.jTextArea1.setText("");
/*     */   }
/*     */ 

/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 388 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 389 */         if ("Nimbus".equals(info.getName())) {
/* 390 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 394 */     } catch (ClassNotFoundException ex) {
/* 395 */       Logger.getLogger(calculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 396 */     } catch (InstantiationException ex) {
/* 397 */       Logger.getLogger(calculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 398 */     } catch (IllegalAccessException ex) {
/* 399 */       Logger.getLogger(calculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 400 */     } catch (UnsupportedLookAndFeelException ex) {
/* 401 */       Logger.getLogger(calculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 

/*     */     
/* 408 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 411 */             (new calculator()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\ABAS\Documents\old\documents\Documents\Calculator.jar\\utilitites\calculator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */