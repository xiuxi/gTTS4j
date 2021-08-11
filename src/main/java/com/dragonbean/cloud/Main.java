package com.dragonbean.cloud;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		InputStream is = null;
		String text = "Surprise!";
		gTTS4j gtts = new gTTS4j();
		try {
		    gtts.init(text, "en", true, false);
		    is = gtts.exec();
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    if (is != null)
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
