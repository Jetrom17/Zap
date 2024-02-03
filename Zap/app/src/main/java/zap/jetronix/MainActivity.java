package zap.jetronix;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private EditText edittext1;
	private Button button1;
	
	private Intent acao = new Intent();
	private AlertDialog.Builder dialog;
	private Intent changelog = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		edittext1 = findViewById(R.id.edittext1);
		button1 = findViewById(R.id.button1);
		dialog = new AlertDialog.Builder(this);
		
		button1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				changelog.setAction(Intent.ACTION_VIEW);
				changelog.setClass(getApplicationContext(), ChangelogActivity.class);
				startActivity(changelog);
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				String numero = edittext1.getText().toString();
				
				// Remover caracteres não numéricos
				numero = numero.replaceAll("[^0-9]", "");
				
				if (numero.matches("919\\d+")) {
					    // Prosseguir com ação
					    Intent acao = new Intent();
					    acao.setAction(Intent.ACTION_VIEW);
					    acao.setData(Uri.parse("https://wa.me/+55919" + numero.substring(3)));
					    startActivity(acao);
				} else if (numero.matches("9\\d+")) {
					    // Prosseguir com ação
					    Intent acao = new Intent();
					    acao.setAction(Intent.ACTION_VIEW);
					    acao.setData(Uri.parse("https://wa.me/+5591" + numero));
					    startActivity(acao);
				} else if (numero.matches("91\\d+")) {
					    // Prosseguir com ação
					    Intent acao = new Intent();
					    acao.setAction(Intent.ACTION_VIEW);
					    acao.setData(Uri.parse("https://wa.me/+55" + numero));
					    startActivity(acao);
				} else if (numero.matches("\\+55\\d{2}9\\d+")) {
					    // Prosseguir com ação
					    Intent acao = new Intent();
					    acao.setAction(Intent.ACTION_VIEW);
					    acao.setData(Uri.parse("https://wa.me/" + numero));
					    startActivity(acao);
				} else {
					    // Caso contrário, exibir diálogo de erro
					    dialog.setTitle("Erro");
					    dialog.setMessage("Houve um problema com o número inserido.");
					    dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
						        @Override
						        public void onClick(DialogInterface _dialog, int _which) {
							            // Código a ser executado ao clicar no botão neutro
							        }
						    });
					    dialog.create().show();
				}
				
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}