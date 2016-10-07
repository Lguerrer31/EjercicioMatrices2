/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w8
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String RecibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void HabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void DeshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void LimpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void TablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static int[][] PasarDatosMatriz(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) tabla1.getValueAt(i, j);
            }
        }
        return m;
    }

    public static void LetraB(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1 && i != 0 && i != nf / 2 && i != nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
                if (j == 0 || i == 0 && j != nc - 1 || i == nf / 2 && j != nc - 1 || i == nf - 1 && j != nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraK(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i + (j - 1) == (nf - 1) / 2) || (i - (j - 1) == (nf - 1) / 2) || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraM(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == j && i + j <= nf || i + j == nf - 1 && i <= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraW(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || nf / 2 > j && i == nc - 1 || nf / 2 < j && i == nc - 1 || j == nc / 2 && i >= nf / 2 && i != nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, bd;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        bd = nf / 2;

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 && j != 0 && j != nf - 1 || j == 0 && i <= nf / 2 && i != 0 || (((bd + 1) == i && j != 0 && j != nf - 1)) || j == nc - 1 && i <= nf / 2 && i != 0 || i == j && i > bd) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2 || i == nf - 1 && j < nc / 2 || j == 0 && i >= 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraG(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || i == (nf / 2) || i == nf - 1 || j == nc - 1 && i >= nf / 2 || j == nc - 1 && i == 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraR(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == nf / 2 || j == nc - 1 && j / i >= 2 || i == j && i + j >= nf) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void Figura1(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        if (nf == 5 && nc == 5) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 || i == nf - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 1; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 1 && j <= nc - 2 || i == nf - 2 && j <= nc - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else if (nf == 7 && nc == 7) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 || i == nf - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 1; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 1 && j <= nc - 2 || i == nf - 2 && j <= nc - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 2; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 2 && j <= nc - 3 || i == nf - 3 && j <= nc - 3) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 || i == nf - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 1; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 1 && j <= nc - 2 || i == nf - 2 && j <= nc - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 2; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 2 && j <= nc - 3 || i == nf - 3 && j <= nc - 3) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 0; i < nf; i++) {
                for (int j = 3; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 3 && j <= nc - 4 || i == nf - 4 && j <= nc - 4) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        }
    }

    public static void Figura2(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        if (nf == 5 && nc == 5) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 0 || j == nc - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 1; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 1 && i <= nf - 2 || j == nc - 2 && i <= nf - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else if (nf == 7 && nc == 7) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 0 || j == nc - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 1; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 1 && i <= nf - 2 || j == nc - 2 && i <= nf - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 2; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 2 && i <= nf - 3 || j == nc - 3 && i <= nf - 3) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 0 || j == nc - 1 || i == j) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 1; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 1 && i <= nf - 2 || j == nc - 2 && i <= nf - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 2; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 2 && i <= nf - 3 || j == nc - 3 && i <= nf - 3) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }

            for (int i = 3; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (j == 3 && i <= nf - 4 || j == nc - 4 && i <= nf - 4) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        }
    }

    public static void Figura3(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == nf / 2 || j == nc / 2 || i == (nf / 2 - 1) || j == (nc / 2 - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void Figura4(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        if (nf == 5 && nc == 5) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 && j == nc / 2 || i == nf - 1 && j == nc / 2 || j == 0 && i == nf / 2 || j == nc - 1 && i == nc / 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                    if (i == nf - 2 && j == nc - 2 || i == 1 && j == nc - 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                    if (j == 1 && i == 1 || j == 1 && i == 3) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else if (nf == 7 && nc == 7) {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 && j == nc / 2 || i == nf - 1 && j == nc / 2 || j == 0 && i == nf / 2 || j == nc - 1 && i == nc / 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                    if (i == 1 && j == 2 || i == 2 && j == 1 || i == 4 && j == 1 || i == 5 && j == 2) {
                        tabla2.setValueAt(aux, i, j);
                    }
                    if (j == 4 && i == 1 || j == 4 && i == 5 || i == 4 && j == 5 || i == 2 && j == 5) {
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < nf; i++) {
                for (int j = 0; j < nc; j++) {
                    aux = (int) tabla1.getValueAt(i, j);
                    if (i == 0 && j == nc / 2 || i == nf - 1 && j == nc / 2 || j == 0 && i == nf / 2 || j == nc - 1 && i == nc / 2) {
                        tabla2.setValueAt(aux, i, j);
                    } if (i == 1 && j == 3 || i == 2 && j == 2 || i == 3 && j == 1){
                        tabla2.setValueAt(aux, i, j);
                    } if (i == 1 && j == 5 || i == 2 &&j == 6 || i == 3 && j == 7){
                        tabla2.setValueAt(aux, i, j);
                    } if (i == 5 && j == 1 || i == 6 && j == 2 || i == 7 && j == 3){
                        tabla2.setValueAt(aux, i, j);
                    } if (i == 7 && j == 5 || i == 6 && j == 6 || i == 5 && j == 7){
                        tabla2.setValueAt(aux, i, j);
                    }
                }
            }
        }
    }

}
