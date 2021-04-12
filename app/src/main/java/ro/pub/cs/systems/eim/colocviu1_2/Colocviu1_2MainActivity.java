package ro.pub.cs.systems.eim.colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colocviu1_2MainActivity extends AppCompatActivity {
    private EditText nextTerm;
    private EditText allTerms;
    private Button addButton, computeButton;

    private AddClickListener buttonClickListener = new AddClickListener();
    private class AddClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (nextTerm.getText().length() != 0) {
             String cache = String.valueOf(allTerms.getText());

             if (cache.length() != 0) {
                 cache = cache + " + " + nextTerm.getText();
             } else {
                 cache = String.valueOf(nextTerm.getText());
             }

             allTerms.setText(cache);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        nextTerm = (EditText)findViewById(R.id.next_term);
        allTerms = (EditText)findViewById(R.id.all_terms);

        addButton = (Button)findViewById(R.id.add_button);
        computeButton = (Button)findViewById(R.id.compute);

        addButton.setOnClickListener(buttonClickListener);

    }
}