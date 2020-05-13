package com.greenfoxacademy.reddit;

import static com.greenfoxacademy.reddit.services.PostServiceImpl.StringToDate;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
//import static com.shazam.shazamcrest.util.AssertionHelper.sameBeanAs;

public class PostServiceImplTests {

  @Test
  public void returnAllPostsLimit15PageNUmber1ShouldReturnTheCorrect3Posts() {
    ///AAA pattern
    //Arrange

    PostRepository postRepository = Mockito.mock(PostRepository.class);
    PostServiceImpl postService = new PostServiceImpl(postRepository);

    List<Post> fakePosts = new ArrayList<>();
    fakePosts.add(new Post("It works as w intended to it in Internext Eplorer",
        "http://example.com", 91, StringToDate("2015-12-06")));
    fakePosts.add(new Post("Polish history in on picture",
        "http://example.com", 55, StringToDate("2020-01-16")));
    fakePosts.add(new Post("Motion sensors were not installed the right way",
        "http://example.com", 24, StringToDate("2018-02-20")));
    fakePosts.add(new Post("This sign at my gym",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Face masks, where to buy?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Back to Italy after May 4th",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("1st May: no public holiday",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("A good reason to store your tires a home",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Retention offer to handle company closure",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Does alcohol get bad?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Personal experience contracting corona?",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Mortgage advaice required",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Tick Prevention - What are you using this…",
        "http://example.com", 11, StringToDate("2017-12-01")));
    fakePosts.add(new Post("Money transfer limit from Switzerland to India",
        "http://example.com", 11, StringToDate("2017-12-01")));

    Mockito.when(postRepository.findAll()).thenReturn(fakePosts);

    List<Post> threeReturnedPosts = new ArrayList<>();

    threeReturnedPosts.add(new Post("Retention offer to handle company closure",
        "http://example.com", 11, StringToDate("2017-12-01")));
    threeReturnedPosts.add(new Post("This sign at my gym",
        "http://example.com", 11, StringToDate("2017-12-01")));
    threeReturnedPosts.add(new Post("Tick Prevention - What are you using this…",
        "http://example.com", 11, StringToDate("2017-12-01")));

    //Act
    List<Post> posts = postService.returnAllPosts(15, 1);

    //Assert
    List<Post> orderedlist1 = posts
        .stream()
        .sorted()
        .collect(Collectors.toList());

    List<Post> orderedlist2 = threeReturnedPosts
        .stream()
        .sorted()
        .collect(Collectors.toList());

    Assert.assertEquals(3, posts.size());
    Assert.assertThat(orderedlist1.get(1).getTitle(), is(orderedlist2.get(1).getTitle()));

    for (int i = 0; i < orderedlist1.size(); i++) {
      Assert.assertThat(orderedlist1.get(i), samePropertyValuesAs(orderedlist2.get(i)));
    }

  }

}

