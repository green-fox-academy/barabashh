package com.greenfoxacademy.reddit.services;

import static java.util.stream.Collectors.toList;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
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
  public List<Post> returnAllPosts(int limit, int pageNumber) {
    int from = pageNumber * 3;
    int to = (pageNumber + 1) * 3;
    return
        ((List<Post>)postRepository.findAll())
        .stream()
        .sorted()
        .limit(limit)
        .skip(from)
        .limit(to - from)
        .collect(toList());
  }

  @Override
  public List<Integer> getPageNumberList(int limit) {
    return IntStream.range(0, limit / 3)
        .boxed()
        .collect(toList());
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
    postRepository.save(new Post("Face masks, where to buy?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Back to Italy after May 4th",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("1st May: no public holiday",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("A good reason to store your tires a home",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Retention offer to handle company closure",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Does alcohol get bad?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Personal experience contracting corona?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Mortgage advaice required",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Tick Prevention - What are you using this…",
        "http://example.com", 11, StringToDate("2017-12-01")));
    postRepository.save(new Post("Money transfer limit from Switzerland to India",
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
