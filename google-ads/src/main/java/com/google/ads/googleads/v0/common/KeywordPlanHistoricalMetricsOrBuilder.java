// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/keyword_plan_common.proto

package com.google.ads.googleads.v0.common;

public interface KeywordPlanHistoricalMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.KeywordPlanHistoricalMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  boolean hasAvgMonthlySearches();
  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  com.google.protobuf.Int64Value getAvgMonthlySearches();
  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAvgMonthlySearchesOrBuilder();

  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   */
  int getCompetitionValue();
  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   */
  com.google.ads.googleads.v0.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel getCompetition();
}
