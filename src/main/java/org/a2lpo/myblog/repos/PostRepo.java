package org.a2lpo.myblog.repos;

import org.a2lpo.myblog.entyties.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
}

