package com.dyj.mvpdemobasics.identity;

import com.dyj.mvpdemobasics.data.DataRepository;
import com.dyj.mvpdemobasics.data.DataSource;
import com.dyj.mvpdemobasics.data.IdentityInfoBean;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public class IdentityInfoPresenter implements IdentityInfoContract.Presenter {

    private IdentityInfoContract.View mView;
    private DataRepository mDataRepository;

    public IdentityInfoPresenter(IdentityInfoContract.View view, DataRepository dataRepository) {
        mView = view;
        mDataRepository = dataRepository;
        mView.setPresenter(this);
    }

    @Override
    public void loadData() {
        mDataRepository.getData(new DataSource.LoadInfoCallback() {
            @Override
            public void getIdentityInfo(IdentityInfoBean identityInfoBean) {
                mView.showData(identityInfoBean);
            }
        });
    }

    @Override
    public void start() {
        loadData();
    }
}
