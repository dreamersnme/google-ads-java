// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/user_lists.proto

package com.google.ads.googleads.v0.common;

public interface CombinedRuleUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.CombinedRuleUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo left_operand = 1;</code>
   */
  boolean hasLeftOperand();
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo left_operand = 1;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfo getLeftOperand();
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo left_operand = 1;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfoOrBuilder getLeftOperandOrBuilder();

  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo right_operand = 2;</code>
   */
  boolean hasRightOperand();
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo right_operand = 2;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfo getRightOperand();
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo right_operand = 2;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfoOrBuilder getRightOperandOrBuilder();

  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   */
  int getRuleOperatorValue();
  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   */
  com.google.ads.googleads.v0.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator getRuleOperator();
}
