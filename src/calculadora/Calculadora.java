
package calculadora;

import java.awt.Color;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Juanito
 */

public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");


    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cerrar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        btn_Igual = new javax.swing.JButton();
        btn_decimal = new javax.swing.JButton();
        btn_Porcentaje = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Producto = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 22)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(107, 108, 110));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));

        txtResultado.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(36, 37, 38));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/encendido.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 50, 30));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar_blanco.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 23, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Igual.setBackground(new java.awt.Color(30, 197, 109));
        btn_Igual.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btn_Igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_Igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde.png"))); // NOI18N
        btn_Igual.setText("=");
        btn_Igual.setBorderPainted(false);
        btn_Igual.setContentAreaFilled(false);
        btn_Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Igual.setFocusPainted(false);
        btn_Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde.png"))); // NOI18N
        btn_Igual.setSelected(true);
        btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 54, 50));

        btn_decimal.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btn_decimal.setForeground(new java.awt.Color(36, 37, 38));
        btn_decimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_decimal.setText(".");
        btn_decimal.setBorderPainted(false);
        btn_decimal.setContentAreaFilled(false);
        btn_decimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_decimal.setFocusPainted(false);
        btn_decimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_decimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_decimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });
        jPanel2.add(btn_decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 54, 50));

        btn_Porcentaje.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_Porcentaje.setForeground(new java.awt.Color(36, 37, 38));
        btn_Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Porcentaje.setText("%");
        btn_Porcentaje.setBorderPainted(false);
        btn_Porcentaje.setContentAreaFilled(false);
        btn_Porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Porcentaje.setFocusPainted(false);
        btn_Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 54, 50));

        btn_Division.setBackground(new java.awt.Color(30, 197, 109));
        btn_Division.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_Division.setForeground(new java.awt.Color(30, 197, 109));
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Division.setText("/");
        btn_Division.setBorderPainted(false);
        btn_Division.setContentAreaFilled(false);
        btn_Division.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Division.setFocusPainted(false);
        btn_Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 54, 50));

        btn_Producto.setBackground(new java.awt.Color(30, 197, 109));
        btn_Producto.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_Producto.setForeground(new java.awt.Color(30, 197, 109));
        btn_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Producto.setText("X");
        btn_Producto.setBorderPainted(false);
        btn_Producto.setContentAreaFilled(false);
        btn_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Producto.setFocusPainted(false);
        btn_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Producto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Producto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 54, 50));

        btn_Resta.setBackground(new java.awt.Color(30, 197, 109));
        btn_Resta.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btn_Resta.setForeground(new java.awt.Color(30, 197, 109));
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.setBorderPainted(false);
        btn_Resta.setContentAreaFilled(false);
        btn_Resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Resta.setFocusPainted(false);
        btn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 54, 50));

        btn_Suma.setBackground(new java.awt.Color(30, 197, 109));
        btn_Suma.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btn_Suma.setForeground(new java.awt.Color(30, 197, 109));
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.setBorderPainted(false);
        btn_Suma.setContentAreaFilled(false);
        btn_Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Suma.setFocusPainted(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 54, 50));

        btn_C.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_C.setForeground(new java.awt.Color(36, 37, 38));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setBorderPainted(false);
        btn_C.setContentAreaFilled(false);
        btn_C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_press.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 54, 50));

        btn_7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(36, 37, 38));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setContentAreaFilled(false);
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 54, 50));

        btn_8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(36, 37, 38));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setContentAreaFilled(false);
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 54, 50));

        btn_9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(36, 37, 38));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setContentAreaFilled(false);
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 54, 50));

        btn_6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(36, 37, 38));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setContentAreaFilled(false);
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 54, 50));

        btn_5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(36, 37, 38));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setContentAreaFilled(false);
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 54, 50));

        btn_4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(36, 37, 38));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setContentAreaFilled(false);
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 54, 50));

        btn_1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(36, 37, 38));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorderPainted(false);
        btn_1.setContentAreaFilled(false);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 54, 50));

        btn_2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(36, 37, 38));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setContentAreaFilled(false);
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 54, 50));

        btn_3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(36, 37, 38));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setContentAreaFilled(false);
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 54, 50));

        btn_Borrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_Borrar.setForeground(new java.awt.Color(36, 37, 38));
        btn_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Borrar.setText("<-");
        btn_Borrar.setBorderPainted(false);
        btn_Borrar.setContentAreaFilled(false);
        btn_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Borrar.setFocusPainted(false);
        btn_Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_Borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 54, 50));

        btn_0.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(36, 37, 38));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setContentAreaFilled(false);
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_verde_press.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 54, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 310, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
            System.out.println(resultado);
        }catch (Exception e){
            //txtOperacion.setText("ERROR");
        }
    }//GEN-LAST:event_btn_IgualActionPerformed

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decimalActionPerformed
        addNumero(".");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_decimalActionPerformed

    private void btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PorcentajeActionPerformed
        addNumero("%");
        
    }//GEN-LAST:event_btn_PorcentajeActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        addNumero("/");
        
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductoActionPerformed
        addNumero("*");
        
    }//GEN-LAST:event_btn_ProductoActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        addNumero("-");
        
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed
        addNumero("+");
        
    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumero("7");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumero("8");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumero("9");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumero("6");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumero("5");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumero("4");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumero("1");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumero("2");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumero("3");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumero("0");
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_Igual.doClick();
    }//GEN-LAST:event_btn_BorrarActionPerformed

    boolean modoOscuro = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!modoOscuro){
        jButton1.setIcon((new ImageIcon(getClass().getResource("/images/noche.png"))));
        jPanel1.setBackground(Color.decode("#14171e"));
        jPanel2.setBackground(Color.decode("#1a1d24"));
        txtOperacion.setForeground(Color.decode("#efefef"));
        txtResultado.setForeground(Color.decode("#f5f5f5"));
        
        CambiarColorBtn2(btn_Division);
        CambiarColorBtn2(btn_Igual);
        CambiarColorBtn2(btn_Porcentaje);
        CambiarColorBtn2(btn_Resta);
        CambiarColorBtn2(btn_Producto);
        CambiarColorBtn2(btn_Suma);
        CambiarColorBtn2(btn_Borrar);
        CambiarColorBtn2(btn_C);
        
        
        CambiarColorBtn1(btn_1);
        CambiarColorBtn1(btn_2);
        CambiarColorBtn1(btn_3);
        CambiarColorBtn1(btn_4);
        CambiarColorBtn1(btn_5);
        CambiarColorBtn1(btn_6);
        CambiarColorBtn1(btn_7);
        CambiarColorBtn1(btn_8);
        CambiarColorBtn1(btn_9);
        CambiarColorBtn1(btn_0);
        CambiarColorBtn1(btn_decimal);
        cerrar.setIcon(new ImageIcon(getClass().getResource("/images/cerrar_oscuro.png")));
        
        
        btn_Igual.setIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro_verde.png")));
        btn_Igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro_verde.png")));
        btn_Igual.setForeground(Color.decode("#efefef"));
        modoOscuro = true;
        }else{
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    public void addNumero (String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    public void CambiarColorBtn2 (JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro_press.png")));
        btn.setForeground(Color.decode("#efefef"));
        
    }
    public void CambiarColorBtn1 (JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn_oscuro_verde_press.png")));
        btn.setForeground(Color.decode("#efefef"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Porcentaje;
    private javax.swing.JButton btn_Producto;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JToggleButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
