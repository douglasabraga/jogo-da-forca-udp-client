/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cliente.Client;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Douglas Allan Braga
 */
public class Tela_principal extends javax.swing.JFrame {
    //DatagramSocket clientSocket = null;
    static ArrayList<String>  lista;
    int n;
    String[] textoSeparado;
    String frase;

    private Client cliente;
    private Tela_jogo telaJogo;
    
    public Tela_principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpPalavras = new javax.swing.ButtonGroup();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlBotao = new javax.swing.JPanel();
        btnNovoJogo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtCor = new javax.swing.JRadioButton();
        rbtAnimal = new javax.swing.JRadioButton();
        rbtPais = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitulo.setFont(new java.awt.Font("Noto Sans", 0, 25)); // NOI18N
        lblTitulo.setText("JOGO DA FORCA");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(102, 102, 102))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitulo)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnNovoJogo.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnNovoJogo.setText("Novo Jogo");
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotaoLayout = new javax.swing.GroupLayout(pnlBotao);
        pnlBotao.setLayout(pnlBotaoLayout);
        pnlBotaoLayout.setHorizontalGroup(
            pnlBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlBotaoLayout.setVerticalGroup(
            pnlBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotaoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        grpPalavras.add(rbtCor);
        rbtCor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtCor.setMnemonic('1');
        rbtCor.setText("Cor");

        grpPalavras.add(rbtAnimal);
        rbtAnimal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtAnimal.setMnemonic('2');
        rbtAnimal.setText("Animal");
        rbtAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAnimalActionPerformed(evt);
            }
        });

        grpPalavras.add(rbtPais);
        rbtPais.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtPais.setMnemonic('3');
        rbtPais.setText("País");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtCor)
                    .addComponent(rbtAnimal)
                    .addComponent(rbtPais))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rbtCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtPais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(pnlBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
            lista = new ArrayList();
            n = geradorAleatorio();

            if(rbtAnimal.isSelected()){
                listaAnimais();
            }else if(rbtCor.isSelected()){
                listaFrutas();
            }else{
                listaPaises();
            }
            frase = lista.get(n);
            System.out.println("lista: " + lista.get(n));
            

            textoSeparado = frase.split(";");
            
            System.out.println("PALAVRA: " + textoSeparado[0]);
            System.out.println("FRASE: " + textoSeparado[1]);
        try {    
            cliente = new Client(textoSeparado[0]);
        
            
            
        } catch (UnknownHostException ex) {
            System.out.println("Erro de UnknownHostException na classe Inicio: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Erro de IOException na classe Inicio: " + ex.getMessage());
        }
        this.dispose();
        telaJogo = new Tela_jogo(new javax.swing.JFrame(), true);
        telaJogo.receberFrase(textoSeparado[0], textoSeparado[1]);
        telaJogo.setVisible(true);

        
        
    }//GEN-LAST:event_btnNovoJogoActionPerformed

    private void rbtAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.ButtonGroup grpPalavras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotao;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton rbtAnimal;
    private javax.swing.JRadioButton rbtCor;
    private javax.swing.JRadioButton rbtPais;
    // End of variables declaration//GEN-END:variables

    private static int geradorAleatorio(){
        return new Random().nextInt(5);
    }
    
    
    private static void listaAnimais(){
        lista.add("PORCO;Toma banho na lama");
        lista.add("VACA;Faz moo");
        lista.add("PASSARO;Come alpiste");
        lista.add("GATO;Faz miau");
        lista.add("CACHORRO;Faz au au");
    }
    
    private void listaFrutas(){
        lista.add("LARANJA;Cor de abóbora");
        lista.add("MORANGO;Fruta");
        lista.add("ABACATE;Fruta");
        lista.add("MAMÃO;Fruta");
        lista.add("PERA;Fruta");

    }
    
    private void listaPaises(){
        lista.add("BRASIL;País Tropical");
        lista.add("EUA;Tio Sam");
        lista.add("ARGENTINA;Maradona");
        lista.add("CHINA;Pastel de flango");
        lista.add("CUBA;Vai pra...");
    }

}
