// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/distribution.proto

package com.google.api;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of values in the population. Must be non-negative. This value
   * must equal the sum of the values in `bucket_counts` if a histogram is
   * provided.
   * </pre>
   *
   * <code>int64 count = 1;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * The arithmetic mean of the values in the population. If `count` is zero
   * then this field must be zero.
   * </pre>
   *
   * <code>double mean = 2;</code>
   * @return The mean.
   */
  double getMean();

  /**
   * <pre>
   * The sum of squared deviations from the mean of the values in the
   * population. For values x_i this is:
   *     Sum[i=1..n]((x_i - mean)^2)
   * Knuth, "The Art of Computer Programming", Vol. 2, page 232, 3rd edition
   * describes Welford's method for accumulating this sum in one pass.
   * If `count` is zero then this field must be zero.
   * </pre>
   *
   * <code>double sum_of_squared_deviation = 3;</code>
   * @return The sumOfSquaredDeviation.
   */
  double getSumOfSquaredDeviation();

  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   * @return The range.
   */
  com.google.api.Distribution.Range getRange();
  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   */
  com.google.api.Distribution.RangeOrBuilder getRangeOrBuilder();

  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   * @return Whether the bucketOptions field is set.
   */
  boolean hasBucketOptions();
  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   * @return The bucketOptions.
   */
  com.google.api.Distribution.BucketOptions getBucketOptions();
  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   */
  com.google.api.Distribution.BucketOptionsOrBuilder getBucketOptionsOrBuilder();

  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   * @return A list containing the bucketCounts.
   */
  java.util.List<java.lang.Long> getBucketCountsList();
  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   * @return The count of bucketCounts.
   */
  int getBucketCountsCount();
  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   * @param index The index of the element to return.
   * @return The bucketCounts at the given index.
   */
  long getBucketCounts(int index);

  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  java.util.List<com.google.api.Distribution.Exemplar> 
      getExemplarsList();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  com.google.api.Distribution.Exemplar getExemplars(int index);
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  int getExemplarsCount();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  java.util.List<? extends com.google.api.Distribution.ExemplarOrBuilder> 
      getExemplarsOrBuilderList();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  com.google.api.Distribution.ExemplarOrBuilder getExemplarsOrBuilder(
      int index);
}