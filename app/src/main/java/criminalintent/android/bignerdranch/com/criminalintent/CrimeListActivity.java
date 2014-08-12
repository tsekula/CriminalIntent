package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tom on 8/12/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();
    }
}
