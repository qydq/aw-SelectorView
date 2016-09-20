package com.lyue.aw_selectorview;

import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.an.an_base.mvp.base.SuperActivity;
import com.lyue.aw_selectorview.fragment.BookFragment;
import com.lyue.aw_selectorview.fragment.FavoritesFragment;
import com.lyue.aw_selectorview.fragment.FindFragment;
import com.lyue.aw_selectorview.fragment.LocationFragment;
import com.lyue.aw_selectorview.segmentcontrol.SegmentControl;

public class MainActivity extends SuperActivity {
    private LocationFragment mLocationFragment;
    private FindFragment mFindFragment;
    private FavoritesFragment mFavoritesFragment;
    private BookFragment mBookFragment;


    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        final SegmentControl show = (SegmentControl) findViewById(R.id.segment_control);
        setDefaultFragment();
        show.setOnSegmentControlClickListener(new SegmentControl.OnSegmentControlClickListener() {
            @Override
            public void onSegmentControlClick(int index) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                switch (index) {
                    case 0:
                        if (mLocationFragment == null) {
                            mLocationFragment = LocationFragment.newInstance("我的好友");
                        }
                        ft.replace(R.id.layFragme, mLocationFragment).commitAllowingStateLoss();
                        Snackbar.make(show, " 好友", Snackbar.LENGTH_SHORT).show();
                        break;
                    case 1:
                        if (mFindFragment == null) {
                            mFindFragment = FindFragment.newInstance("同学");
                        }
                        ft.replace(R.id.layFragme, mFindFragment).commitAllowingStateLoss();
                        Snackbar.make(show, " 同学", Snackbar.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (mFavoritesFragment == null) {
                            mFavoritesFragment = FavoritesFragment.newInstance("同事");
                        }
                        ft.replace(R.id.layFragme, mFavoritesFragment).commitAllowingStateLoss();
                        Snackbar.make(show, " 同事", Snackbar.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (mBookFragment == null) {
                            mBookFragment = BookFragment.newInstance("老师");
                        }
                        ft.replace(R.id.layFragme, mBookFragment).commitAllowingStateLoss();
                        Snackbar.make(show, " 老师", Snackbar.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mLocationFragment == null) {
            mLocationFragment = LocationFragment.newInstance("我的好友");
            ft.replace(R.id.layFragme, mLocationFragment).commitAllowingStateLoss();
        }
    }
}
