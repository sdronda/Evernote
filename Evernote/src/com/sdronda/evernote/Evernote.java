package com.sdronda.evernote;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.evernote.client.android.EvernoteSession;

public class Evernote extends Activity{
	private static final String LOGTAG = "Evernote";
	
	private static final String CONSUMER_KEY = "sdronda";
	private static final String CONSUMER_SECRET = "0b00895f7dccb152";
	private static final EvernoteSession.EvernoteService EVERNOTE_SERVICE = EvernoteSession.EvernoteService.SANDBOX;

	// Set this to true if you want to allow linked notebooks for accounts that can only access a single notebook.
	private static final boolean SUPPORT_APP_LINKED_NOTEBOOKS = true;
	private EvernoteSession mEvernoteSession; 
	protected final int DIALOG_PROGRESS = 101;
	
	public Evernote() {
		super();
	}

	public EvernoteSession getmEvernoteSession() {
		return mEvernoteSession;
	}

	public void setmEvernoteSession(EvernoteSession mEvernoteSession) {
		this.mEvernoteSession = mEvernoteSession;
	}
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    //Set up the Evernote Singleton Session
	    mEvernoteSession = EvernoteSession.getInstance(this, CONSUMER_KEY, CONSUMER_SECRET, EVERNOTE_SERVICE, SUPPORT_APP_LINKED_NOTEBOOKS);
	}	
}
