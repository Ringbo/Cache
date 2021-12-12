diff --git a/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveMetadataProvider.java b/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveMetadataProvider.java
index e80b37b..8abc79a 100644
--- a/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveMetadataProvider.java
+++ b/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveMetadataProvider.java
@@ -1,4 +1,4 @@
-/**
+/*
  * Licensed to the Apache Software Foundation (ASF) under one
  * or more contributor license agreements.  See the NOTICE file
  * distributed with this work for additional information
@@ -194,8 +194,9 @@
    * Get the stats from table properties. If not found -1 is returned for each stats field.
    * CAUTION: stats may not be up-to-date with the underlying data. It is always good to run the ANALYZE command on
    * Hive table to have up-to-date stats.
-   * @param properties
-   * @return
+   *
+   * @param properties the source of table stats
+   * @return {@link HiveStats} instance with rows number and size in bytes from specified properties
    */
   private HiveStats getStatsFromProps(final Properties properties) {
     long numRows = -1;
@@ -208,7 +209,7 @@
 
       final String sizeInBytesProp = properties.getProperty(StatsSetupConst.TOTAL_SIZE);
       if (sizeInBytesProp != null) {
-        sizeInBytes = Long.valueOf(numRowsProp);
+        sizeInBytes = Long.valueOf(sizeInBytesProp);
       }
     } catch (final NumberFormatException e) {
       logger.error("Failed to parse Hive stats in metastore.", e);
