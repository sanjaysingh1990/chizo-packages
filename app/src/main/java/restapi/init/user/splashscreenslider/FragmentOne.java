package restapi.init.user.splashscreenslider;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class FragmentOne extends BaseFragment implements Animation.AnimationListener{


    TextView text1,text2,text3;
    // Animation
    Animation animFadein,animFadein2,animFadein3;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment_one, container, false);

        text1=(TextView)v.findViewById(R.id.text1);
        text2=(TextView)v.findViewById(R.id.text2);
        text3=(TextView)v.findViewById(R.id.text3);

        showSpannable(text1);
        showSpannable(text2);
        showSpannable(text3);


        // load the animation
        animFadein = AnimationUtils.loadAnimation(getContext(),
                R.anim.fade_in);
        text1.startAnimation(animFadein);
        animFadein.setAnimationListener(this);

        animFadein2 = AnimationUtils.loadAnimation(getContext(),
                R.anim.fade_in);
        animFadein3 = AnimationUtils.loadAnimation(getContext(),
                R.anim.fade_in);

        animFadein2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                text2.setVisibility(View.VISIBLE);
                text3.startAnimation(animFadein3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animFadein3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                text3.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        return v;
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
       text1.setVisibility(View.VISIBLE);
        text2.startAnimation(animFadein2);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


}
