package com.greenfoxacademy.reddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "posts")
public class Post implements Comparable<Post> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String link;
  private int numVotes;
  private Date date;

  public Post() {
  }

  public Post(String title, String link, int numVotes, Date date) {
    this.title = title;
    this.link = link;
    this.numVotes = numVotes;
    this.date = date;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getLink() {
    return link;
  }

  public int getNumVotes() {
    return numVotes;
  }

  @Override
  public int compareTo(Post otherPost) {
    Integer otherNumberOfVotes = otherPost.numVotes;
    return otherNumberOfVotes.compareTo(this.numVotes);
  }
}
