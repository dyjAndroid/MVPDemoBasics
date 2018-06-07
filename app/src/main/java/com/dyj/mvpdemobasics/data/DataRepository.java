package com.dyj.mvpdemobasics.data;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public class DataRepository implements DataSource {
    @Override
    public void getData(LoadInfoCallback loadInfoCallback) {

        IdentityInfoBean identityInfoBean = new IdentityInfoBean("Mark", 20, "男");
        loadInfoCallback.getIdentityInfo(identityInfoBean);
    }
}
