diff --git a/job/src/main/java/org/apache/kylin/job/streaming/CubeStreamBuilder.java b/job/src/main/java/org/apache/kylin/job/streaming/CubeStreamBuilder.java
index 9ff0b20..6914b73 100644
--- a/job/src/main/java/org/apache/kylin/job/streaming/CubeStreamBuilder.java
+++ b/job/src/main/java/org/apache/kylin/job/streaming/CubeStreamBuilder.java
@@ -378,6 +378,6 @@
 
     @Override
     protected int batchSize() {
-        return 10000;
+        return 1000;
     }
 }
