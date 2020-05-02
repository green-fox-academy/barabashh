package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
  List<Post> returnAllPosts(int limit, int pageNumber);
  List<Integer> getPageNumberList(int limit);
  void addExamplePosts();
  void addPost(Post post);
  void changeVoteNumberOnPost(Long postId, String change);
}
