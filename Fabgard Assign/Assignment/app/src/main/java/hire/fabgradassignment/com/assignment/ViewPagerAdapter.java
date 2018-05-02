package hire.fabgradassignment.com.assignment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public void addFragments(Fragment fragment, String titles)
    {
        this.fragments.add(fragment);
        this.tabTitles.add(titles);
    }
    public ViewPagerAdapter(FragmentManager fm)
    {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);

    }

    @Override
    public int getCount() {

        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
