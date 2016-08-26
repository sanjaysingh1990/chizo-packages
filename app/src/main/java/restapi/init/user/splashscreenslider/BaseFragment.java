package restapi.init.user.splashscreenslider;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;

/**
 * Created by sanjay on 26/08/2016.
 */
public class BaseFragment extends Fragment

{
    public void showSpannable(TextView txt)
    {
        String text="    "+txt.getText().toString();
        SpannableStringBuilder ssb = new SpannableStringBuilder(text);
        Bitmap smiley = BitmapFactory.decodeResource(getResources(), R.mipmap.tick);
        ssb.setSpan( new ImageSpan( smiley ),0,3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        txt.setText(ssb, TextView.BufferType.SPANNABLE);

    }
}
