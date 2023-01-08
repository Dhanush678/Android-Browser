package easy.tuto.etbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class mainpage extends AppCompatActivity {
    ImageView google;
    ImageView duck;
    ImageView ask;
    ImageView bing;
    ImageView yahoo;
    ImageView geek,leet,rank,hack,nptl,kalilinux,bash,stack,medium,git,libgen,zlib,c,python,cpp;
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        google = findViewById(R.id.goo);
        ImageView back = findViewById(R.id.link_icon);
        geek = findViewById(R.id.geek);
        leet = findViewById(R.id.leet);
        rank = findViewById(R.id.rank);
        nptl = findViewById(R.id.nptl);
        hack = findViewById(R.id.hack);
        kalilinux = findViewById(R.id.kali);
        bash = findViewById(R.id.bash);
        medium = findViewById(R.id.medium);
        stack =findViewById(R.id.stack);
        git = findViewById(R.id.github);
        libgen = findViewById(R.id.lib);
        zlib = findViewById(R.id.z);
        c = findViewById(R.id.c);
        python = findViewById(R.id.python);
        cpp = findViewById(R.id.cpp);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), mainpage.class));
                finish();
            }
        });
        yahoo = findViewById(R.id.yahoo);
        ask = findViewById(R.id.ask);
        bing = findViewById(R.id.bing);
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url", "yahoo.com");
                intent.putExtra("url1", "search.yahoo.com/search?p=");
                intent.putExtra("url2", "+&fr=yfp-hrmob&fr2=p%3Afp%2Cm%3Asb&.tsrc=yfp-hrmob&fp=1&toggle=1&cop=mss&ei=UTF-8");
                startActivity(intent);
                finish();

            }
        });
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url", "ask.com");
                intent.putExtra("url1", "nl.ask.com/web?o=779017&l=dir&qo=homepageSearchBox&ueid=1b26186f-3966-4f3d-a41e-5bc223522fc3&q=");
                intent.putExtra("url2", "");
                startActivity(intent);
                finish();

            }
        });
        geek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url", "www.geeksforgeeks.org");
                intent.putExtra("url1", "google.com/search?q=");
                intent.putExtra("url2", "");
                startActivity(intent);
                finish();

            }
        });
        leet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url", "leetcode.com");
                intent.putExtra("url1", "google.com/search?q=");
                intent.putExtra("url2", "");
                startActivity(intent);
                finish();

            }
        });
        kalilinux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url", "www.onworks.net/os-distributions/debian-based/free-kali-linux-online");
                intent.putExtra("url1", "google.com/search?q=");
                intent.putExtra("url2", "");
                startActivity(intent);
                finish();

            }
        });

        bash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","replit.com/languages/bash");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        stack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","stackoverflow.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","medium.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","github.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });

        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","www.hackerrank.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        nptl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","nptel.ac.in");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        hack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","www.hackthebox.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        bing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","bing.com");
                intent.putExtra("url1","www.bing.com/search?q=");
                intent.putExtra("url2","&qs=ds&form=QBRE");
                startActivity(intent);
                finish();

            }
        });



        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","google.com");
                intent.putExtra("url1","google.com/search?q=");
                intent.putExtra("url2","");
                startActivity(intent);
                finish();

            }
        });
        duck=findViewById(R.id.duckduck);
        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","duckduckgo.com");
                intent.putExtra("url1","duckduckgo.com/?q=");
                intent.putExtra("url2","&t=h");
                startActivity(intent);
                finish();

            }
        });
        libgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","libgen.is");
                intent.putExtra("url1","duckduckgo.com/?q=");
                intent.putExtra("url2","&t=h");
                startActivity(intent);
                finish();

            }
        });
        zlib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("url","www.online-java.com");
                intent.putExtra("url1","duckduckgo.com/?q=");
                intent.putExtra("url2","&t=h");
                startActivity(intent);
                finish();

            }
        });}

    @Override
    public void onBackPressed() {


        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            System.exit(0);
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}