package criminalintent.android.bignerdranch.com.criminalintent;

import android.content.Context;

/**
 * Created by Tom on 8/10/2014.
 */
public class CrimeLab  {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab==null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
}
