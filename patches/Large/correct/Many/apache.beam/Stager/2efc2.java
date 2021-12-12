diff --git a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/Stager.java b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/Stager.java
index 232e032..3e3c17f 100644
--- a/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/Stager.java
+++ b/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/util/Stager.java
@@ -25,5 +25,5 @@
  */
 public interface Stager {
   /* Stage files and return a list of packages. */
-  public List<DataflowPackage> stageFiles();
+  List<DataflowPackage> stageFiles();
 }
