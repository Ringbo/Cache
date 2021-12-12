diff --git a/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkJobServerDriver.java b/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkJobServerDriver.java
index 13f48c5..0f567f6 100644
--- a/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkJobServerDriver.java
+++ b/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkJobServerDriver.java
@@ -130,7 +130,7 @@
     this.configuration = configuration;
     this.executor = executor;
     this.jobServerFactory = jobServerFactory;
-    this.artifactServerFactory = jobServerFactory;
+    this.artifactServerFactory = artifactServerFactory;
   }
 
   @Override
