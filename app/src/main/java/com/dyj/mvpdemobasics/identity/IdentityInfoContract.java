package com.dyj.mvpdemobasics.identity;

import com.dyj.mvpdemobasics.BasePresenter;
import com.dyj.mvpdemobasics.BaseView;
import com.dyj.mvpdemobasics.data.IdentityInfoBean;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public interface IdentityInfoContract {

    interface View extends BaseView<Presenter> {

        void showData(IdentityInfoBean identityInfoBean);
    }

    interface Presenter extends BasePresenter {

        void loadData();
    }
}
