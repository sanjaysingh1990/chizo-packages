package restapi.init.user.splashscreenslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends FragmentActivity {

    ViewPager viewpager;
   RadioButton[] indicator=new RadioButton[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = (ViewPager) findViewById(R.id.pager);
        indicator[0]= (RadioButton) findViewById(R.id.radio1);
        indicator[1]= (RadioButton) findViewById(R.id.radio2);
        indicator[2]= (RadioButton) findViewById(R.id.radio3);
        indicator[0].setSelected(true);
         PageAdapter padapter=new PageAdapter(getSupportFragmentManager());
         viewpager.setAdapter(padapter);
         viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
       @Override
       public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

       }

       @Override
       public void onPageSelected(int position)
       {
          selected(position);
       }

       @Override
       public void onPageScrollStateChanged(int state) {

       }
   });
    }

    private void selected(int pos)
    {
        for(int i=0;i<indicator.length;i++)
        {
            indicator[i].setSelected(false);
        }
        indicator[pos].setSelected(true);
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