package app.com.example.android.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Toast;
import android.content.Context;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void appDispatch(View view)
    {
        CharSequence text;
        switch (view.getId())
        {
            case R.id.spotify_streamer:
                text = "This button will launch my Spotify Streamer.";
                break;
            case R.id.football_scores_app:
                text = "This button will launch my Football Scores app.";
                break;
            case R.id.library_app:
                text = "This button will launch my Library app.";
                break;
            case R.id.build_it_bigger:
                text = "This button will launch my Build It Bigger app.";
                break;
            case R.id.xyz_reader:
                text = "This button will launch my XYZ Reader.";
                break;
            case R.id.capstone:
                text = "This button will launch my Capstone app.";
                break;
            default:
                Log.e("Portfolio", "The app dispatcher was called by an unrecognized button.");
                return;
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
