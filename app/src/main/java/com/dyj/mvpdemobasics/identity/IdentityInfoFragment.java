package com.dyj.mvpdemobasics.identity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dyj.mvpdemobasics.R;
import com.dyj.mvpdemobasics.data.IdentityInfoBean;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public class IdentityInfoFragment extends Fragment implements IdentityInfoContract.View{

    private TextView name,age,sex;
    private IdentityInfoContract.Presenter mPresenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.info_fragment,container,false);
        name = view.findViewById(R.id.name);
        age = view.findViewById(R.id.age);
        sex = view.findViewById(R.id.sex);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void showData(IdentityInfoBean identityInfoBean) {
        name.setText(identityInfoBean.getName());
        age.setText(String.valueOf(identityInfoBean.getAge()));
        sex.setText(identityInfoBean.getSex());
    }

    @Override
    public void setPresenter(IdentityInfoContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
