diff --git a/hbase-client/src/main/java/org/apache/hadoop/hbase/client/HBaseAdmin.java b/hbase-client/src/main/java/org/apache/hadoop/hbase/client/HBaseAdmin.java
index cf6b749..a9bae62 100644
--- a/hbase-client/src/main/java/org/apache/hadoop/hbase/client/HBaseAdmin.java
+++ b/hbase-client/src/main/java/org/apache/hadoop/hbase/client/HBaseAdmin.java
@@ -1148,7 +1148,7 @@
    */
   public void closeRegion(final String regionname, final String serverName)
   throws IOException {
-    closeRegion(Bytes.toBytesBinary(regionname), serverName);
+    closeRegion(Bytes.toBytes(regionname), serverName);
   }
 
   /**
@@ -1266,7 +1266,7 @@
    */
   public void flush(final String tableNameOrRegionName)
   throws IOException, InterruptedException {
-    flush(Bytes.toBytesBinary(tableNameOrRegionName));
+    flush(Bytes.toBytes(tableNameOrRegionName));
   }
 
   /**
@@ -1335,7 +1335,7 @@
    */
   public void compact(final String tableNameOrRegionName)
   throws IOException, InterruptedException {
-    compact(Bytes.toBytesBinary(tableNameOrRegionName));
+    compact(Bytes.toBytes(tableNameOrRegionName));
   }
 
   /**
@@ -1362,7 +1362,7 @@
    */
   public void compact(String tableOrRegionName, String columnFamily)
     throws IOException,  InterruptedException {
-    compact(Bytes.toBytesBinary(tableOrRegionName), Bytes.toBytes(columnFamily));
+    compact(Bytes.toBytes(tableOrRegionName), Bytes.toBytes(columnFamily));
   }
 
   /**
@@ -1389,7 +1389,7 @@
    */
   public void majorCompact(final String tableNameOrRegionName)
   throws IOException, InterruptedException {
-    majorCompact(Bytes.toBytesBinary(tableNameOrRegionName));
+    majorCompact(Bytes.toBytes(tableNameOrRegionName));
   }
 
   /**
@@ -1696,7 +1696,7 @@
    */
   public void split(final String tableNameOrRegionName)
   throws IOException, InterruptedException {
-    split(Bytes.toBytesBinary(tableNameOrRegionName));
+    split(Bytes.toBytes(tableNameOrRegionName));
   }
 
   /**
@@ -1714,7 +1714,7 @@
 
   public void split(final String tableNameOrRegionName,
     final String splitPoint) throws IOException, InterruptedException {
-    split(Bytes.toBytesBinary(tableNameOrRegionName), Bytes.toBytesBinary(splitPoint));
+    split(Bytes.toBytes(tableNameOrRegionName), Bytes.toBytes(splitPoint));
   }
 
   /**
