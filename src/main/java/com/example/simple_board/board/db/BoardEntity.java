package com.example.simple_board.board.db;

import com.example.simple_board.post.db.PostEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;

    private String status;

    // 1:N (board : post)
    @OneToMany(
            mappedBy = "board"
    )
    @Builder.Default
    @Where(clause = "status = 'REGISTERED'")
    @OrderBy(clause = "id desc")
    private List<PostEntity> postList = List.of();
}
