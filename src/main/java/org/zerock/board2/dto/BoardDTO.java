package org.zerock.board2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {
    
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private String regdate;
    private String moddate;
}
