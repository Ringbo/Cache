diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/NullityInference.java b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/NullityInference.java
index 84c10fa..e77a947 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/NullityInference.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/dataFlow/NullityInference.java
@@ -111,7 +111,7 @@
         return Nullness.NULLABLE;
       }
       
-      if (delegates.size() > 1) {
+      if (hasErrors.get() || delegates.size() > 1) {
         return Nullness.UNKNOWN;
       }
 
