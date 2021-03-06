// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group.proto

package com.google.ads.googleads.v1.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v1/resources/ad_g" +
      "roup.proto\022!google.ads.googleads.v1.reso" +
      "urces\0325google/ads/googleads/v1/common/cu" +
      "stom_parameter.proto\032Dgoogle/ads/googlea" +
      "ds/v1/common/explorer_auto_optimizer_set" +
      "ting.proto\0326google/ads/googleads/v1/comm" +
      "on/targeting_setting.proto\032=google/ads/g" +
      "oogleads/v1/enums/ad_group_ad_rotation_m" +
      "ode.proto\0323google/ads/googleads/v1/enums" +
      "/ad_group_status.proto\0321google/ads/googl" +
      "eads/v1/enums/ad_group_type.proto\0322googl" +
      "e/ads/googleads/v1/enums/bidding_source." +
      "proto\0327google/ads/googleads/v1/enums/tar" +
      "geting_dimension.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\333\014\n\007AdGroup\022\025\n\rresource_name\030\001 \001(\t\022" +
      "\'\n\002id\030\003 \001(\0132\033.google.protobuf.Int64Value" +
      "\022*\n\004name\030\004 \001(\0132\034.google.protobuf.StringV" +
      "alue\022N\n\006status\030\005 \001(\0162>.google.ads.google" +
      "ads.v1.enums.AdGroupStatusEnum.AdGroupSt" +
      "atus\022H\n\004type\030\014 \001(\0162:.google.ads.googlead" +
      "s.v1.enums.AdGroupTypeEnum.AdGroupType\022h" +
      "\n\020ad_rotation_mode\030\026 \001(\0162N.google.ads.go" +
      "ogleads.v1.enums.AdGroupAdRotationModeEn" +
      "um.AdGroupAdRotationMode\022;\n\025tracking_url" +
      "_template\030\r \001(\0132\034.google.protobuf.String" +
      "Value\022N\n\025url_custom_parameters\030\006 \003(\0132/.g" +
      "oogle.ads.googleads.v1.common.CustomPara" +
      "meter\022.\n\010campaign\030\n \001(\0132\034.google.protobu" +
      "f.StringValue\0223\n\016cpc_bid_micros\030\016 \001(\0132\033." +
      "google.protobuf.Int64Value\0223\n\016cpm_bid_mi" +
      "cros\030\017 \001(\0132\033.google.protobuf.Int64Value\022" +
      "6\n\021target_cpa_micros\030\033 \001(\0132\033.google.prot" +
      "obuf.Int64Value\0223\n\016cpv_bid_micros\030\021 \001(\0132" +
      "\033.google.protobuf.Int64Value\0226\n\021target_c" +
      "pm_micros\030\032 \001(\0132\033.google.protobuf.Int64V" +
      "alue\0221\n\013target_roas\030\036 \001(\0132\034.google.proto" +
      "buf.DoubleValue\022;\n\026percent_cpc_bid_micro" +
      "s\030\024 \001(\0132\033.google.protobuf.Int64Value\022e\n\037" +
      "explorer_auto_optimizer_setting\030\025 \001(\0132<." +
      "google.ads.googleads.v1.common.ExplorerA" +
      "utoOptimizerSetting\022n\n\034display_custom_bi" +
      "d_dimension\030\027 \001(\0162H.google.ads.googleads" +
      ".v1.enums.TargetingDimensionEnum.Targeti" +
      "ngDimension\0226\n\020final_url_suffix\030\030 \001(\0132\034." +
      "google.protobuf.StringValue\022K\n\021targeting" +
      "_setting\030\031 \001(\01320.google.ads.googleads.v1" +
      ".common.TargetingSetting\022@\n\033effective_ta" +
      "rget_cpa_micros\030\034 \001(\0132\033.google.protobuf." +
      "Int64Value\022c\n\033effective_target_cpa_sourc" +
      "e\030\035 \001(\0162>.google.ads.googleads.v1.enums." +
      "BiddingSourceEnum.BiddingSource\022;\n\025effec" +
      "tive_target_roas\030\037 \001(\0132\034.google.protobuf" +
      ".DoubleValue\022d\n\034effective_target_roas_so" +
      "urce\030  \001(\0162>.google.ads.googleads.v1.enu" +
      "ms.BiddingSourceEnum.BiddingSourceB\371\001\n%c" +
      "om.google.ads.googleads.v1.resourcesB\014Ad" +
      "GroupProtoP\001ZJgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v1/resources;r" +
      "esources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      ".Resources\312\002!Google\\Ads\\GoogleAds\\V1\\Res" +
      "ources\352\002%Google::Ads::GoogleAds::V1::Res" +
      "ourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.common.ExplorerAutoOptimizerSettingProto.getDescriptor(),
          com.google.ads.googleads.v1.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.TargetingDimensionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "ExplorerAutoOptimizerSetting", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", });
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.common.ExplorerAutoOptimizerSettingProto.getDescriptor();
    com.google.ads.googleads.v1.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v1.enums.TargetingDimensionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
