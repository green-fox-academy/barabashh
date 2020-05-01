package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {

  @Transactional
  @Modifying
  @Query(value = "UPDATE posts SET num_votes = num_votes + ?2 WHERE id = ?1", nativeQuery = true)
  void changeVoteNumberOnPost(Long postId, int change);
}
