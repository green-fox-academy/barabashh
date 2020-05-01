package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> returnAllPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository
        .findAll()
        .forEach(posts::add);
    List<Post> orderedPosts = posts
        .stream()
        .sorted()
        .collect(Collectors.toList());
    return orderedPosts;
  }

  @Override
  public void addExamplePosts() {
    postRepository.save(new Post("It works as w intended to it in Internext Eplorer",
        "http://example.com", 91));
    postRepository.save(new Post("Polish history in on picture",
        "http://example.com", 55));
    postRepository.save(new Post("Motion sensors were not installed the right way",
        "http://example.com", 24));
    postRepository.save(new Post("This sign at my gym",
        "http://example.com", 11));
  }

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void changeVoteNumberOnPost(Long postId, String change) {
    if (change.equals("plus")) {
      postRepository.changeVoteNumberOnPost(postId, 1);
    }
    if (change.equals("minus")) {
      postRepository.changeVoteNumberOnPost(postId, -1);
    }
  }

}
