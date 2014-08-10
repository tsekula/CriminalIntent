package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by I005743 on 10.08.2014.
 */
public class Crime {
    private String mTitle;
    private UUID mId;

    /* #########################################
        Getters and Setters
     ######################################### */
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }


    public Crime() {
        // generate unique identifier
        mId = UUID.randomUUID();
    }
}
