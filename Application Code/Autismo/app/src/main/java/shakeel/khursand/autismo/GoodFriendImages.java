package shakeel.khursand.autismo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GoodFriendImages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_friend_images);

        setImages();
    }

    private void setImages() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.scrollView_linearLayout);
        int[] images = {
                R.drawable.good_friend_1,
                R.drawable.good_friend_2,
                R.drawable.good_friend_3,
                R.drawable.good_friend_4,
                R.drawable.good_friend_5,
                R.drawable.good_friend_6,
        };
        for (int i = 0;i < 6;i++){
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
           imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), images[i]));
           imageView.setScaleType(ImageView.ScaleType.FIT_XY);
           //imageView.setMaxWidth();
           layout.addView(imageView);
        }
    }
}
