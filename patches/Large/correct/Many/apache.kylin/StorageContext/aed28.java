diff --git a/core-storage/src/main/java/org/apache/kylin/storage/StorageContext.java b/core-storage/src/main/java/org/apache/kylin/storage/StorageContext.java
index a3a851f..21a926b 100644
--- a/core-storage/src/main/java/org/apache/kylin/storage/StorageContext.java
+++ b/core-storage/src/main/java/org/apache/kylin/storage/StorageContext.java
@@ -64,7 +64,7 @@
     }
 
     public int getLimit() {
-        if (overlookOuterLimit) {
+        if (overlookOuterLimit || BackdoorToggles.getStatementMaxRows() == null) {
             return limit;
         } else {
             return Math.min(limit, BackdoorToggles.getStatementMaxRows());
