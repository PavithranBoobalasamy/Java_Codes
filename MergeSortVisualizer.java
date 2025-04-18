import java.awt.*;
import javax.swing.*;

public class MergeSortVisualizer extends JPanel {
    private final int[] arr;
    private int highlighted = -1;
    private int comparingLeft = -1, comparingRight = -1;

    public MergeSortVisualizer(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth() / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i == highlighted) g.setColor(Color.WHITE);
            else if (i == comparingLeft || i == comparingRight) g.setColor(Color.BLUE);
            else g.setColor(Color.GREEN);

            g.fillRect(i * width, getHeight() - arr[i], width, arr[i]);
        }
    }

    public void mergeSort(int l, int r) throws InterruptedException {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(l, mid);
            mergeSort(mid + 1, r);
            merge(l, mid, r);
        }
    }

    private void merge(int l, int mid, int r) throws InterruptedException {
        int n = mid - l + 1;
        int m = r - mid;

        int[] leftArray = new int[n];
        int[] rightArray = new int[m];

        for (int x = 0; x < n; x++) leftArray[x] = arr[l + x];
        for (int x = 0; x < m; x++) rightArray[x] = arr[mid + 1 + x];

        int i = 0, j = 0, k = l;
        while (i < n && j < m) {
            comparingLeft = l + i;
            comparingRight = mid + 1 + j;
            Thread.sleep(15);
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i++];
            } else {
                arr[k] = rightArray[j++];
            }
            highlighted = k++;
            repaint();
        }

        while (i < n) {
            arr[k] = leftArray[i++];
            highlighted = k++;
            comparingLeft = -1;
            comparingRight = -1;
            repaint();
            Thread.sleep(15);
        }

        while (j < m) {
            arr[k] = rightArray[j++];
            highlighted = k++;
            comparingLeft = -1;
            comparingRight = -1;
            repaint();
            Thread.sleep(15);
        }

        comparingLeft = -1;
        comparingRight = -1;
        highlighted = -1;
        repaint();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {732, 18, 645, 401, 983, 292, 177, 553, 806, 72, 395, 29, 951, 687, 120, 843, 378, 199, 3, 498,
            617, 928, 314, 752, 841, 266, 509, 738, 640, 336, 164, 442, 780, 886, 72, 131, 957, 23, 675, 591,
            360, 458, 409, 723, 133, 970, 50, 589, 262, 100, 8, 916, 802, 242, 769, 689, 504, 373, 99, 771,
            338, 104, 900, 210, 321, 812, 30, 999, 721, 628, 43, 15, 230, 877, 92, 411, 571, 638, 228, 814,
            97, 301, 61, 734, 320, 250, 123, 991, 604, 180, 56, 937, 314, 85, 744, 812, 370, 419, 285, 149};

        JFrame frame = new JFrame("Merge Sort Visualizer");
        MergeSortVisualizer panel = new MergeSortVisualizer(arr);
        frame.add(panel);
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Thread.sleep(1000);
        panel.mergeSort(0, arr.length - 1);
    }
}
