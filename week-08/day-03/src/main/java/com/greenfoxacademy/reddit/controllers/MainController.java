package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private PostService postService;

  @Autowired
  public MainController(PostService postService) {
    this.postService = postService;
    //this.postService.addExamplePosts();
  }

  @GetMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("postList", postService.returnAllPosts());
    return "postslist";
  }

  @GetMapping("/addpost")
  public String getAddPostsPage(Model model) {
    model.addAttribute("post", new Post());
    return "addpost";
  }

  @PostMapping("/addpost")
  public String addPosts(@ModelAttribute(value = "post") Post post) {
    postService.addPost(post);
    return "redirect:/";
  }

  @GetMapping("/changevote/{postId}/{change}")
  public String changeVote(@PathVariable(name = "postId") Long postId,
                           @PathVariable(name = "change") String change){
    if (change.equals("plus")) postService.changeVoteNumberOnPost(postId, 1);
    if (change.equals("minus")) postService.changeVoteNumberOnPost(postId, -1);

    return "redirect:/";
  }
}
