
package notepad;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class NotepadGUI extends javax.swing.JFrame {

  String fileName;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    public NotepadGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        NewFile = new javax.swing.JMenuItem();
        OpenFile = new javax.swing.JMenuItem();
        SaveFile = new javax.swing.JMenuItem();
        ExitFile = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        copyTeext = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 630));

        FileMenu.setText("File");

        NewFile.setText("New");
        NewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFileActionPerformed(evt);
            }
        });
        FileMenu.add(NewFile);

        OpenFile.setText("Open");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        FileMenu.add(OpenFile);

        SaveFile.setText("Save");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        FileMenu.add(SaveFile);

        ExitFile.setText("Exit");
        ExitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitFileActionPerformed(evt);
            }
        });
        FileMenu.add(ExitFile);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        EditMenu.add(cutText);

        copyTeext.setText("Copy");
        copyTeext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTeextActionPerformed(evt);
            }
        });
        EditMenu.add(copyTeext);

        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        EditMenu.add(pasteText);

        jMenuBar1.add(EditMenu);

        jMenu7.setText("Format");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("View");
        jMenuBar1.add(jMenu8);

        jMenu9.setText("Help");
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileActionPerformed
        // TODO add your handling code here:
        TextArea.setText("");
        setTitle(fileName);
    }//GEN-LAST:event_NewFileActionPerformed

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        FileDialog fileDialog = new FileDialog(NotepadGUI.this,"Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        if (fileDialog.getFile()!= null){
        fileName = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(fileName);        
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while((line = reader.readLine()) != null){
            sb.append(line + "\n");
            TextArea.setText(sb.toString());
            
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }//GEN-LAST:event_OpenFileActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
            FileDialog fileDialog = new FileDialog(NotepadGUI.this,"Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);
             if (fileDialog.getFile()!= null){
        fileName = fileDialog.getDirectory() + fileDialog.getFile();
                 setTitle(fileName); }
             
             try {
                 FileWriter fileWriter = new FileWriter(fileName);
                 fileWriter.write(TextArea.getText());
                 setTitle(fileName);
                 fileWriter.close();
        } catch (IOException e) {
                 System.out.println("File Not Found");
        }
    }//GEN-LAST:event_SaveFileActionPerformed

    private void ExitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitFileActionPerformed
        // TODO add your handling code here:dsf
        System.exit(0);
    }//GEN-LAST:event_ExitFileActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed
            String cutString = TextArea.getSelectedText();
            StringSelection cutSelection = new StringSelection(cutString);
            clipboard.setContents(cutSelection, cutSelection);
            TextArea.replaceRange("", TextArea.getSelectionStart(), TextArea.getSelectionEnd());
            
                   
    }//GEN-LAST:event_cutTextActionPerformed

    private void copyTeextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTeextActionPerformed
            String copyText = TextArea.getSelectedText();
            StringSelection copySelection = new StringSelection(copyText);
            clipboard.setContents(copySelection, copySelection);

    }//GEN-LAST:event_copyTeextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
        try {
            Transferable pasteText = clipboard.getContents(NotepadGUI.this);
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            TextArea.replaceRange(sel, TextArea.getSelectionStart(), TextArea.getSelectionEnd());
            
            
        } catch (Exception e) {
            System.out.println("Its  Not Working ");
        }
    }//GEN-LAST:event_pasteTextActionPerformed

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
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitFile;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem NewFile;
    private javax.swing.JMenuItem OpenFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenuItem copyTeext;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem pasteText;
    // End of variables declaration//GEN-END:variables
}
