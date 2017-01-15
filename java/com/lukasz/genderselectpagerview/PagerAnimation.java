package com.lukasz.genderselectpagerview;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Lukasz on 2017-01-14.
 */

public class PagerAnimation  implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        float scaleXY= 1.0f-Math.abs(position)*0.2f;

        page.setScaleX(scaleXY);
        page.setScaleY(scaleXY);

        page.setAlpha(1.0f-Math.abs(position)*0.5f);
    }
}
