package cn.edu.gdmec.android.myapplication.idlereader;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.edu.gdmec.android.myapplication.R;

/**
 * Created by apple on 18/5/22.
 */

public class FgListNewsFragment extends Fragment {

    private  int type;
    private TextView tv_news;


    public static FgListNewsFragment newInstance(int type){
        Bundle args=new Bundle();
        FgListNewsFragment fragment=new FgListNewsFragment();
        args.putInt("type",type);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fg_list_news,null);
    }
    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        type=getArguments().getInt("type");
        tv_news=view.findViewById(R.id.tv_news);
        switch (type){
            case FgNewsFragment.NEWS_TYPE_TOP:
                tv_news.setText("top");
                break;
            case FgNewsFragment.NEWS_TYPE_NBA:
                tv_news.setText("nba");
                break;
            case FgNewsFragment.NEWS_TYPE_JOKES:
                tv_news
                        .setText("joker");
                break;
        }
    }
}
