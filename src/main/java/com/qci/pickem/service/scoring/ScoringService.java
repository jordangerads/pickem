package com.qci.pickem.service.scoring;

public interface ScoringService {

    int getScore(long userId, long poolId, int week, int season);
}
