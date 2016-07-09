package com.askweek.domain;

/**
 * 问题实体
 * Created by zzp on 7/9/16.
 */
public class Question implements Entity {

    private User asker;
    private User answerer;
    private String content;
    private Answer answer;
    private Status status;

    /**
     * 问题状态
     */
    enum Status {
        ASKED, ANSWERED, REJECTED;
    }
}
