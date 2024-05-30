package my.zap;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
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
	private EditText edittext1;
	private Button button1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		edittext1 = findViewById(R.id.edittext1);
		button1 = findViewById(R.id.button1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				// Chatgpt - Jeiel
				String phoneNumber = edittext1.getText().toString().trim();
				
				// Remover todos os caracteres não numéricos
				phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
				
				// Verificar o comprimento do número de telefone e ajustar conforme necessário
				switch (phoneNumber.length()) {
					    case 8: // Apenas o número, sem DDD nem código do país
					        phoneNumber = "5591" + phoneNumber;
					        break;
					    case 9: // Número com DDD, sem código do país
					        phoneNumber = "55" + phoneNumber;
					        break;
					    case 10: // Número com DDD, sem código do país
					        phoneNumber = "55" + phoneNumber;
					        break;
					    case 11: // Número com DDD, sem código do país
					        phoneNumber = "55" + phoneNumber;
					        break;
					    case 12: // Número com DDD e código do país (começa com "55")
					        break;
					    default: // Comprimento inválido
					        // Tratar como número inválido
					        // Você pode exibir uma mensagem de erro aqui
					        break;
				}
				
				// Construir o link do WhatsApp
				String whatsappLink = "https://wa.me/" + phoneNumber;
				
				// Abrir o WhatsApp
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse(whatsappLink));
				startActivity(intent);
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