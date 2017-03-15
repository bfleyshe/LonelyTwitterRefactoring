package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;
	protected Date tweetDate;
	protected String tweetBody;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}


	public boolean isValid() {

		return (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10);
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

    public String getTweetBody() {
        return tweetBody;
    }
}