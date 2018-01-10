package shakeel.khursand.autismo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FoodImages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_images);

        setImages();
    }

    private void setImages() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.scrollView_linearLayout3);
        int[] images = {
                R.drawable.food_1,
                R.drawable.food_2,
                R.drawable.food_3,
                R.drawable.food_4,
                R.drawable.food_5,
                R.drawable.food_6,
                R.drawable.food_7,
                R.drawable.food_8,
                R.drawable.food_9,
                R.drawable.food_10,
                R.drawable.food_11,
                R.drawable.food_12,
                R.drawable.food_13,
                R.drawable.food_14
        };

        for (int i = 0;i < 12;i++){
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
