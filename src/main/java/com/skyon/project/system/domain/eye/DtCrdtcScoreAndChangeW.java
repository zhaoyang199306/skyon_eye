package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_CRDTC_SCORE_AND_CHANGE_W
 * 征信_征信评分及变化
 */
public class DtCrdtcScoreAndChangeW extends EyeBaseEntity {

    private BigDecimal currCrdtcScoreScore; // 当前征信评分分数
    private String oppoPosition; //相对位置
    private String scoreExplain; // 分数解读
    private BigDecimal linkRelatScore; //当前征信评分分数较上期分数
    private BigDecimal linkRelatScoreChangeRatio; //当前征信评分分数较上期分数_变动比例
    private String linkRelatScoreOppoPosition; //当前征信评分分数较上期分数_相对位置

    public BigDecimal getCurrCrdtcScoreScore() {
        return currCrdtcScoreScore;
    }

    public void setCurrCrdtcScoreScore(BigDecimal currCrdtcScoreScore) {
        this.currCrdtcScoreScore = currCrdtcScoreScore;
    }

    public String getOppoPosition() {
        return oppoPosition;
    }

    public void setOppoPosition(String oppoPosition) {
        this.oppoPosition = oppoPosition;
    }

    public String getScoreExplain() {
        return scoreExplain;
    }

    public void setScoreExplain(String scoreExplain) {
        this.scoreExplain = scoreExplain;
    }

    public BigDecimal getLinkRelatScore() {
        return linkRelatScore;
    }

    public void setLinkRelatScore(BigDecimal linkRelatScore) {
        this.linkRelatScore = linkRelatScore;
    }

    public BigDecimal getLinkRelatScoreChangeRatio() {
        return linkRelatScoreChangeRatio;
    }

    public void setLinkRelatScoreChangeRatio(BigDecimal linkRelatScoreChangeRatio) {
        this.linkRelatScoreChangeRatio = linkRelatScoreChangeRatio;
    }

    public String getLinkRelatScoreOppoPosition() {
        return linkRelatScoreOppoPosition;
    }

    public void setLinkRelatScoreOppoPosition(String linkRelatScoreOppoPosition) {
        this.linkRelatScoreOppoPosition = linkRelatScoreOppoPosition;
    }
}
