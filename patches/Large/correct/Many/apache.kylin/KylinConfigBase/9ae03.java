diff --git a/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java b/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
index 073662b..6f1dfd9 100644
--- a/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
+++ b/core-common/src/main/java/org/apache/kylin/common/KylinConfigBase.java
@@ -1046,7 +1046,7 @@
     }
 
     public int getQueryStorageVisitScanRangeMax() {
-        return Integer.valueOf(this.getOptional("kylin.storage.hbase.max-visit-scanrange", "1000000"));
+        return Integer.parseInt(this.getOptional("kylin.storage.hbase.max-visit-scanrange", "1000000"));
     }
 
     public String getDefaultIGTStorage() {
@@ -1059,7 +1059,7 @@
     }
 
     public float getKylinHBaseRegionCut() {
-        return Float.valueOf(getOptional("kylin.storage.hbase.region-cut-gb", "5.0"));
+        return Float.parseFloat(getOptional("kylin.storage.hbase.region-cut-gb", "5.0"));
     }
 
     public int getHBaseScanMaxResultSize() {
@@ -1075,11 +1075,11 @@
     }
 
     public int getHbaseDefaultBlockSize() {
-        return Integer.valueOf(getOptional("kylin.storage.hbase.block-size-bytes", "1048576"));
+        return Integer.parseInt(getOptional("kylin.storage.hbase.block-size-bytes", "1048576"));
     }
 
     public int getHbaseSmallFamilyBlockSize() {
-        return Integer.valueOf(getOptional("kylin.storage.hbase.small-family-block-size-bytes", "65536"));
+        return Integer.parseInt(getOptional("kylin.storage.hbase.small-family-block-size-bytes", "65536"));
     }
 
     public String getKylinOwner() {
@@ -1242,15 +1242,15 @@
     }
 
     public float getSparkRDDPartitionCutMB() {
-        return Float.valueOf(getOptional("kylin.engine.spark.rdd-partition-cut-mb", "10.0"));
+        return Float.parseFloat(getOptional("kylin.engine.spark.rdd-partition-cut-mb", "10.0"));
     }
 
     public int getSparkMinPartition() {
-        return Integer.valueOf(getOptional("kylin.engine.spark.min-partition", "1"));
+        return Integer.parseInt(getOptional("kylin.engine.spark.min-partition", "1"));
     }
 
     public int getSparkMaxPartition() {
-        return Integer.valueOf(getOptional("kylin.engine.spark.max-partition", "5000"));
+        return Integer.parseInt(getOptional("kylin.engine.spark.max-partition", "5000"));
     }
 
     public String getSparkStorageLevel() {
@@ -1266,10 +1266,10 @@
     // ============================================================================
 
     public boolean isDictionaryEnumeratorEnabled() {
-        return Boolean.valueOf(getOptional("kylin.query.enable-dict-enumerator", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.query.enable-dict-enumerator", "false"));
     }
 
-    public Boolean isEnumerableRulesEnabled() {
+    public boolean isEnumerableRulesEnabled() {
         return Boolean.parseBoolean(getOptional("kylin.query.calcite.enumerable-rules-enabled", "false"));
     }
 
@@ -1278,7 +1278,7 @@
     }
 
     public boolean isConvertCreateTableToWith() {
-        return Boolean.valueOf(getOptional("kylin.query.convert-create-table-to-with", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.query.convert-create-table-to-with", "false"));
     }
 
     /**
@@ -1318,16 +1318,16 @@
     // check KYLIN-3358, need deploy coprocessor if enabled
     // finally should be deprecated
     public boolean isDynamicColumnEnabled() {
-        return Boolean.valueOf(getOptional("kylin.query.enable-dynamic-column", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.query.enable-dynamic-column", "false"));
     }
 
     //check KYLIN-1684, in most cases keep the default value
     public boolean isSkippingEmptySegments() {
-        return Boolean.valueOf(getOptional("kylin.query.skip-empty-segments", "true"));
+        return Boolean.parseBoolean(getOptional("kylin.query.skip-empty-segments", "true"));
     }
 
     public boolean isDisableCubeNoAggSQL() {
-        return Boolean.valueOf(getOptional("kylin.query.disable-cube-noagg-sql", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.query.disable-cube-noagg-sql", "false"));
     }
 
     public boolean isStreamAggregateEnabled() {
@@ -1529,11 +1529,11 @@
     }
 
     public boolean isTableACLEnabled() {
-        return Boolean.valueOf(this.getOptional("kylin.query.security.table-acl-enabled", "true"));
+        return Boolean.parseBoolean(this.getOptional("kylin.query.security.table-acl-enabled", "true"));
     }
 
     public boolean isEscapeDefaultKeywordEnabled() {
-        return Boolean.valueOf(this.getOptional("kylin.query.escape-default-keyword", "false"));
+        return Boolean.parseBoolean(this.getOptional("kylin.query.escape-default-keyword", "false"));
     }
 
     public String getQueryRealizationFilter() {
@@ -1566,7 +1566,7 @@
     }
 
     public long getSequenceExpireTime() {
-        return Long.valueOf(this.getOptional("kylin.server.sequence-sql.expire-time", "86400000"));//default a day
+        return Long.parseLong(this.getOptional("kylin.server.sequence-sql.expire-time", "86400000"));//default a day
     }
 
     public boolean getQueryMetricsEnabled() {
@@ -1583,11 +1583,11 @@
     }
 
     public int getServerUserCacheExpireSeconds() {
-        return Integer.valueOf(this.getOptional("kylin.server.auth-user-cache.expire-seconds", "300"));
+        return Integer.parseInt(this.getOptional("kylin.server.auth-user-cache.expire-seconds", "300"));
     }
 
     public int getServerUserCacheMaxEntries() {
-        return Integer.valueOf(this.getOptional("kylin.server.auth-user-cache.max-entries", "100"));
+        return Integer.parseInt(this.getOptional("kylin.server.auth-user-cache.max-entries", "100"));
     }
 
     public String getExternalAclProvider() {
@@ -1651,11 +1651,11 @@
     // ============================================================================
 
     public int getRestClientDefaultMaxPerRoute() {
-        return Integer.valueOf(this.getOptional("kylin.restclient.connection.default-max-per-route", "20"));
+        return Integer.parseInt(this.getOptional("kylin.restclient.connection.default-max-per-route", "20"));
     }
 
     public int getRestClientMaxTotal() {
-        return Integer.valueOf(this.getOptional("kylin.restclient.connection.max-total", "200"));
+        return Integer.parseInt(this.getOptional("kylin.restclient.connection.max-total", "200"));
     }
 
     // ============================================================================
@@ -1680,11 +1680,11 @@
     }
 
     public boolean isShowingGuiTraceToggle() {
-        return Boolean.valueOf(getOptional("kylin.htrace.show-gui-trace-toggle", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.htrace.show-gui-trace-toggle", "false"));
     }
 
     public boolean isHtraceTracingEveryQuery() {
-        return Boolean.valueOf(getOptional("kylin.htrace.trace-every-query", "false"));
+        return Boolean.parseBoolean(getOptional("kylin.htrace.trace-every-query", "false"));
     }
 
     public boolean isKylinMetricsMonitorEnabled() {
@@ -1772,7 +1772,7 @@
     }
 
     public boolean isJsonAlwaysSmallCell() {
-        return Boolean.valueOf(getOptional("kylin.metadata.jdbc.json-always-small-cell", "true"));
+        return Boolean.parseBoolean(getOptional("kylin.metadata.jdbc.json-always-small-cell", "true"));
     }
 
     public int getSmallCellMetadataWarningThreshold() {
