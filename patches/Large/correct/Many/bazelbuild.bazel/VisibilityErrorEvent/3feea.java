diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/VisibilityErrorEvent.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/VisibilityErrorEvent.java
index a2c51a8..5842a8e 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/VisibilityErrorEvent.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/VisibilityErrorEvent.java
@@ -30,7 +30,7 @@
   Label label;
   String errorMessage;
 
-  VisibilityErrorEvent(BuildConfiguration configuration, Label label, String errorMessage) {
+  public VisibilityErrorEvent(BuildConfiguration configuration, Label label, String errorMessage) {
     this.configuration = configuration;
     this.label = label;
     this.errorMessage = errorMessage;
