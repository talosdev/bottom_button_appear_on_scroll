package app.we.go.bottombutton;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View button;
    private View bottomButton;
    private BottomSheetBehavior<View> bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.got_it);

        bottomButton = findViewById(R.id.bottom_button);

        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottom_sheet));
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        bottomButton.setOnClickListener(this::exit);
        button.setOnClickListener(this::exit);
    }

    private void exit(final View view) {
        finish();
    }

}
