// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_budget.proto

package com.google.ads.googleads.v1.resources;

public final class CampaignBudgetProto {
  private CampaignBudgetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_CampaignBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_CampaignBudget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v1/resources/camp" +
      "aign_budget.proto\022!google.ads.googleads." +
      "v1.resources\032:google/ads/googleads/v1/en" +
      "ums/budget_delivery_method.proto\0321google" +
      "/ads/googleads/v1/enums/budget_period.pr" +
      "oto\0321google/ads/googleads/v1/enums/budge" +
      "t_status.proto\032\036google/protobuf/wrappers" +
      ".proto\032\034google/api/annotations.proto\"\307\010\n" +
      "\016CampaignBudget\022\025\n\rresource_name\030\001 \001(\t\022\'" +
      "\n\002id\030\003 \001(\0132\033.google.protobuf.Int64Value\022" +
      "*\n\004name\030\004 \001(\0132\034.google.protobuf.StringVa" +
      "lue\0222\n\ramount_micros\030\005 \001(\0132\033.google.prot" +
      "obuf.Int64Value\0228\n\023total_amount_micros\030\n" +
      " \001(\0132\033.google.protobuf.Int64Value\022L\n\006sta" +
      "tus\030\006 \001(\0162<.google.ads.googleads.v1.enum" +
      "s.BudgetStatusEnum.BudgetStatus\022e\n\017deliv" +
      "ery_method\030\007 \001(\0162L.google.ads.googleads." +
      "v1.enums.BudgetDeliveryMethodEnum.Budget" +
      "DeliveryMethod\0225\n\021explicitly_shared\030\010 \001(" +
      "\0132\032.google.protobuf.BoolValue\0224\n\017referen" +
      "ce_count\030\t \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022:\n\026has_recommended_budget\030\013 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue\022E\n recommended_b" +
      "udget_amount_micros\030\014 \001(\0132\033.google.proto" +
      "buf.Int64Value\022L\n\006period\030\r \001(\0162<.google." +
      "ads.googleads.v1.enums.BudgetPeriodEnum." +
      "BudgetPeriod\022V\n1recommended_budget_estim" +
      "ated_change_weekly_clicks\030\016 \001(\0132\033.google" +
      ".protobuf.Int64Value\022[\n6recommended_budg" +
      "et_estimated_change_weekly_cost_micros\030\017" +
      " \001(\0132\033.google.protobuf.Int64Value\022\\\n7rec" +
      "ommended_budget_estimated_change_weekly_" +
      "interactions\030\020 \001(\0132\033.google.protobuf.Int" +
      "64Value\022U\n0recommended_budget_estimated_" +
      "change_weekly_views\030\021 \001(\0132\033.google.proto" +
      "buf.Int64ValueB\200\002\n%com.google.ads.google" +
      "ads.v1.resourcesB\023CampaignBudgetProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v1/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V1.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V1\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V1::Resourcesb\006proto" +
      "3"
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
          com.google.ads.googleads.v1.enums.BudgetDeliveryMethodProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BudgetPeriodProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BudgetStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_CampaignBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_CampaignBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_CampaignBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "AmountMicros", "TotalAmountMicros", "Status", "DeliveryMethod", "ExplicitlyShared", "ReferenceCount", "HasRecommendedBudget", "RecommendedBudgetAmountMicros", "Period", "RecommendedBudgetEstimatedChangeWeeklyClicks", "RecommendedBudgetEstimatedChangeWeeklyCostMicros", "RecommendedBudgetEstimatedChangeWeeklyInteractions", "RecommendedBudgetEstimatedChangeWeeklyViews", });
    com.google.ads.googleads.v1.enums.BudgetDeliveryMethodProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BudgetPeriodProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BudgetStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
