package restapi.init.user.splashscreenslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = (ViewPager) findViewById(R.id.pager);
        PageAdapter padapter=new PageAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);

    }

    private class PageAdapter extends FragmentPagerAdapter {
        public PageAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public Fragment getItem(int arg0) {

            switch (arg0) {
                case 0:

                    return new FragmentOne();

                case 1:
                    return new FragmentTwo();
                case 2:
                    return new FragmentThree();

                default:
                    break;
            }
            return null;
        }

        @Override
        public int getCount() {

            return 3;
        }

    }
}