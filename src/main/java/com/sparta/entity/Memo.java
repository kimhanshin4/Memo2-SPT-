package com.sparta.entity;

import jakarta.persistence.*;

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정 // default = 해당 Class 명, @Entity(name = "") 이름지정 가능
@Table(name = "memo") // 매핑할 테이블의 이름을 지정
public class Memo {

    @Id //table의 기본키 지정 //Entity에서 굉장히 중요
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK가 중복되지 않게 Auto Increment를 사용 //test를 위한 해제

    private Long id;

    // nullable: null 허용 여부
    // unique: 중복 허용 여부 (false 일때 중복 허용)
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}