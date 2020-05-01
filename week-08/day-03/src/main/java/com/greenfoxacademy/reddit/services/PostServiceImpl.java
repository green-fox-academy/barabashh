package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
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
    return posts
        .stream()
        .sorted()
        .collect(Collectors.toList());
  }

  @Override
  public void addExamplePosts() {
    postRepository.save(new Post("It works as w intended to it in Internext Eplorer",
        "http://example.com", 91, StringToDate("2015-12-06")));
    postRepository.save(new Post("Polish history in on picture",
        "http://example.com", 55, StringToDate("2020-01-16")));
    postRepository.save(new Post("Motion sensors were not installed the right way",
        "http://example.com", 24, StringToDate("2018-02-20")));
    postRepository.save(new Post("This sign at my gym",
        "http://example.com", 11, StringToDate("2017-12-01")));
  }

  public Date StringToDate(String s) {

    Date result = null;
    try {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      result = dateFormat.parse(s);
    } catch (ParseException e) {
      e.printStackTrace();

    }
    return result;
  }

  @Override
  public void addPost(Post post) {
    post.setDate(new Date());
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
