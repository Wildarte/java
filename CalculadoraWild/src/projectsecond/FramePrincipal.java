
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package projectsecond;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Il2
 */
public class FramePrincipal extends javax.swing.JFrame {
     
    public double result;
    public char ultimaOperacao;
     /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FieldRecebe = new javax.swing.JTextField();
        ButtonSeven = new javax.swing.JButton();
        ButtonEight = new javax.swing.JButton();
        ButtonNine = new javax.swing.JButton();
        ButtonFour = new javax.swing.JButton();
        ButtonFive = new javax.swing.JButton();
        ButtonSix = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonTwo = new javax.swing.JButton();
        ButtonOne = new javax.swing.JButton();
        ButtonZero = new javax.swing.JButton();
        ButtonSomar = new javax.swing.JButton();
        ButtonResult = new javax.swing.JButton();
        ButtonLimpa = new javax.swing.JButton();
        ButtonPonto = new javax.swing.JButton();
        FieldNumbers = new javax.swing.JTextField();
        ButtonSubtrai = new javax.swing.JButton();
        ButtonMult = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraWild");
        setIconImages(null);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        FieldRecebe.setEditable(false);
        FieldRecebe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FieldRecebe.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        FieldRecebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRecebeActionPerformed(evt);
            }
        });
        FieldRecebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldRecebeKeyTyped(evt);
            }
        });

        ButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonSeven.setText("7");
        ButtonSeven.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSevenActionPerformed(evt);
            }
        });

        ButtonEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonEight.setText("8");
        ButtonEight.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEightActionPerformed(evt);
            }
        });

        ButtonNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonNine.setText("9");
        ButtonNine.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNineActionPerformed(evt);
            }
        });

        ButtonFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonFour.setText("4");
        ButtonFour.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourActionPerformed(evt);
            }
        });

        ButtonFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonFive.setText("5");
        ButtonFive.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveActionPerformed(evt);
            }
        });

        ButtonSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonSix.setText("6");
        ButtonSix.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixActionPerformed(evt);
            }
        });

        ButtonThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonThree.setText("3");
        ButtonThree.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonTwo.setText("2");
        ButtonTwo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwoActionPerformed(evt);
            }
        });

        ButtonOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonOne.setText("1");
        ButtonOne.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOneActionPerformed(evt);
            }
        });

        ButtonZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonZero.setText("0");
        ButtonZero.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZeroActionPerformed(evt);
            }
        });

        ButtonSomar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonSomar.setText("+");
        ButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSomarActionPerformed(evt);
            }
        });

        ButtonResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonResult.setText("=");
        ButtonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResultActionPerformed(evt);
            }
        });

        ButtonLimpa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonLimpa.setText("Limpar");
        ButtonLimpa.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpaActionPerformed(evt);
            }
        });

        ButtonPonto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonPonto.setText(",");
        ButtonPonto.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPontoActionPerformed(evt);
            }
        });

        FieldNumbers.setEditable(false);
        FieldNumbers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FieldNumbers.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        FieldNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNumbersActionPerformed(evt);
            }
        });

        ButtonSubtrai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonSubtrai.setText("-");
        ButtonSubtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubtraiActionPerformed(evt);
            }
        });

        ButtonMult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonMult.setText("*");
        ButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultActionPerformed(evt);
            }
        });

        ButtonDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonDiv.setText("/");
        ButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldRecebe)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonZero, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(ButtonPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonSubtrai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonMult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(FieldNumbers, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FieldNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(FieldRecebe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonSubtrai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonDiv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonLimpa)
                    .addComponent(ButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZeroActionPerformed
       FieldRecebe.setText(FieldRecebe.getText()+"0");
       FieldNumbers.setText(FieldNumbers.getText()+"0");
    }//GEN-LAST:event_ButtonZeroActionPerformed

    private void FieldRecebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRecebeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRecebeActionPerformed

    private void ButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSevenActionPerformed
       FieldRecebe.setText(FieldRecebe.getText()+"7");
       FieldNumbers.setText(FieldNumbers.getText()+"7");
    }//GEN-LAST:event_ButtonSevenActionPerformed

    private void ButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEightActionPerformed
        // TODO add your handling code here:
       FieldRecebe.setText(FieldRecebe.getText()+"8");
       FieldNumbers.setText(FieldNumbers.getText()+"8");
    }//GEN-LAST:event_ButtonEightActionPerformed

    private void ButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNineActionPerformed
        // TODO add your handling code here:
        FieldRecebe.setText(FieldRecebe.getText()+"9");
        FieldNumbers.setText(FieldNumbers.getText()+"9");
    }//GEN-LAST:event_ButtonNineActionPerformed

    private void ButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourActionPerformed
        // TODO add your handling code here:
        FieldRecebe.setText(FieldRecebe.getText()+"4");
        FieldNumbers.setText(FieldNumbers.getText()+"4");
    }//GEN-LAST:event_ButtonFourActionPerformed

    private void ButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveActionPerformed
        // TODO add your handling code here:
        FieldRecebe.setText(FieldRecebe.getText()+"5");
        FieldNumbers.setText(FieldNumbers.getText()+"5");
    }//GEN-LAST:event_ButtonFiveActionPerformed

    private void ButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixActionPerformed
        // TODO add your handling code here:
        FieldRecebe.setText(FieldRecebe.getText()+"6");
        FieldNumbers.setText(FieldNumbers.getText()+"6");
    }//GEN-LAST:event_ButtonSixActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
        // TODO add your handling code here:
        FieldRecebe.setText(FieldRecebe.getText()+"3");
        FieldNumbers.setText(FieldNumbers.getText()+"3");
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwoActionPerformed
        // TODO add your handling code here:
       FieldRecebe.setText(FieldRecebe.getText()+"2");
       FieldNumbers.setText(FieldNumbers.getText()+"2");
    }//GEN-LAST:event_ButtonTwoActionPerformed

    private void ButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOneActionPerformed
        // TODO add your handling code here:
       FieldRecebe.setText(FieldRecebe.getText()+"1");
       FieldNumbers.setText(FieldNumbers.getText()+"1");
    }//GEN-LAST:event_ButtonOneActionPerformed

    private void ButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSomarActionPerformed
        // TODO add your handling code here:
        result += Double.parseDouble(FieldRecebe.getText());
        FieldRecebe.setText("");
        FieldNumbers.setText(FieldNumbers.getText()+"+");
        ultimaOperacao = '+';
    }//GEN-LAST:event_ButtonSomarActionPerformed

    private void ButtonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResultActionPerformed
        // TODO add your handling code here:
      /* 
       if(ultimaOperacao == '+'){
            result += Double.parseDouble(FieldRecebe.getText());
            FieldRecebe.setText(String.valueOf(result));
       }else if(ultimaOperacao == '-'){
           result -= Double.parseDouble(FieldRecebe.getText());
            FieldRecebe.setText(String.valueOf(result));
       }else if(ultimaOperacao == '*'){
           result *= Double.parseDouble(FieldRecebe.getText());
            FieldRecebe.setText(String.valueOf(result));
       }else if(ultimaOperacao == '/'){
           result /= Double.parseDouble(FieldRecebe.getText());
            FieldRecebe.setText(String.valueOf(result));
       }
       */
        ScriptEngineManager factory = new ScriptEngineManager();
		
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
		
        // evaluate JavaScript code from String
        Object obj = null;
        try {
            obj = engine.eval(FieldNumbers.getText());
        } catch (ScriptException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        System.out.println (obj); // imprime "1.0"
        System.out.println(obj.getClass()); // imprime "java.lang.Double"
          FieldRecebe.setText(String.valueOf(obj));
    }//GEN-LAST:event_ButtonResultActionPerformed

    private void ButtonLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpaActionPerformed
        // TODO add your handling code here:
        result = 0;
        FieldRecebe.setText("");
        FieldNumbers.setText("");
    }//GEN-LAST:event_ButtonLimpaActionPerformed

    private void ButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPontoActionPerformed
        // TODO add your handling code here:
         FieldRecebe.setText(FieldRecebe.getText()+".");
         FieldNumbers.setText(FieldNumbers.getText()+".");
    }//GEN-LAST:event_ButtonPontoActionPerformed

    private void FieldNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNumbersActionPerformed

    private void ButtonSubtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubtraiActionPerformed
        // TODO add your handling code here:
        result += Double.parseDouble(FieldRecebe.getText());
        FieldRecebe.setText("");
        FieldNumbers.setText(FieldNumbers.getText()+"-");
        ultimaOperacao = '-';
    }//GEN-LAST:event_ButtonSubtraiActionPerformed

    private void ButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultActionPerformed
        // TODO add your handling code here:
        result *= Double.parseDouble(FieldRecebe.getText());
        FieldRecebe.setText("");
        FieldNumbers.setText(FieldNumbers.getText()+"*");
        ultimaOperacao = '*';
    }//GEN-LAST:event_ButtonMultActionPerformed

    private void ButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivActionPerformed
        // TODO add your handling code here:
        result /= Double.parseDouble(FieldRecebe.getText());
        FieldRecebe.setText("");
        FieldNumbers.setText(FieldNumbers.getText()+"/");
        ultimaOperacao = '/';
    }//GEN-LAST:event_ButtonDivActionPerformed

    private void FieldRecebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldRecebeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRecebeKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonEight;
    private javax.swing.JButton ButtonFive;
    private javax.swing.JButton ButtonFour;
    private javax.swing.JButton ButtonLimpa;
    private javax.swing.JButton ButtonMult;
    private javax.swing.JButton ButtonNine;
    private javax.swing.JButton ButtonOne;
    private javax.swing.JButton ButtonPonto;
    private javax.swing.JButton ButtonResult;
    private javax.swing.JButton ButtonSeven;
    private javax.swing.JButton ButtonSix;
    private javax.swing.JButton ButtonSomar;
    private javax.swing.JButton ButtonSubtrai;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ButtonTwo;
    private javax.swing.JButton ButtonZero;
    private javax.swing.JTextField FieldNumbers;
    private javax.swing.JTextField FieldRecebe;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}