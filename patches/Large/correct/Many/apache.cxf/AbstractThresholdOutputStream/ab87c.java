diff --git a/api/src/main/java/org/apache/cxf/io/AbstractThresholdOutputStream.java b/api/src/main/java/org/apache/cxf/io/AbstractThresholdOutputStream.java
index 0b5977d..3d8bbab 100644
--- a/api/src/main/java/org/apache/cxf/io/AbstractThresholdOutputStream.java
+++ b/api/src/main/java/org/apache/cxf/io/AbstractThresholdOutputStream.java
@@ -37,7 +37,7 @@
     
     public AbstractThresholdOutputStream(int threshold) {
         this.threshold = threshold;
-        if (threshold > 0) {
+        if (threshold >= 0) {
             buffer = new LoadingByteArrayOutputStream(threshold + 1);
         }
     }
