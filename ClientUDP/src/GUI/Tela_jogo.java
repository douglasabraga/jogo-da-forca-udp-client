/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cliente.Client;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author douglasa
 */
public class Tela_jogo extends javax.swing.JDialog {
    
    private Client cliente;
    private String palavra;
    private String letra;
    private String dica;
    private int erros = 0;
    private List<String> letrasDitas;
    
    
    public Tela_jogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        letrasDitas = new ArrayList();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDica = new javax.swing.JPanel();
        lblFrase = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        txtLetrasSelecionadas = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        txtTentativa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlDica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFrase.setFont(new java.awt.Font("Noto Sans", 0, 50)); // NOI18N
        lblFrase.setForeground(java.awt.Color.red);
        lblFrase.setText("jLabel1");

        javax.swing.GroupLayout pnlDicaLayout = new javax.swing.GroupLayout(pnlDica);
        pnlDica.setLayout(pnlDicaLayout);
        pnlDicaLayout.setHorizontalGroup(
            pnlDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDicaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFrase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDicaLayout.setVerticalGroup(
            pnlDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDicaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblFrase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPalavra.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txtPalavra.setEnabled(false);
        txtPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalavraActionPerformed(evt);
            }
        });

        txtLetrasSelecionadas.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txtLetrasSelecionadas.setEnabled(false);

        btnEnviar.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setText("Letras já selecionadas");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagens/0.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTentativa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPalavra)
                        .addComponent(txtLetrasSelecionadas)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(txtLetrasSelecionadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(imagem)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTentativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        setBounds(0, 0, 545, 429);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalavraActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String concat = "";
        for(int i = 0; i < this.palavra.length(); i++){
            concat = concat.concat("_ ");
        }
        
        this.txtPalavra.setText(concat);
        txtTentativa.requestFocus();
    }//GEN-LAST:event_formComponentShown

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        letra = txtTentativa.getText().toUpperCase();
        this.letrasDitas.add(letra);
        
        txtLetrasSelecionadas.setText(letrasDitas.toString());
        try {    
            cliente = new Client(letra);
            if(!cliente.getValidar()){
                erros++;
            }
            
            switch(erros){
                case 1:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/1.png")));
                    break;
                case 2:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/2.png")));
                    break;
                case 3:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/3.png")));
                    break;
                case 4:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/4.png")));
                    break;
                case 5:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/5.png")));
                    break;
                case 6:
                    imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/6.png")));
                    break;
            }
            
            
            txtPalavra.setText(this.desenhaPalavra(this.palavra));

            //txtPalavra.setText(this.desenhaPalavra(this.palavra));
            
            if(erros == 6){
                JOptionPane.showMessageDialog(this, "VOCÊ PERDEU!!");
                exit(0);
                
            }

            if(verificaVitoria()){
                JOptionPane.showMessageDialog(this, "VOCÊ GANHOU!!");
                exit(0);
            }
            
            

        } catch (UnknownHostException ex) {
            Logger.getLogger(Tela_jogo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tela_jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txtTentativa.setText("");
        
        
    }//GEN-LAST:event_btnEnviarActionPerformed
    public void receberFrase(String palavra, String dica){
        this.palavra = palavra;
        this.dica = dica;
        lblFrase.setText(dica);
        
    }
    
    private boolean verificaVitoria(){
        String concat ="";
        
        for(int i = 0; i < this.txtPalavra.getText().length(); i++){
            if(!String.valueOf(txtPalavra.getText().charAt(i)).equals(" ") && !String.valueOf(txtPalavra.getText().charAt(i)).equals("_")){
                concat = concat.concat(String.valueOf(txtPalavra.getText().charAt(i)));
            }
        }
        
        if(concat.toUpperCase().equals(this.palavra)){
            return true;
        }else{
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JPanel pnlDica;
    private javax.swing.JTextField txtLetrasSelecionadas;
    private javax.swing.JTextField txtPalavra;
    private javax.swing.JTextField txtTentativa;
    // End of variables declaration//GEN-END:variables

    private String desenhaPalavra(String palavra){
        String letras = " ";
        
        for(int i = 0; i < palavra.length(); i++){
            if(letrasDitas.contains(String.valueOf(palavra.charAt(i)))){
                letras = letras.concat(String.valueOf(palavra.charAt(i)).concat(""));
            }else{
                letras = letras.concat("_ ");
            }
        }
        
        return letras;
    }
    
}
