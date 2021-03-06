// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/campaign_feed_service.proto

package com.google.ads.googleads.v0.services;

public interface MutateCampaignFeedsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.MutateCampaignFeedsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose campaign feeds are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose campaign feeds are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual campaign feeds.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignFeedOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v0.services.CampaignFeedOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual campaign feeds.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignFeedOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.CampaignFeedOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual campaign feeds.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignFeedOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual campaign feeds.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignFeedOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.services.CampaignFeedOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual campaign feeds.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.CampaignFeedOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.CampaignFeedOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   */
  boolean getValidateOnly();
}
