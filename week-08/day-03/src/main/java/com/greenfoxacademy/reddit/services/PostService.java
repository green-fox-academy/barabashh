package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
  public List<Post> returnAllPosts();
  public void addExamplePosts();
  public void addPost(Post post);
}
