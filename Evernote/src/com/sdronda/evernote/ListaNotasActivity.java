package com.sdronda.evernote;

//import java.util.List;
//
//import com.evernote.edam.notestore.NoteFilter;
//import com.evernote.edam.notestore.NoteList;
//import com.evernote.edam.notestore.NoteStore;
//import com.evernote.edam.type.Note;
//import com.evernote.edam.type.NoteSortOrder;
//import com.evernote.edam.type.Notebook;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ListaNotasActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_notas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_notas, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/** 
	 * Retrieve and display a list of the user's notes.
	 */
//	private void listNotes() throws Exception {
//		System.out.println("Listing all notes:");
//		String authToken;
//		NoteStore noteStore;
//		List<Notebook> notebooks = noteStore.listNotebooks(authToken);
//		for (Notebook notebook : notebooks) {
//			System.out.println("Notebook: " + notebook.getName());
//			NoteFilter filter = new NoteFilter();
//			filter.setNotebookGuid(notebook.getGuid());
//			filter.setOrder(NoteSortOrder.CREATED.getValue());
//			filter.setAscending(true);
//			NoteList noteList = noteStore.findNotes(authToken, filter, 0, 100);
//			List<Note> notes = noteList.getNotes();
//			for (Note note : notes) {
//				System.out.println(" * " + note.getTitle());
//			}
//		}
//		System.out.println();
//	}
}
