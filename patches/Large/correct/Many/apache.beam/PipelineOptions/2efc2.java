diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptions.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptions.java
index 5588543..2139ed9 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptions.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptions.java
@@ -226,7 +226,7 @@
   /**
    * Enumeration of the possible states for a given check.
    */
-  public static enum CheckEnabled {
+  enum CheckEnabled {
     OFF,
     WARNING,
     ERROR
@@ -299,7 +299,7 @@
    * <p>The normalization makes sure that the name matches the pattern of
    * [a-z]([-a-z0-9]*[a-z0-9])?.
    */
-  static class JobNameFactory implements DefaultValueFactory<String> {
+  class JobNameFactory implements DefaultValueFactory<String> {
     private static final DateTimeFormatter FORMATTER =
         DateTimeFormat.forPattern("MMddHHmmss").withZone(DateTimeZone.UTC);
 
