package com.epds.dev.iims_student_testimony_ui;

import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.epds.dev.iims_student_testimony_ui.adapter.PostAdapter;
import com.epds.dev.iims_student_testimony_ui.data_class.Post;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Assuming you have a list of posts
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Di naman sya nakakaiyak...", "2024-05-19 • 12:12pm", "Tom Hanks", R.drawable.tom_hanks, R.drawable.man_called_otto));
        posts.add(new Post("Bahala na daw si Batman!", "2024-05-12 • 11:13am", "Batman", R.drawable.batman, R.drawable.joker));
        posts.add(new Post("Wolverine is recovering from his injuries when he crosses paths with the loudmouth, Deadpool. They team up to defeat a common enemy.", "2024-05-11 • 14:21pm", "Deadpool", R.drawable.deadpool, R.drawable.deadpool_movie_poster));
        posts.add(new Post("Nakita mo tropa mo na may paputok na pimple.", "2024-05-08 • 19:51am", "Thanos The Destroyer", R.drawable.thanos, R.drawable.mind_stone));
        // Add more posts as needed

        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        recyclerView = findViewById(R.id.post_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        postAdapter = new PostAdapter(posts);
        recyclerView.setAdapter(postAdapter);

        swipeRefreshLayout.setOnRefreshListener(this::refreshItems);

    }

    private void refreshItems() {
        // Simulate a delay before stopping the refresh animation
        new Handler().postDelayed(() -> {
            // Stop the refresh animation
            swipeRefreshLayout.setRefreshing(false);
            showSnackbar("Student Testimony Refreshed!");
        }, 2000); // Simulating a 2-second delay before stopping
    }

    private void showSnackbar(String message) {
        Snackbar.make(recyclerView, message, Snackbar.LENGTH_SHORT).show();
    }

}