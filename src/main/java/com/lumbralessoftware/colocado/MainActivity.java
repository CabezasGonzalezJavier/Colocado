package com.lumbralessoftware.colocado;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView mOne, mTwo, mThree, mFour, mFive, mSix, mSeven, mEight, mNine, mTen, mEleven, mTwelve, mThirteen, mFourteen, mfifteen, mSixteen;
    private int mThreePositionWidth, mThreePositionHeigh, mTwoPositionWidth, mTwoPositionHeigh, mWidthImage, mHeightImage;
    RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main_relative_layout);
        knowScreenDimens();
        initImageView();


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
        mThreePositionHeigh = heightTotal / 3;

        mTwoPositionWidth = widthTotal / 2;
        mTwoPositionHeigh = heightTotal / 2;

    }

    public void placeImageView(ImageView imageView, int left, int top, int right, int bottom) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = mTwoPositionWidth;
        layoutParams.bottomMargin = mTwoPositionHeigh;
        imageView.setLayoutParams(layoutParams);
        mRelativeLayout.addView(imageView);
    }

    public void placedImageView() {
        placeImageView(mOne, 0, 0, mThreePositionWidth, mThreePositionHeigh);
        placeImageView(mTwo, mWidthImage, 0, mTwoPositionWidth, mThreePositionHeigh);
        placeImageView(mThree, mTwoPositionWidth, 0, mWidthImage, mThreePositionHeigh);
        placeImageView(mFour, mThreePositionWidth, 0, 0, mThreePositionHeigh);

        placeImageView(mFive, 0, mHeightImage, mThreePositionWidth, mTwoPositionHeigh);
        placeImageView(mSix, mWidthImage, mHeightImage, mTwoPositionWidth, mTwoPositionHeigh);
        placeImageView(mSeven, mTwoPositionWidth, mHeightImage, mWidthImage, mTwoPositionHeigh);
        placeImageView(mEight, mThreePositionWidth, mHeightImage, 0, mTwoPositionHeigh);

        placeImageView(mNine, 0, mTwoPositionHeigh, mThreePositionWidth, mHeightImage);
        placeImageView(mTen, mWidthImage, mTwoPositionHeigh, mTwoPositionWidth, mHeightImage);
        placeImageView(mEleven, mTwoPositionWidth, mTwoPositionHeigh, mWidthImage, mHeightImage);
        placeImageView(mTwelve, mThreePositionWidth, mTwoPositionHeigh, 0, mHeightImage);

        placeImageView(mThirteen, 0, mThreePositionHeigh, mThreePositionWidth, 0);
        placeImageView(mFourteen, mWidthImage, mThreePositionHeigh, mTwoPositionWidth, 0);
        placeImageView(mfifteen, mTwoPositionWidth, mThreePositionHeigh, mWidthImage, 0);
        placeImageView(mSixteen, mThreePositionWidth, mThreePositionHeigh, 0, 0);
    }

    public void initImageView() {
        mOne = new ImageView(this);
        mTwo = new ImageView(this);
        mThree = new ImageView(this);
        mFour = new ImageView(this);

        mFive = new ImageView(this);
        mSix = new ImageView(this);
        mSeven = new ImageView(this);
        mEight = new ImageView(this);

        mNine = new ImageView(this);
        mTen = new ImageView(this);
        mEleven = new ImageView(this);
        mTwelve = new ImageView(this);

        mThirteen = new ImageView(this);
        mFourteen = new ImageView(this);
        mfifteen = new ImageView(this);
        mSixteen = new ImageView(this);

        placedImageView();
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
}
