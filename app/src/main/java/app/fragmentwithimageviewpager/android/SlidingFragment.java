package app.fragmentwithimageviewpager.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class SlidingFragment extends Fragment {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private List<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sliding, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        circleIndicator = (CircleIndicator) view.findViewById(R.id.circleIndicator);

        list.add(R.drawable.one);
        list.add(R.drawable.two);
        list.add(R.drawable.three);

        ViewPagerAdapter adapter = new ViewPagerAdapter(list);
        viewPager.setAdapter(adapter);

        circleIndicator.setViewPager(viewPager);

        return view;
    }
}