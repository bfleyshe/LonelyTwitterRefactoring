package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;
	protected Date tweetDate;
	protected String tweetBody;

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	public String getTweetBody() {
		String msg = tweetBody.toUpperCase();
		Log.i("LonelyTweet", msg);
        return msg;
    }
}