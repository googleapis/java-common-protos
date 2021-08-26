/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/bigquery_audit_metadata.proto

package com.google.cloud.audit;

public interface BigQueryAuditMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.BigQueryAuditMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Job insertion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobInsertion job_insertion = 1;</code>
   *
   * @return Whether the jobInsertion field is set.
   */
  boolean hasJobInsertion();
  /**
   *
   *
   * <pre>
   * Job insertion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobInsertion job_insertion = 1;</code>
   *
   * @return The jobInsertion.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.JobInsertion getJobInsertion();
  /**
   *
   *
   * <pre>
   * Job insertion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobInsertion job_insertion = 1;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.JobInsertionOrBuilder getJobInsertionOrBuilder();

  /**
   *
   *
   * <pre>
   * Job state change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobChange job_change = 2;</code>
   *
   * @return Whether the jobChange field is set.
   */
  boolean hasJobChange();
  /**
   *
   *
   * <pre>
   * Job state change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobChange job_change = 2;</code>
   *
   * @return The jobChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.JobChange getJobChange();
  /**
   *
   *
   * <pre>
   * Job state change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.JobChange job_change = 2;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.JobChangeOrBuilder getJobChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Dataset creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetCreation dataset_creation = 3;</code>
   *
   * @return Whether the datasetCreation field is set.
   */
  boolean hasDatasetCreation();
  /**
   *
   *
   * <pre>
   * Dataset creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetCreation dataset_creation = 3;</code>
   *
   * @return The datasetCreation.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetCreation getDatasetCreation();
  /**
   *
   *
   * <pre>
   * Dataset creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetCreation dataset_creation = 3;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetCreationOrBuilder
      getDatasetCreationOrBuilder();

  /**
   *
   *
   * <pre>
   * Dataset change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetChange dataset_change = 4;</code>
   *
   * @return Whether the datasetChange field is set.
   */
  boolean hasDatasetChange();
  /**
   *
   *
   * <pre>
   * Dataset change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetChange dataset_change = 4;</code>
   *
   * @return The datasetChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetChange getDatasetChange();
  /**
   *
   *
   * <pre>
   * Dataset change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetChange dataset_change = 4;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetChangeOrBuilder getDatasetChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Dataset deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetDeletion dataset_deletion = 5;</code>
   *
   * @return Whether the datasetDeletion field is set.
   */
  boolean hasDatasetDeletion();
  /**
   *
   *
   * <pre>
   * Dataset deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetDeletion dataset_deletion = 5;</code>
   *
   * @return The datasetDeletion.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetDeletion getDatasetDeletion();
  /**
   *
   *
   * <pre>
   * Dataset deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.DatasetDeletion dataset_deletion = 5;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.DatasetDeletionOrBuilder
      getDatasetDeletionOrBuilder();

  /**
   *
   *
   * <pre>
   * Table creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableCreation table_creation = 6;</code>
   *
   * @return Whether the tableCreation field is set.
   */
  boolean hasTableCreation();
  /**
   *
   *
   * <pre>
   * Table creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableCreation table_creation = 6;</code>
   *
   * @return The tableCreation.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableCreation getTableCreation();
  /**
   *
   *
   * <pre>
   * Table creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableCreation table_creation = 6;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableCreationOrBuilder getTableCreationOrBuilder();

  /**
   *
   *
   * <pre>
   * Table metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableChange table_change = 8;</code>
   *
   * @return Whether the tableChange field is set.
   */
  boolean hasTableChange();
  /**
   *
   *
   * <pre>
   * Table metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableChange table_change = 8;</code>
   *
   * @return The tableChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableChange getTableChange();
  /**
   *
   *
   * <pre>
   * Table metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableChange table_change = 8;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableChangeOrBuilder getTableChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Table deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDeletion table_deletion = 9;</code>
   *
   * @return Whether the tableDeletion field is set.
   */
  boolean hasTableDeletion();
  /**
   *
   *
   * <pre>
   * Table deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDeletion table_deletion = 9;</code>
   *
   * @return The tableDeletion.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDeletion getTableDeletion();
  /**
   *
   *
   * <pre>
   * Table deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDeletion table_deletion = 9;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDeletionOrBuilder getTableDeletionOrBuilder();

  /**
   *
   *
   * <pre>
   * Table data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataRead table_data_read = 10;</code>
   *
   * @return Whether the tableDataRead field is set.
   */
  boolean hasTableDataRead();
  /**
   *
   *
   * <pre>
   * Table data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataRead table_data_read = 10;</code>
   *
   * @return The tableDataRead.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDataRead getTableDataRead();
  /**
   *
   *
   * <pre>
   * Table data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataRead table_data_read = 10;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDataReadOrBuilder getTableDataReadOrBuilder();

  /**
   *
   *
   * <pre>
   * Table data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataChange table_data_change = 11;</code>
   *
   * @return Whether the tableDataChange field is set.
   */
  boolean hasTableDataChange();
  /**
   *
   *
   * <pre>
   * Table data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataChange table_data_change = 11;</code>
   *
   * @return The tableDataChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDataChange getTableDataChange();
  /**
   *
   *
   * <pre>
   * Table data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.TableDataChange table_data_change = 11;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.TableDataChangeOrBuilder
      getTableDataChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Model deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDeletion model_deletion = 12;</code>
   *
   * @return Whether the modelDeletion field is set.
   */
  boolean hasModelDeletion();
  /**
   *
   *
   * <pre>
   * Model deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDeletion model_deletion = 12;</code>
   *
   * @return The modelDeletion.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDeletion getModelDeletion();
  /**
   *
   *
   * <pre>
   * Model deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDeletion model_deletion = 12;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDeletionOrBuilder getModelDeletionOrBuilder();

  /**
   *
   *
   * <pre>
   * Model creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelCreation model_creation = 13;</code>
   *
   * @return Whether the modelCreation field is set.
   */
  boolean hasModelCreation();
  /**
   *
   *
   * <pre>
   * Model creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelCreation model_creation = 13;</code>
   *
   * @return The modelCreation.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelCreation getModelCreation();
  /**
   *
   *
   * <pre>
   * Model creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelCreation model_creation = 13;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelCreationOrBuilder getModelCreationOrBuilder();

  /**
   *
   *
   * <pre>
   * Model metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelMetadataChange model_metadata_change = 14;
   * </code>
   *
   * @return Whether the modelMetadataChange field is set.
   */
  boolean hasModelMetadataChange();
  /**
   *
   *
   * <pre>
   * Model metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelMetadataChange model_metadata_change = 14;
   * </code>
   *
   * @return The modelMetadataChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelMetadataChange getModelMetadataChange();
  /**
   *
   *
   * <pre>
   * Model metadata change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelMetadataChange model_metadata_change = 14;
   * </code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelMetadataChangeOrBuilder
      getModelMetadataChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Model data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataChange model_data_change = 15;</code>
   *
   * @return Whether the modelDataChange field is set.
   */
  boolean hasModelDataChange();
  /**
   *
   *
   * <pre>
   * Model data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataChange model_data_change = 15;</code>
   *
   * @return The modelDataChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDataChange getModelDataChange();
  /**
   *
   *
   * <pre>
   * Model data change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataChange model_data_change = 15;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDataChangeOrBuilder
      getModelDataChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Model data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataRead model_data_read = 19;</code>
   *
   * @return Whether the modelDataRead field is set.
   */
  boolean hasModelDataRead();
  /**
   *
   *
   * <pre>
   * Model data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataRead model_data_read = 19;</code>
   *
   * @return The modelDataRead.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDataRead getModelDataRead();
  /**
   *
   *
   * <pre>
   * Model data read event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.ModelDataRead model_data_read = 19;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.ModelDataReadOrBuilder getModelDataReadOrBuilder();

  /**
   *
   *
   * <pre>
   * Routine creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineCreation routine_creation = 16;</code>
   *
   * @return Whether the routineCreation field is set.
   */
  boolean hasRoutineCreation();
  /**
   *
   *
   * <pre>
   * Routine creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineCreation routine_creation = 16;</code>
   *
   * @return The routineCreation.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineCreation getRoutineCreation();
  /**
   *
   *
   * <pre>
   * Routine creation event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineCreation routine_creation = 16;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineCreationOrBuilder
      getRoutineCreationOrBuilder();

  /**
   *
   *
   * <pre>
   * Routine change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineChange routine_change = 17;</code>
   *
   * @return Whether the routineChange field is set.
   */
  boolean hasRoutineChange();
  /**
   *
   *
   * <pre>
   * Routine change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineChange routine_change = 17;</code>
   *
   * @return The routineChange.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineChange getRoutineChange();
  /**
   *
   *
   * <pre>
   * Routine change event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineChange routine_change = 17;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineChangeOrBuilder getRoutineChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Routine deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineDeletion routine_deletion = 18;</code>
   *
   * @return Whether the routineDeletion field is set.
   */
  boolean hasRoutineDeletion();
  /**
   *
   *
   * <pre>
   * Routine deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineDeletion routine_deletion = 18;</code>
   *
   * @return The routineDeletion.
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineDeletion getRoutineDeletion();
  /**
   *
   *
   * <pre>
   * Routine deletion event.
   * </pre>
   *
   * <code>.google.cloud.audit.BigQueryAuditMetadata.RoutineDeletion routine_deletion = 18;</code>
   */
  com.google.cloud.audit.BigQueryAuditMetadata.RoutineDeletionOrBuilder
      getRoutineDeletionOrBuilder();

  public com.google.cloud.audit.BigQueryAuditMetadata.EventCase getEventCase();
}