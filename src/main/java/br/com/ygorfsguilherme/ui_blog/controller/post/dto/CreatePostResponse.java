package br.com.ygorfsguilherme.ui_blog.controller.post.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import br.com.ygorfsguilherme.ui_blog.entity.TagEntity;

/**
 * Esta classe está obsoleta e será removida na versão futura.
 * Use a classe `PostResponse.class` no lugar para melhor performance e funcionalidades.
 *
 * @deprecated Desde a versão 0.2.0. Será removida na versão 1.0.0.
 */
@Deprecated(since = "0.2.0", forRemoval = true)
public class CreatePostResponse {
    UUID id;
    String title;
    String content;
    List<TagEntity> tags;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public CreatePostResponse(UUID id, String title, String content, List<TagEntity> tags, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public UUID getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public List<TagEntity> getTags() {
        return tags;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
