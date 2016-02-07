package com.lumbralessoftware.colocado;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView mOne, mTwo, mThree, mFour, mFive, mSix, mSeven, mEight, mNine, mTen, mEleven, mTwelve, mThirteen, mFourteen, mfifteen, mSixteen;
    private int mThreePositionWidth, mThreePositionHeight, mTwoPositionWidth, mTwoPositionHeight, mWidthImage, mHeightImage;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main_relative_layout);
        mOne = (ImageView) findViewById(R.id.activity_main_1);
        mTwo = (ImageView) findViewById(R.id.activity_main_2);
        mThree = (ImageView) findViewById(R.id.activity_main_3);
        mFour = (ImageView) findViewById(R.id.activity_main_4);

        mFive = (ImageView) findViewById(R.id.activity_main_5);
        mSix = (ImageView) findViewById(R.id.activity_main_6);
        mSeven = (ImageView) findViewById(R.id.activity_main_7);
        mEight = (ImageView) findViewById(R.id.activity_main_8);

        mNine = (ImageView) findViewById(R.id.activity_main_9);
        mTen = (ImageView) findViewById(R.id.activity_main_10);
        mEleven = (ImageView) findViewById(R.id.activity_main_11);
        mTwelve = (ImageView) findViewById(R.id.activity_main_12);

        mThirteen = (ImageView) findViewById(R.id.activity_main_13);
        mFourteen = (ImageView) findViewById(R.id.activity_main_14);
        mfifteen = (ImageView) findViewById(R.id.activity_main_15);
        mSixteen = (ImageView) findViewById(R.id.activity_main_16);

        //mNew = (ImageView) findViewById(R.id.activity_main_new);
        setParamns();
        knowScreenDimens();
        getColor();
        //placedImageView();


    }

    public void knowScreenDimens() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        int widthTotal = size.x;
        int heightTotal = size.y;

        mWidthImage = widthTotal / 4;
        mHeightImage = heightTotal / 4;

        mThreePositionWidth = widthTotal / 3;
        mThreePositionHeight = heightTotal / 3;

        mTwoPositionWidth = widthTotal / 2;
        mTwoPositionHeight = heightTotal / 2;

        StringBuilder stringBu = new StringBuilder();
        stringBu.append(" width:");
        stringBu.append(widthTotal);
        stringBu.append(" height:");
        stringBu.append(heightTotal);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" mWidthImage");
        stringBuilder.append(mWidthImage);
        stringBuilder.append(" mHeightImage");
        stringBuilder.append(mHeightImage);

        stringBuilder.append(" mThreePositionWidth");
        stringBuilder.append( mThreePositionWidth);
        stringBuilder.append(" mThreePositionHeight");
        stringBuilder.append(mThreePositionHeight);

        stringBuilder.append(" mTwoPositionWidth");
        stringBuilder.append(mTwoPositionWidth);
        stringBuilder.append(" mTwoPositionHeight");
        stringBuilder.append(mTwoPositionHeight);

        Log.d(">>>>MAin", stringBu.toString());
        Log.d(">>>>>>>>>>>MainActivity", stringBuilder.toString());

        //placeImageView(mOne, 0, 0, mThreePositionWidth, mThreePositionHeight);
    }

    public void placeImageView(ImageView imageView, int left, int top, int right, int bottom) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mRelativeLayout.getLayoutParams();
        layoutParams.leftMargin = left;
        layoutParams.topMargin = top;
        layoutParams.rightMargin = right;
        layoutParams.bottomMargin = bottom;
        imageView.setLayoutParams(layoutParams);
        //mRelativeLayout.addView(imageView);
    }

    public void placedImageView() {
        placeImageView(mOne, 0, 0, mThreePositionWidth, mThreePositionHeight);
        placeImageView(mTwo, mWidthImage, 0, mTwoPositionWidth, mThreePositionHeight);
        placeImageView(mThree, mTwoPositionWidth, 0, mWidthImage, mThreePositionHeight);
        placeImageView(mFour, mThreePositionWidth, 0, 0, mThreePositionHeight);

        placeImageView(mFive, 0, mHeightImage, mThreePositionWidth, mTwoPositionHeight);
        placeImageView(mSix, mWidthImage, mHeightImage, mTwoPositionWidth, mTwoPositionHeight);
        placeImageView(mSeven, mTwoPositionWidth, mHeightImage, mWidthImage, mTwoPositionHeight);
        placeImageView(mEight, mThreePositionWidth, mHeightImage, 0, mTwoPositionHeight);

        placeImageView(mNine, 0, mTwoPositionHeight, mThreePositionWidth, mHeightImage);
        placeImageView(mTen, mWidthImage, mTwoPositionHeight, mTwoPositionWidth, mHeightImage);
        placeImageView(mEleven, mTwoPositionWidth, mTwoPositionHeight, mWidthImage, mHeightImage);
        placeImageView(mTwelve, mThreePositionWidth, mTwoPositionHeight, 0, mHeightImage);

        placeImageView(mThirteen, 0, mThreePositionHeight, mThreePositionWidth, 0);
        placeImageView(mFourteen, mWidthImage, mThreePositionHeight, mTwoPositionWidth, 0);
        placeImageView(mfifteen, mTwoPositionWidth, mThreePositionHeight, mWidthImage, 0);
        placeImageView(mSixteen, mThreePositionWidth, mThreePositionHeight, 0, 0);
    }

    public void getColor(){
        mOne.setBackgroundColor(getColor(R.color.colorPrimary));
        mTwo.setBackgroundColor(getColor(R.color.white));
        mThree.setBackgroundColor(getColor(R.color.colorAccent));
        mFour.setBackgroundColor(getColor(R.color.yellow));

        mFive.setBackgroundColor(getColor(R.color.red));
        mSix.setBackgroundColor(getColor(R.color.silver));
        mSeven.setBackgroundColor(getColor(R.color.olive));
        mEight.setBackgroundColor(getColor(R.color.purple));

        mNine.setBackgroundColor(getColor(R.color.colorPrimary));
        mTen.setBackgroundColor(getColor(R.color.white));
        mEleven.setBackgroundColor(getColor(R.color.colorAccent));
        mTwelve.setBackgroundColor(getColor(R.color.yellow));

        mThirteen.setBackgroundColor(getColor(R.color.red));
        mFourteen.setBackgroundColor(getColor(R.color.silver));
        mfifteen.setBackgroundColor(getColor(R.color.olive));
        mSixteen.setBackgroundColor(getColor(R.color.purple));
    }

    public void setParamns(){
        mOne.setLayoutParams(new RelativeLayout.LayoutParams(mWidthImage, mHeightImage));
        mTwo.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mThree.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mFour.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));

        mFive.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mSix.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mSeven.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mEight.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));

        mNine.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mTen.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mEleven.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mTwelve.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));

        mThirteen.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mFourteen.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mfifteen.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        mSixteen.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
    }
}
