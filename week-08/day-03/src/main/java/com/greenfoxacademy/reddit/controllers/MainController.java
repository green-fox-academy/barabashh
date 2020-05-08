package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  final int NUMBER_OF_POSTS_RETURNED = 15;
  private PostService postService;
  private int currentPageNumber = 0;

  @Autowired
  public MainController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/listposts/{pageNumber}")
  public String listPostsWithPageNumber(@PathVariable Integer pageNumber, Model model) {
    currentPageNumber = pageNumber;
    return "redirect:/listposts";
  }

  @GetMapping("/listposts")
  public String listPosts(Model model) {
    model.addAttribute("posts",
        postService.returnAllPosts(NUMBER_OF_POSTS_RETURNED, currentPageNumber));
    model.addAttribute("pageNumbers",
        postService.getPageNumberList(NUMBER_OF_POSTS_RETURNED));
    return "postslist";
  }

  @GetMapping("/addpost")
  public String getAddPostsPage(Model model) {
    model.addAttribute("post", new Post());
    return "addpost";
  }

  @PostMapping("/addpost")
  public String addPosts(@Valid @ModelAttribute Post post, BindingResult bindingResult) {
    if (bindingResult.hasErrors()){
      return "addpost";
    }
    postService.addPost(post);
    return "redirect:/listposts";
  }

  @GetMapping("/changevote/{postId}/{change}")
  public String changeVote(@PathVariable(name = "postId") Long postId,
                           @PathVariable(name = "change") String change) {
    postService.changeVoteNumberOnPost(postId, change);
    return "redirect:/listposts";
  }
}
