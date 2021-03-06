package com.baozi.demo.viewholder.citytree;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.adpater.ViewHolder;
import com.baozi.treerecyclerview.view.TreeParentItem;

import java.util.List;

/**
 * Created by baozi on 2016/12/8.
 */
public class OneItem extends TreeParentItem<CityBean> {


    public OneItem(CityBean data) {
        super(data);
    }

    @Override
    protected void initChildsList(CityBean data) {
//        ArrayList<TreeItem> treeItems = new ArrayList<>();
        List<CityBean.CitysBean> citys = data.getCitys();
        if (null == citys) {
            return ;
        }
        for (int i = 0; i < citys.size(); i++) {
            TwoItem twoItem = new TwoItem(citys.get(i));
            if (citys.get(i).getCityName().equals("朝阳区")) {
            }
            addView(twoItem);
        }
//        return treeItems;
    }

    @Override
    public int getLayoutId() {
        return R.layout.itme_one;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder) {
        holder.setText(R.id.tv_content, data.getProvinceName());
    }

    @Override
    public boolean canExpandOrCollapse() {
        return true;
    }
}
