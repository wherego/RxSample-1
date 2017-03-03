package com.autism.rxsample.presenter;

import com.autism.rxsample.api.RequestManger;
import com.autism.rxsample.rxlistener.IBaseRXListener;

import retrofit2.Retrofit;

/**
 * Author：Autism on 2017/3/2 14:53
 * Used:
 */
public abstract class BasePresenterIml implements IBasePresenter, IBaseRXListener {
    @Override
    public void onInit() {
        Retrofit retrofit = RequestManger.getRequestManager().getRetrofit(this);
        handleNetRes(retrofit);
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public int getRawSSl() {
        return 0;
    }

    /**
     * 网络加载处理
     *
     * @param retrofit
     */
    protected abstract void handleNetRes(Retrofit retrofit);
}
