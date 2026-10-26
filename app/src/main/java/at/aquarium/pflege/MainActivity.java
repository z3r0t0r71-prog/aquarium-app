package at.aquarium.pflege;
import android.app.Activity; import android.os.Bundle; import android.webkit.*; import android.view.WindowManager;
public class MainActivity extends Activity {
    WebView w;
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
        w.setWebViewClient(new WebViewClient());
        setContentView(w);
        w.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { if (w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
