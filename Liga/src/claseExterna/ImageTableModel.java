package claseExterna;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marco
 */
public class ImageTableModel extends DefaultTableModel {
    private List<Image> images = new ArrayList<>();

    /**
     *
     * @param image
     */
    public void addImage(Image image) {
        images.add(image);
        fireTableRowsInserted(images.size() - 1, images.size() - 1);
    }

    /**
     *
     * @param index
     */
    public void removeImage(int index) {
        images.remove(index);
        fireTableRowsDeleted(index, index);
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumnCount() {
        return super.getColumnCount() + 1; // Incrementa el número de columnas en 1 para la columna de imágenes
    }

    /**
     *
     * @param columnIndex
     * @return
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == getColumnCount() - 1) { // Última columna es la columna de imágenes
            return ImageIcon.class;
        }
        return super.getColumnClass(columnIndex);
    }

    /**
     *
     * @param row
     * @param column
     * @return
     */
    @Override
    public Object getValueAt(int row, int column) {
        if (column == getColumnCount() - 1) { // Última columna es la columna de imágenes
            return new ImageIcon(images.get(row));
        }
        return super.getValueAt(row, column);
    }
}
