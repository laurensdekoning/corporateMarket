package nl.laez.apps.corpMarket;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CorporateMarketActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView webViewert = (WebView) findViewById(R.id.webView1);
        WebSettings webViewertSet = webViewert.getSettings();
        webViewertSet.setJavaScriptEnabled(true);
        webViewertSet.setSupportZoom(true);
        
        webViewert.loadUrl("http://laez.nl");
        
    }
}