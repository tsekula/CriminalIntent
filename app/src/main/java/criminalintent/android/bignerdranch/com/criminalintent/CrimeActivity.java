package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return CrimeFragment.newInstance((UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID));
    }
}
