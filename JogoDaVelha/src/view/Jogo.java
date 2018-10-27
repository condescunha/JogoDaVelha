/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author arauj
 */
public class Jogo extends javax.swing.JFrame {

    private boolean ehX = true;

    /**
     * Método que adiciona o valor X ou O no rótulo.
     *
     * @param label iremos escrever os texto X ou O.
     */
    public void adicionarOpcao(JLabel label) {

        /* Verifica se o texto do label está vazio, pois o mesmo só pode receber o texto uma vez. */
        if (label.getText().equals("")) {

            /* Se for a vez do jogador X, então irá escrever X no label. */
            if (ehX) {
                label.setText("X");
            } else {
                /* Senão é a vez do jogador O, então irá escrever O no label. */
                label.setText("O");
            }

            /* Depois de imprimir o texto no label troca a vez do jogador. */
            ehX = !ehX;
            verificarSeGanhouOuEmpatou();
        }
    }

    public void verificarSeGanhouOuEmpatou() {
        String vencedor = "";

        /* Verifica se toda a primeira linha está marcada com o mesmo texto. */
        if (!jLabel11.getText().equals("") && jLabel11.getText().equals(jLabel12.getText()) && jLabel11.getText().equals(jLabel13.getText())) {
            vencedor = jLabel11.getText();

            /* Verifica se toda a segunda linha está marcada com o mesmo texto. */
        } else if (!jLabel21.getText().equals("") && jLabel21.getText().equals(jLabel22.getText()) && jLabel21.getText().equals(jLabel23.getText())) {
            vencedor = jLabel21.getText();

            /* Verifica se toda a terceira linha está marcada com o mesmo texto. */
        } else if (!jLabel31.getText().equals("") && jLabel31.getText().equals(jLabel32.getText()) && jLabel31.getText().equals(jLabel33.getText())) {
            vencedor = jLabel31.getText();

            /* Verifica se toda a primeira coluna está marcada com o mesmo texto.*/
        } else if (!jLabel11.getText().equals("") && jLabel11.getText().equals(jLabel21.getText()) && jLabel11.getText().equals(jLabel31.getText())) {
            vencedor = jLabel11.getText();

            /* Verifica se toda a segunda coluna está marcada com o mesmo texto.*/
        } else if (!jLabel12.getText().equals("") && jLabel12.getText().equals(jLabel22.getText()) && jLabel12.getText().equals(jLabel32.getText())) {
            vencedor = jLabel12.getText();

            /* Verifica se toda a terceica coluna está marcada com o mesmo texto.*/
        } else if (!jLabel13.getText().equals("") && jLabel13.getText().equals(jLabel23.getText()) && jLabel13.getText().equals(jLabel33.getText())) {
            vencedor = jLabel13.getText();

            /* Verifica se toda a diagonal da esquerda para a direita está marcada com o mesmo texto.*/
        } else if (!jLabel11.getText().equals("") && jLabel11.getText().equals(jLabel22.getText()) && jLabel11.getText().equals(jLabel33.getText())) {
            vencedor = jLabel11.getText();

            /* Verifica se toda a diagonal da direita para a esquerda está marcada com o mesmo texto.*/
        } else if (!jLabel13.getText().equals("") && jLabel13.getText().equals(jLabel22.getText()) && jLabel13.getText().equals(jLabel31.getText())) {
            vencedor = jLabel13.getText();
        }

        /* Verifica se alguém venceu para enviar uma mensagem de aviso. */
        if (!vencedor.equals("")) {

            /* Manda uma mensagem para a tela. */
            JOptionPane.showMessageDialog(this, vencedor + " venceu \\o/");
            reiniciarJogo();
        } else {
            /* Se ainda não tiver vencedor, verifica se deu empate. Para saber se deu empate verifica se todos os rótulos possuem texto.*/
            if (!jLabel11.getText().equals("") && !jLabel12.getText().equals("") && !jLabel13.getText().equals("")
                    && !jLabel21.getText().equals("") && !jLabel22.getText().equals("") && !jLabel23.getText().equals("")
                    && !jLabel31.getText().equals("") && !jLabel32.getText().equals("") && !jLabel33.getText().equals("")) {

                /* Manda uma mensagem para a tela. */
                JOptionPane.showMessageDialog(this, "empatou :-(");
                reiniciarJogo();
            }
        }
    }

    public void reiniciarJogo() {
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");
        jLabel31.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
    }

    /**
     * Creates new form Jogo
     */
    public Jogo() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setMinimumSize(new java.awt.Dimension(420, 510));
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 110, 60, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 110, 60, 60);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 110, 60, 60);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(80, 200, 60, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(170, 200, 60, 60);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(260, 200, 60, 60);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31);
        jLabel31.setBounds(80, 290, 60, 60);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32);
        jLabel32.setBounds(170, 290, 60, 60);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33);
        jLabel33.setBounds(260, 290, 60, 60);

        jLabelFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 400, 470);

        setSize(new java.awt.Dimension(418, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        adicionarOpcao(jLabel11);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        adicionarOpcao(jLabel12);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        adicionarOpcao(jLabel13);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        adicionarOpcao(jLabel21);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        adicionarOpcao(jLabel22);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        adicionarOpcao(jLabel23);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        adicionarOpcao(jLabel31);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        adicionarOpcao(jLabel32);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        adicionarOpcao(jLabel33);
    }//GEN-LAST:event_jLabel33MouseClicked

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
