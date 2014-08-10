package criminalintent.android.bignerdranch.com.criminalintent;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by I005743 on 10.08.2014.
 */
public class CrimeFragment extends android.support.v4.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        mDateButton = (Button)v.findViewById(R.id.crime_date);
        //mDateButton.setText(mCrime.getDate().toString());
        Context balls = v.getContext();
        java.text.DateFormat dateFormat = android.text.format.DateFormat.getLongDateFormat(balls);
        mDateButton.setText(dateFormat.format(mCrime.getDate()));
        mDateButton.setEnabled(false);
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);

        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });

        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence c, int i, int i2, int i3) {
                mCrime.setTitle(c.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return v;
    }
}
