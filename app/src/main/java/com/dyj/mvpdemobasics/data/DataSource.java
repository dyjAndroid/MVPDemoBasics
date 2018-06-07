package com.dyj.mvpdemobasics.data;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public interface DataSource {

    interface LoadInfoCallback {

        void getIdentityInfo(IdentityInfoBean identityInfoBean);
    }

    void getData(LoadInfoCallback loadInfoCallback);
}
