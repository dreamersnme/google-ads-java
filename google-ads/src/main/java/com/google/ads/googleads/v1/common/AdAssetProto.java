// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/ad_asset.proto

package com.google.ads.googleads.v1.common;

public final class AdAssetProto {
  private AdAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_AdTextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_AdTextAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v1/common/ad_asse" +
      "t.proto\022\036google.ads.googleads.v1.common\032" +
      ";google/ads/googleads/v1/enums/served_as" +
      "set_field_type.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\235\001\n\013AdTextAsset\022*\n\004text\030\001 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022b\n\014pinned_field\030\002" +
      " \001(\0162L.google.ads.googleads.v1.enums.Ser" +
      "vedAssetFieldTypeEnum.ServedAssetFieldTy" +
      "peB\347\001\n\"com.google.ads.googleads.v1.commo" +
      "nB\014AdAssetProtoP\001ZDgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v1/common" +
      ";common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V1." +
      "Common\312\002\036Google\\Ads\\GoogleAds\\V1\\Common\352" +
      "\002\"Google::Ads::GoogleAds::V1::Commonb\006pr" +
      "oto3"
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
          com.google.ads.googleads.v1.enums.ServedAssetFieldTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_common_AdTextAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_common_AdTextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_AdTextAsset_descriptor,
        new java.lang.String[] { "Text", "PinnedField", });
    com.google.ads.googleads.v1.enums.ServedAssetFieldTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
