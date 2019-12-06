package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String>mNames=new ArrayList<>();
    private ArrayList<String>mMovieDates=new ArrayList<>();
    private ArrayList<String>mMovieTypes=new ArrayList<>();
    private ArrayList<String>mImageUrls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initRecyclerView();
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing Bitmaps");
        mImageUrls.add("https://kisss.cc/wp-content/uploads/2018/06/5907.jpg");
        mNames.add("Falcon");
        mMovieDates.add("10");
        mMovieTypes.add("Predatory");
        mImageUrls.add("https://image.winudf.com/v2/image1/Y29tLnN0eWxlLmdhbWVzLnB1enpsZS5uaWNlYmlyZHNfc2NyZWVuXzBfMTU0NDU2MTczMV8wODM/screen-0.jpg?fakeurl=1&type=.jpg");
        mNames.add("Bird");
        mMovieDates.add("20");
        mMovieTypes.add("Elif");
        mImageUrls.add("https://1.bp.blogspot.com/-8u_fWZkvMRc/VyMts4DexbI/AAAAAAAAT5U/cSLfTTPx2J41QGIqAUwQwYnpY3lIMFHBACLcB/s1600/%25D8%25B5%25D9%2588%25D8%25B1%2B%25D8%25B7%25D9%258A%25D9%2588%25D8%25B1_1.jpg");
        mNames.add("Dove");
        mMovieDates.add("30");
        mMovieTypes.add("Elif");
        mImageUrls.add("https://i.ytimg.com/vi/a_fs6Cw-5CU/hqdefault.jpg");
        mNames.add("bird");
        mMovieDates.add("100");
        mMovieTypes.add("Elif");
        mImageUrls.add("https://rollingthunderky1.org/img/make-your-best-home/pictures-of-state-birds.jpg");
        mNames.add("bird");
        mMovieDates.add("150");
        mMovieTypes.add("Elif");
        mImageUrls.add("https://ggirls.cc/wp-content/uploads/2018/08/1472-9.jpg");
        mNames.add("bird");
        mMovieDates.add("40");
        mMovieTypes.add("Elif");
        mImageUrls.add("https://www.sayidaty.net/sites/default/files/styles/800x510/public/2018/01/29/3270176-2093646484.jpg");
        mNames.add("bird");
        mMovieDates.add("440");
        mMovieTypes.add("Elif");

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init Recyclerview.");
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mImageUrls,mMovieDates,mMovieTypes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
