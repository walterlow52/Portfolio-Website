package projects;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.*;

public abstract class Notepad extends WindowAdapter implements ActionListener, TextListener {
	
	Frame f;
	MenuBar mb;
	Menu m1, m2;
	MenuItem _new, _open, _save, _saveas, _exit, _find, _fdr;
	TextArea ta;
	Button b1, b2, b3;
	Label l;
	int flag = 1;
	int count = 1;
	String fname, fdir, fpn;
	FileDialog fd;
	boolean a, b = false;
	int cursor, x, y = 0;
	
	public Notepad() {

		f = new Frame();
		f.addWindowListener(this);
		f.setSize(500, 500);
		f.setVisible(true);
		mb = new MenuBar();
		m1 = new Menu("File");
		m2 = new Menu("Edit");
		_new = new MenuItem("New");
		_open = new MenuItem("Open");
		_save = new MenuItem("Save");
		_saveas = new MenuItem("Save As");
		_exit = new MenuItem("Exit");
		_find = new MenuItem("Find");
		
		System.out.println("textchange" + flag);
		boolean c;
		String temp = ta.getText();
		temp = temp.trim();
		
		if (temp.length() == 0) {
			c = true;
		}
		else {
			c = false;
		}
		
		if (a == true && count == 0) {
			flag = 1;
			count++;
		}
		else if (c && a == false) {
			flag = 1;
		}
		else {
			flag = 0;
		}
		
		System.out.println("textchange" + flag);
	}
	
	public static void main(String[] args) {
		Notepad pro = new Notepad();
	}
}
