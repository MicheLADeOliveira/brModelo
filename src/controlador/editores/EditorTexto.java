/*
 * Copyright (C) 2017 chcan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controlador.editores;

import controlador.Editor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import util.TextLineNumber;

/**
 *
 * @author chcan
 */
public class EditorTexto extends javax.swing.JDialog implements ClipboardOwner {

    public EditorTexto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TextArea = new JTextArea();
        TextLineNumber tln = new TextLineNumber(TextArea);
        tln.setUpdateFont(true);

        scrPrincipal.getViewport().add(TextArea);
        scrPrincipal.setRowHeaderView(tln);
        this.pack();

        getRootPane().registerKeyboardAction(e -> {
            //this.dispose();
            //setResultado(JOptionPane.CANCEL_OPTION);
            setVisible(false);

        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
        getRootPane().registerKeyboardAction(e -> {
            //setResultado(JOptionPane.OK_OPTION);
            setVisible(false);
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

        getRootPane().registerKeyboardAction(e -> {
            btnCopyActionPerformed(null);
        }, KeyStroke.getKeyStroke(KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        setTitle(Editor.fromConfiguracao.getValor("Controler.interface.Titulo.EditorDeCodigo"));
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrPrincipal = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnZmn = new javax.swing.JButton();
        txtZoon = new javax.swing.JTextField();
        btnZma = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCopy = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMargin(new java.awt.Insets(2, 2, 2, 2));

        btnZmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoommenos.png"))); // NOI18N
        btnZmn.setFocusable(false);
        btnZmn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZmn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZmnActionPerformed(evt);
            }
        });
        jToolBar1.add(btnZmn);

        txtZoon.setEditable(false);
        txtZoon.setText("12");
        jToolBar1.add(txtZoon);

        btnZma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btnZma.setFocusable(false);
        btnZma.setHideActionText(true);
        btnZma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZmaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnZma);
        jToolBar1.add(jSeparator1);

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/copy.png"))); // NOI18N
        btnCopy.setFocusable(false);
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cpdim_cp.png"))); // NOI18N
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopy);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_salvarc.png"))); // NOI18N
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalvar);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR"); // NOI18N
        btnFechar.setText(bundle.getString("MC.btnFchar")); // NOI18N
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFechar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFechar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(scrPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        StringSelection vai = new StringSelection(TextArea.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(vai, this);
    }//GEN-LAST:event_btnCopyActionPerformed

    int tamFonte = 12;

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnZmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZmnActionPerformed
        tamFonte--;
        reFont();
    }//GEN-LAST:event_btnZmnActionPerformed

    private void btnZmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZmaActionPerformed
        tamFonte++;
        reFont();
    }//GEN-LAST:event_btnZmaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        File arq = util.Dialogos.ShowDlgSaveAsAny(this.getRootPane(), "");
        if (arq == null) {
            return;
        }
        if (arq.exists()) {
            if (util.Dialogos.ShowMessageConfirm(getRootPane(), Editor.fromConfiguracao.getValor("Controler.MSG_QUESTION_REWRITE")) != JOptionPane.YES_OPTION) {
                return;
            }
        }
        try {
            FileWriter fw = new FileWriter(arq.getAbsoluteFile(), true);
            TextArea.write(fw);
        } catch (IOException iOException) {
            util.BrLogger.Logger("ERROR_DIAGRAMA_SAVE_ANY", iOException.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnZma;
    private javax.swing.JButton btnZmn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane scrPrincipal;
    private javax.swing.JTextField txtZoon;
    // End of variables declaration//GEN-END:variables

    public JTextArea TextArea = null;

    public JTextArea getTextArea() {
        return TextArea;
    }

    public String getTexto() {
        return TextArea.getText();
    }

    public void setTexto(String texto) {
        this.TextArea.setText(texto);
    }

    private void reFont() {
        if (tamFonte > 72) {
            tamFonte = 72;
        }
        if (tamFonte < 1) {
            tamFonte = 1;
        }
        Font f = TextArea.getFont();
        TextArea.setFont(new Font(f.getFamily(), f.getStyle(), tamFonte));
        txtZoon.setText(String.valueOf(tamFonte));
    }

    @Override
    public void lostOwnership(Clipboard clpbrd, Transferable t) {
        //
    }

}