
package TaskMaster;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskManager extends javax.swing.JFrame {

    ArrayList list;
    ListIterator li;
    int curtask, tottask;
    task t;
    
    
    public TaskManager() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask=0;
        tottask=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltottasks = new javax.swing.JLabel();
        lblcurtask = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnfullback = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnforward = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnutasks = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JMenuItem();
        mnuafter = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Description:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jLabel3.setText("Current Task");

        jLabel5.setText("Total Tasks");

        lbltottasks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltottasks.setText("1");

        lblcurtask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcurtask.setText("1");
        lblcurtask.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        lblcurtask.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblcurtask.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(lblcurtask, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbltottasks, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcurtask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbltottasks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnfullback.setText("|<");
        btnfullback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfullbackActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnforward.setText(">|");
        btnforward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforwardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnfullback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnprevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addGap(18, 18, 18)
                .addComponent(btnforward)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfullback)
                    .addComponent(btnprevious)
                    .addComponent(btnnext)
                    .addComponent(btnforward))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        mnutasks.setText("Show All Task");
        mnutasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnutasksActionPerformed(evt);
            }
        });
        jMenu1.add(mnutasks);

        mnuexit.setText("Exit");
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setText("Replace this as current task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnuremove.setText("Remove current task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setText("Restore current task to screen");
        jMenu2.add(mnurestore);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnubefore);

        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask==tottask) return;
        curtask++;
        lblcurtask.setText("" + curtask);
        li.next();
        li.next();
        t =(task)li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnfullbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfullbackActionPerformed
         if(curtask==0) {
             return;
         }
        while(li.hasPrevious()){
        t =(task)li.previous();
        }
        
        curtask=1;
        
        lblcurtask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        
    }//GEN-LAST:event_btnfullbackActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
       if(tottask==0)return;
       
       li.next();
       
     
       
       li.remove();
       tottask--;
       lbltottasks.setText(""+tottask);
       
       if(tottask==0){
           txtname.setText("");
           txtdesc.setText("");
           curtask=0;
           lblcurtask.setText("n/a");
           return;
       }
       
       else if(curtask>1){
           t =(task)li.previous();
           curtask--;
           lblcurtask.setText("" + curtask);
       }
       
       else{
           li.next();
           t=(task) li.previous();
       }
       txtname.setText(t.getName());
       txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        task t = new task(nm, d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if(tottask>0) li.next();
        
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lbltottasks.setText("" + tottask);
        lblcurtask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task added");
        
    }//GEN-LAST:event_mnuafterActionPerformed

    private void btnforwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforwardActionPerformed
        if(curtask==tottask) {
            return;
        }
        while(li.hasNext()){
             li.next();
        }
          
        t =(task)li.previous();
        curtask=tottask;
        
        lblcurtask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        
    }//GEN-LAST:event_btnforwardActionPerformed

    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
        if(tottask==0){
            JOptionPane.showMessageDialog(this, "No task to replace this with, use insert instead");
            return;
        }
        
        String nm = txtname.getText();
        String d = txtdesc.getText();
        task t = new task(nm,d);
        
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        li.next();
        li.set(t);
        li.previous();
        
    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnutasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnutasksActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t=(task)list.get(i);
            result +="TASK " + (i+1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnutasksActionPerformed

    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
         String nm = txtname.getText();
        String d = txtdesc.getText();
        task t = new task(nm, d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if(tottask>0) {
            li.previous();
        }
        
        
        
        li.add(t);
        li.previous();
        
        if(curtask==0){
            curtask++;
        }
        tottask++;
        lbltottasks.setText("" + tottask);
        lblcurtask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task added");
        
    }//GEN-LAST:event_mnubeforeActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
       if(curtask==1) return;
        curtask--;
        lblcurtask.setText("" + curtask);
        t = (task)li.previous(); 
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnpreviousActionPerformed

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
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnforward;
    private javax.swing.JButton btnfullback;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcurtask;
    private javax.swing.JLabel lbltottasks;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnutasks;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
