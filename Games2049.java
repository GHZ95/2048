package num.frame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Games2049 extends JFrame {
	JLabel jl2 =null;
	private JPanel contentPane;
	int size = 0;
	List<JButton> jlist = new ArrayList<JButton>();
	// ÅÐ¶ÏÃ»ÓÐÏÔÊ¾jb
	List<JButton> numl = null;
	// ÉÏÏÂÐÐµÄjb
	List<JButton> u1 = new ArrayList<JButton>();
	List<JButton> u2 = new ArrayList<JButton>();
	List<JButton> u3 = new ArrayList<JButton>();
	List<JButton> u4 = new ArrayList<JButton>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games2049 frame = new Games2049();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Games2049() {

		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.lightGray);

		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(280, 15, 100, 44);
		jp.setBackground(Color.gray);
		contentPane.add(jp);

		JLabel jll = new JLabel("Çëµã»÷¿ªÊ¼");
		jll.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		jll.setBounds(120, 200, 153, 100);
		jll.setOpaque(true);
		jll.setBackground(Color.red);
		contentPane.add(jll);

		JButton jb1 = new JButton("¿ªÊ¼");
		jb1.setBounds(198, 460, 83, 20);
		contentPane.add(jb1);

		JButton jb2 = new JButton("ÍË³ö");
		jb2.setBounds(292, 460, 83, 20);
		contentPane.add(jb2);

		JLabel jl1 = new JLabel("²½Êý");
		jl1.setBounds(45, 5, 150, 55);
		jl1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		jp.add(jl1);

		jl2= new JLabel("");
		jl2.setBounds(0, -20, 150, 55);
		jl2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		jp.add(jl2);

		JLabel jl = new JLabel("2048");
		jl.setBounds(15, 5, 150, 55);
		jl.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 50));
		contentPane.add(jl);

		JButton b1 = new JButton("");
		b1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b1.setBounds(10, 87, 84, 83);
		contentPane.add(b1);

		JButton b2 = new JButton("");
		b2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b2.setBounds(104, 87, 84, 83);
		contentPane.add(b2);

		JButton b3 = new JButton("");
		b3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b3.setBounds(198, 87, 84, 83);
		contentPane.add(b3);

		JButton b4 = new JButton("");
		b4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b4.setBounds(292, 87, 84, 83);
		contentPane.add(b4);

		JButton b5 = new JButton("");
		b5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b5.setBounds(10, 180, 84, 83);
		contentPane.add(b5);

		JButton b6 = new JButton("");
		b6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b6.setBounds(104, 180, 84, 83);
		contentPane.add(b6);

		JButton b7 = new JButton("");
		b7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b7.setBounds(198, 180, 84, 83);
		contentPane.add(b7);

		JButton b8 = new JButton("");
		b8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b8.setBounds(292, 180, 84, 83);
		contentPane.add(b8);

		JButton b9 = new JButton("");
		b9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b9.setBounds(10, 273, 84, 83);
		contentPane.add(b9);

		JButton b10 = new JButton("");
		b10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b10.setBounds(104, 273, 84, 83);
		contentPane.add(b10);

		JButton b11 = new JButton("");
		b11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b11.setBounds(198, 273, 84, 83);
		contentPane.add(b11);

		JButton b12 = new JButton("");
		b12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b12.setBounds(292, 273, 84, 83);
		contentPane.add(b12);

		JButton b16 = new JButton("");
		b16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b16.setBounds(292, 366, 84, 83);
		contentPane.add(b16);

		JButton b13 = new JButton("");
		b13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b13.setBounds(10, 366, 84, 83);
		contentPane.add(b13);

		JButton b14 = new JButton("");
		b14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b14.setBounds(104, 366, 84, 83);
		contentPane.add(b14);

		JButton b15 = new JButton("");
		b15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		b15.setBounds(198, 366, 84, 83);
		contentPane.add(b15);

		jlist.add(b1);
		jlist.add(b2);
		jlist.add(b3);
		jlist.add(b4);
		jlist.add(b5);
		jlist.add(b6);
		jlist.add(b7);
		jlist.add(b8);
		jlist.add(b9);
		jlist.add(b10);
		jlist.add(b11);
		jlist.add(b12);
		jlist.add(b13);
		jlist.add(b14);
		jlist.add(b15);
		jlist.add(b16);

		u1.add(b1);
		u1.add(b5);
		u1.add(b9);
		u1.add(b13);
		u2.add(b2);
		u2.add(b6);
		u2.add(b10);
		u2.add(b14);
		u3.add(b3);
		u3.add(b7);
		u3.add(b11);
		u3.add(b15);
		u4.add(b4);
		u4.add(b8);
		u4.add(b12);
		u4.add(b16);
		FrameListener moveListener = new FrameListener();
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);
		jb1.addActionListener((e) -> {
		jll.setVisible(false);	jb1.setText("ÖØÖÃ");		
		jl2.setText("0");	size = 0;
		clear();randomShowF();});
		jb2.addActionListener((e) -> {System.exit(0);	});
		// °´Å¥ÏìÓ¦¼üÅÌ	
		jb1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				checkOver();
				
				String notice = remarkNow();
				switch (e.getKeyCode()) {
				case 37:
					moveLeft();
					break;
				case 38:
					moveUp();
					break;
				case 39:
					moveRight();
					break;
				case 40:
					moveDown();

					break;
				default:
					break;
				}
				if (checkMove(notice)) {
					randomShow();
					size++;
					jl2.setText(size + "");
				}
				setColor();
			}
			});
			}

			public void checkOver() {
				int flag = allFull();
				if (flag == 0) {
					int index = noCase();
			
					if (index == 0) {
						JOptionPane.showMessageDialog(null, "ÓÎÏ·½áÊø0.0", "  ", JOptionPane.PLAIN_MESSAGE);
					}
				}

			}

			public int noCase() {
				int sum = 0;
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < 16; i++) {
					sb.append(jlist.get(i).getText()).append("\t");
				}
				String[] arrs = sb.toString().split("\t");
				int[] arr = new int[16];
				for (int i = 0; i < 16; i++) {
					arr[i] = Integer.parseInt(arrs[i]);
				}
				for (int i = 0; i < 16; i++) {
					if (i < 3) {
						if (arr[i] == arr[i + 1] || arr[i] == arr[i + 4])
							sum = sum + 1;

					} else if (i == 3) {

						if (arr[i] == arr[i - 1] || arr[i] == arr[i + 4])
							sum = sum + 1;
					} else if (i > 3 && i < 7) {

						if (arr[i] == arr[i + 1] || arr[i] == arr[i - 4] || arr[i] == arr[i + 4])
							sum = sum + 1;
					} else if (i == 7) {

						if (arr[i] == arr[i - 1] || arr[i] == arr[i - 4] || arr[i] == arr[i + 4])
							sum = sum + 1;
					} else if (i > 7 && i < 11) {
						if (arr[i] == arr[i + 1] || arr[i] == arr[i - 4] || arr[i] == arr[i + 4])
							sum = sum + 1;
					} else if (i == 11) {
						if (arr[i] == arr[i - 1] || arr[i] == arr[i - 4] || arr[i] == arr[i + 4])
							sum = sum + 1;
					} else if (i > 11 && i < 15) {
						if (arr[i] == arr[i + 1] || arr[i] == arr[i - 4])
							sum = sum + 1;
					} else if (i == 15) {
						if (arr[i] == arr[i - 1] || arr[i] == arr[i - 4])
							sum = sum + 1;
					}
				}

				return sum;

			}

			public int allFull() {
				int sum = 0;
				for (int i = 0; i < 16; i++) {
					if (jlist.get(i).getText().equals("")) {
						sum++;
					}
				}

				return sum;
			}

			// ¼ÇÂ¼µ±Ç°ËùÓÐÄÚÈÝ
			public String remarkNow() {
				StringBuffer oldsb = new StringBuffer();
				for (JButton jb : jlist) {
					oldsb.append(jb.getText()).append("\t");
				}
				return oldsb.toString();

			}

		

	

	public void setColor() {
		for (JButton jb : jlist) {
			String str = jb.getText();
			switch (str) {
			case "":
				jb.setBackground(Color.black);
				break;
			case "2":
				jb.setBackground(Color.blue);
				break;
			case "4":
				jb.setBackground(Color.cyan);
				break;
			case "8":
				jb.setBackground(Color.gray);
				break;
			case "16":
				jb.setBackground(Color.green);
				break;
			case "32":
				jb.setBackground(Color.lightGray);
				break;
			case "64":
				jb.setBackground(Color.magenta);
				break;
			case "128":
				jb.setBackground(Color.orange);
				break;
			case "256":
				jb.setBackground(Color.pink);
				break;
			case "512":
				jb.setBackground(Color.yellow);
				break;
			case "1024":
				jb.setBackground(Color.red);
				JOptionPane.showMessageDialog(null, "ÄãÓ®ÁË", "  ", JOptionPane.PLAIN_MESSAGE);
				break;
			default:
				break;
			}
		}

	}

	public void moveLeft() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i <= 3; i++) {
			sb.append(jlist.get(i).getText()).append("/");
		}
		String[] arr = sb.toString().split("/");
		String msg = move(arr);

		arr = msg.split("\t");

		for (int i = 4; i <= 7; i++) {

			sb1.append(jlist.get(i).getText()).append("/");
		}
		String[] arrs = sb1.toString().split("/");
		String msgs = move(arrs);

		arrs = msgs.split("\t");

		for (int i = 8; i <= 11; i++) {
			sb2.append(jlist.get(i).getText()).append("/");
		}
		String[] arrss = sb2.toString().split("/");
		String msgss = move(arrss);

		arrss = msgss.split("\t");

		for (int i = 12; i < 16; i++) {
			sb3.append(jlist.get(i).getText()).append("/");
		}
		String[] arrsss = sb3.toString().split("/");
		String msgsss = move(arrsss);

		arrsss = msgsss.split("\t");
		clear();
		for (int i = 12; i <= 11 + arrsss.length; i++) {
			jlist.get(i).setText(arrsss[i - 12]);
		}
		for (int i = 0; i < arr.length; i++) {
			jlist.get(i).setText(arr[i]);
		}
		for (int i = 4; i <= 3 + arrs.length; i++) {
			jlist.get(i).setText(arrs[i - 4]);
		}
		for (int i = 8; i <= 7 + arrss.length; i++) {
			jlist.get(i).setText(arrss[i - 8]);
		}

	}

	public void clear() {
		for (int i = 0; i < jlist.size(); i++) {
			jlist.get(i).setText("");
		}
	}

	public String move(String[] arr) {
		int[] array = new int[arr.length];
		int fact = 0;
		for (String str : arr) {
			if (!str.equals("")) {
				array[fact] = Integer.parseInt(str);
				fact++;
			}
		}
		switch (fact) {
		default:
			break;
		case 0:
			return "" + "\t" + "" + "\t" + "" + "\t" + "";
		case 1:
			int temp = array[0];
			String str = temp + "";
			return str;
		case 2:
			if (array[1] == array[0]) {
				int temps = array[0] + array[1];
				String strs = temps + "";
				return strs;
			} else {
				return array[0] + "" + "\t" + array[1] + "" + "\t";
			}
		case 3:
			if (array[1] == array[0]) {
				int temps = array[0] + array[1];
				if (temps == array[2]) {
					temps = temps + array[2];
					return temps + "";
				} else {
					return temps + "" + "\t" + array[2] + "";
				}
			} else if (array[1] == array[2]) {
				int temps = array[1] + array[2];
				return array[0] + "" + "\t" + temps + "";
			} else {
				return array[0] + "" + "\t" + array[1] + "" + "\t" + array[2] + "";
			}
		case 4:
			if (array[2] == array[3]) {

				int temps = array[2] + array[3];

				if (array[0] == array[1]) {
					int rtemps = array[0] + array[1];
					return rtemps + "" + "\t" + temps + "" + "\t";
				} else {
					return array[0] + "" + "\t" + array[1] + "" + "\t" + temps + "";
				}
			} else if (array[1] == array[2]) {
				
				int big = array[1] + array[2];
			
				return array[0] + "" + "\t" + big + "" + "\t" + array[3];
			} else if (array[0] == array[1]) {
				int rtemps = array[0] + array[1];
				return rtemps + "" + "\t" + array[2] + "" + "\t" + array[3] + "";
			} else {
				return array[0] + "" + "\t" + array[1] + "" + "\t" + array[2] + "" + "\t" + array[3] + "";
			}
		}
		return null;
	}

	public String[] rightString(String str) {

		String[] arr = str.split("\t");
		Collections.reverse(Arrays.asList(arr));

		return arr;

	}

	private void moveUp() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i <= 3; i++) {
			sb.append(u1.get(i).getText()).append("/");
			sb1.append(u2.get(i).getText()).append("/");
			sb2.append(u3.get(i).getText()).append("/");
			sb3.append(u4.get(i).getText()).append("/");
		}
		String[] arr = sb.toString().split("/");
		String msg = move(arr);
		arr = downString(msg);
		String[] arrs = sb1.toString().split("/");
		msg = move(arrs);
		arrs = downString(msg);
		String[] arrss = sb2.toString().split("/");
		msg = move(arrss);
		arrss = downString(msg);
		String[] arrsss = sb3.toString().split("/");
		msg = move(arrsss);
		arrsss = downString(msg);
		clear();
		int j = 0;
		int j2 = 0;
		int j3 = 0;
		int j4 = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		for (int i = 0; i < arr.length; i++) {
			u1.get(n1).setText(arr[j]);
			n1++;
			j++;
		}
		for (int i = 0; i < arrs.length; i++) {
			u2.get(n4).setText(arrs[j2]);
			n4++;
			j2++;
		}
		for (int i = 0; i < arrss.length; i++) {
			u3.get(n2).setText(arrss[j3]);
			n2++;
			j3++;
		}
		for (int i = 0; i < arrsss.length; i++) {
			u4.get(n3).setText(arrsss[j4]);
			n3++;
			j4++;
		}

	}

	private void moveRight() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i <= 3; i++) {
			sb.append(jlist.get(i).getText()).append("/");
		}
		String[] arr = sb.toString().split("/");
		String msg = move(arr);

		arr = rightString(msg);

		for (int i = 4; i <= 7; i++) {

			sb1.append(jlist.get(i).getText()).append("/");
		}
		String[] arrs = sb1.toString().split("/");
		String msgs = move(arrs);

		arrs = rightString(msgs);

		for (int i = 8; i <= 11; i++) {
			sb2.append(jlist.get(i).getText()).append("/");
		}
		String[] arrss = sb2.toString().split("/");
		String msgss = move(arrss);

		arrss = rightString(msgss);

		for (int i = 12; i < 16; i++) {
			sb3.append(jlist.get(i).getText()).append("/");
		}
		String[] arrsss = sb3.toString().split("/");
		String msgsss = move(arrsss);

		arrsss = rightString(msgsss);
		clear();
		int j = 0;
		int j2 = 0;
		int j3 = 0;
		int j4 = 0;
		int n1 = 3;
		int n2 = 7;
		int n3 = 11;
		int n4 = 15;
		for (int i = arrsss.length; i > 0; i--) {
			jlist.get(n4).setText(arrsss[j]);
			n4--;
			j++;
		}

		for (int i = arr.length; i > 0; i--) {
			jlist.get(n1).setText(arr[j2]);
			n1--;
			j2++;
		}

		for (int i = arrs.length; i > 0; i--) {
			jlist.get(n2).setText(arrs[j3]);
			n2--;
			j3++;
		}

		for (int i = arrss.length; i > 0; i--) {
			jlist.get(n3).setText(arrss[j4]);
			n3--;
			j4++;
		}

	}

	private void moveDown() {

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i <= 3; i++) {
			sb.append(u1.get(i).getText()).append("/");
			sb1.append(u2.get(i).getText()).append("/");
			sb2.append(u3.get(i).getText()).append("/");
			sb3.append(u4.get(i).getText()).append("/");
		}
		String[] arr = sb.toString().split("/");
		String msg = move(arr);
		arr = downString(msg);
		String[] arrs = sb1.toString().split("/");
		msg = move(arrs);
		arrs = downString(msg);
		String[] arrss = sb2.toString().split("/");
		msg = move(arrss);
		arrss = downString(msg);
		String[] arrsss = sb3.toString().split("/");
		msg = move(arrsss);
		arrsss = downString(msg);
		clear();
		int j = arr.length - 1;
		int j2 = arrs.length - 1;
		int j3 = arrss.length - 1;
		int j4 = arrsss.length - 1;
		int n1 = 3;
		int n2 = 3;
		int n3 = 3;
		int n4 = 3;
		for (int i = arr.length; i > 0; i--) {
			u1.get(n1).setText(arr[j]);
			n1--;
			j--;
		}
		for (int i = arrs.length; i > 0; i--) {
			u2.get(n4).setText(arrs[j2]);
			n4--;
			j2--;
		}
		for (int i = arrss.length; i > 0; i--) {
			u3.get(n2).setText(arrss[j3]);
			n2--;
			j3--;
		}
		for (int i = arrsss.length; i > 0; i--) {
			u4.get(n3).setText(arrsss[j4]);
			n3--;
			j4--;
		}

	}

	private String[] downString(String msg) {
		String[] arr = msg.split("\t");
		return arr;
	}

	public boolean checkMove(String str) {
		StringBuffer newsb = new StringBuffer();
		for (JButton jb : jlist) {
			newsb.append(jb.getText()).append("\t");
		}
		String notice = newsb.toString();
		return str.equals(notice) ? false : true;
	}

	public void randomShow() {
		numl = new ArrayList<JButton>();
		// »ñÈ¡²»Îª¿ÕµÄJButton
		for (JButton jb : jlist) {
			if (jb.getText().equals("")) {
				numl.add(jb);
			}
		}

		int s = (int) (Math.random() * numl.size());

		String str = s % 2 == 0 ? "2" : "4";
		numl.get(s).setText(str);

	}

	public void labelR(){
		jl2.setText(size + "");
	}
	
	public void randomShowF() {
		int s = (int) (Math.random() * 16);
		int s1 = (int) (Math.random() * 16);
		for (int i = 1; i <= 16; i++) {
			if (i == s || i == s1) {
				String str = i % 2 == 0 ? "2" : "4";
				jlist.get(i - 1).setText(str);
			}
		}
		setColor();
	}

	// ´°¿ÚÒÆ¶¯
	

	
	public class FrameListener extends MouseAdapter {

		private Point lastPoint = null;

		@Override
		public void mousePressed(MouseEvent e) {
			lastPoint = e.getLocationOnScreen();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = e.getLocationOnScreen();
			int offsetX = point.x - lastPoint.x;
			int offsetY = point.y - lastPoint.y;
			Rectangle bounds = getBounds();
			bounds.x += offsetX;
			bounds.y += offsetY;
			setBounds(bounds);
			lastPoint = point;
		}
	}

}
