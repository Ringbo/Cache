diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/ColumnStatsUpdateTask.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/ColumnStatsUpdateTask.java
index d6852dc..eb4488a 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/ColumnStatsUpdateTask.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/ColumnStatsUpdateTask.java
@@ -98,7 +98,9 @@
     
     String columnType = colType.get(0);
 
-    if (columnType.equalsIgnoreCase("long")) {
+    if (columnType.equalsIgnoreCase("long") || columnType.equalsIgnoreCase("tinyint")
+            || columnType.equalsIgnoreCase("smallint") || columnType.equalsIgnoreCase("int")
+            || columnType.equalsIgnoreCase("bigint")) {
       LongColumnStatsData longStats = new LongColumnStatsData();
       longStats.setNumNullsIsSet(false);
       longStats.setNumDVsIsSet(false);
@@ -123,7 +125,7 @@
       }
       statsData.setLongStats(longStats);
       statsObj.setStatsData(statsData);
-    } else if (columnType.equalsIgnoreCase("double")) {
+    } else if (columnType.equalsIgnoreCase("double") || columnType.equalsIgnoreCase("float")) {
       DoubleColumnStatsData doubleStats = new DoubleColumnStatsData();
       doubleStats.setNumNullsIsSet(false);
       doubleStats.setNumDVsIsSet(false);
@@ -147,7 +149,8 @@
       }
       statsData.setDoubleStats(doubleStats);
       statsObj.setStatsData(statsData);
-    } else if (columnType.equalsIgnoreCase("string")) {
+    } else if (columnType.equalsIgnoreCase("string") || columnType.toLowerCase().startsWith("char")
+              || columnType.toLowerCase().startsWith("varchar")) { //char(x),varchar(x) types
       StringColumnStatsData stringStats = new StringColumnStatsData();
       stringStats.setMaxColLenIsSet(false);
       stringStats.setAvgColLenIsSet(false);
@@ -213,7 +216,7 @@
       }
       statsData.setBinaryStats(binaryStats);
       statsObj.setStatsData(statsData);
-    } else if (columnType.equalsIgnoreCase("decimal")) {
+    } else if (columnType.toLowerCase().startsWith("decimal")) { //decimal(a,b) type
       DecimalColumnStatsData decimalStats = new DecimalColumnStatsData();
       decimalStats.setNumNullsIsSet(false);
       decimalStats.setNumDVsIsSet(false);
@@ -241,7 +244,8 @@
       }
       statsData.setDecimalStats(decimalStats);
       statsObj.setStatsData(statsData);
-    } else if (columnType.equalsIgnoreCase("date")) {
+    } else if (columnType.equalsIgnoreCase("date")
+            || columnType.equalsIgnoreCase("timestamp")) {
       DateColumnStatsData dateStats = new DateColumnStatsData();
       Map<String, String> mapProp = work.getMapProp();
       for (Entry<String, String> entry : mapProp.entrySet()) {
