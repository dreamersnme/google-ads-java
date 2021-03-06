// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad_type_infos.proto

package com.google.ads.googleads.v0.common;

public interface GmailAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.GmailAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.GmailTeaser teaser = 1;</code>
   */
  boolean hasTeaser();
  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.GmailTeaser teaser = 1;</code>
   */
  com.google.ads.googleads.v0.common.GmailTeaser getTeaser();
  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.GmailTeaser teaser = 1;</code>
   */
  com.google.ads.googleads.v0.common.GmailTeaserOrBuilder getTeaserOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue header_image = 2;</code>
   */
  boolean hasHeaderImage();
  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue header_image = 2;</code>
   */
  com.google.protobuf.StringValue getHeaderImage();
  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue header_image = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeaderImageOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 3;</code>
   */
  boolean hasMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 3;</code>
   */
  com.google.protobuf.StringValue getMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMarketingImageOrBuilder();

  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_headline = 4;</code>
   */
  boolean hasMarketingImageHeadline();
  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_headline = 4;</code>
   */
  com.google.protobuf.StringValue getMarketingImageHeadline();
  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_headline = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMarketingImageHeadlineOrBuilder();

  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_description = 5;</code>
   */
  boolean hasMarketingImageDescription();
  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_description = 5;</code>
   */
  com.google.protobuf.StringValue getMarketingImageDescription();
  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image_description = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMarketingImageDescriptionOrBuilder();

  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   */
  boolean hasMarketingImageDisplayCallToAction();
  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   */
  com.google.ads.googleads.v0.common.DisplayCallToAction getMarketingImageDisplayCallToAction();
  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   */
  com.google.ads.googleads.v0.common.DisplayCallToActionOrBuilder getMarketingImageDisplayCallToActionOrBuilder();
}
