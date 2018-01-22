package shakeel.khursand.autismo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class EmotionImages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotion_images);

        setImages();
    }

    private void setImages() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.scrollView_linearLayout2);
        int[] images = {
                R.drawable.emotion_1,
                R.drawable.emotion_2,
                R.drawable.emotion_3,
                R.drawable.emotion_4,
                R.drawable.emotion_5,
                R.drawable.emotion_6,
                R.drawable.emotion_7,
                R.drawable.emotion_8,
                R.drawable.emotion_9,
                R.drawable.emotion_10,
                R.drawable.emotion_11,
                R.drawable.emotion_12,
                R.drawable.emotion_13,
                R.drawable.emotion_14

        };

        for (int i = 0;i < 14;i++){
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), images[i]));
            //imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layout.addView(imageView);
        }
    }
}
