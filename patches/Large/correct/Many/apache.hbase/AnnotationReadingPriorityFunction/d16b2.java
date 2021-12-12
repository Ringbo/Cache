diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/AnnotationReadingPriorityFunction.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/AnnotationReadingPriorityFunction.java
index 24fa862..b777589 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/AnnotationReadingPriorityFunction.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/AnnotationReadingPriorityFunction.java
@@ -171,7 +171,7 @@
       return HConstants.NORMAL_QOS;
     }
 
-    if (methodName.equals("scan")) { // scanner methods...
+    if (methodName.equalsIgnoreCase("scan")) { // scanner methods...
       ScanRequest request = (ScanRequest)param;
       if (!request.hasScannerId()) {
         return HConstants.NORMAL_QOS;
