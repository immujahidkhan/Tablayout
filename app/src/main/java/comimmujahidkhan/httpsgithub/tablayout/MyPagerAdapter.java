package comimmujahidkhan.httpsgithub.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mujahidkhan on 1/1/18.
 */

class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new OneFragment();
            case 1:
                return new TwoFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "One";
            case 1:
                return "Two";
                default:
                    return null;
        }
    }
}
