package study.datajpa.dto;

import lombok.Data;

@Data   // DTO는 getter/setter 다 존재해서 Data Annotation 사용을 권장하지 않음. 테스트 용도로 사용
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
