package com.xjh1994.emotion.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xjh1994.emotion.R;
import com.xjh1994.emotion.base.IAdapterItem;
import com.xjh1994.emotion.bean.User;
import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by XJH on 16/3/25.
 */
public class UserItem implements IAdapterItem<User> {

    @Bind(R.id.username)
    TextView username;
    @Bind(R.id.image)
    ImageView image;

    @Override
    public int getLayoutResId() {
        return R.layout.item_user;
    }

    @Override
    public void bindViews(View root) {
        ButterKnife.bind(this, root);
    }

    @Override
    public void setViews() {

    }

    @Override
    public void handleData(Context context, User user, int type) {
        username.setText(user.getObjectId());
        Glide.with(context).load("http://file.bmob.cn/M03/F8/EE/oYYBAFbz2VCAFyahAADpNXJ1C5k159.jpg").into(image);
    }
}
