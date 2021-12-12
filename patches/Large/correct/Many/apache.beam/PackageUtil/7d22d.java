diff --git a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/PackageUtil.java b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/PackageUtil.java
index 685d48c..482ddd9 100644
--- a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/PackageUtil.java
+++ b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/PackageUtil.java
@@ -330,7 +330,7 @@
 
     LOG.info(
         "Staging files complete: {} files cached, {} files newly uploaded",
-        numUploaded.get(), numCached.get());
+        numCached.get(), numUploaded.get());
 
     return packages;
   }
