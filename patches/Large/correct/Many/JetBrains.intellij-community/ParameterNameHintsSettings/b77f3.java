diff --git a/platform/lang-impl/src/com/intellij/codeInsight/hints/settings/ParameterNameHintsSettings.java b/platform/lang-impl/src/com/intellij/codeInsight/hints/settings/ParameterNameHintsSettings.java
index abc0de7..4031518 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/hints/settings/ParameterNameHintsSettings.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/hints/settings/ParameterNameHintsSettings.java
@@ -104,7 +104,7 @@
 
     List<String> diff = ContainerUtil.newArrayList();
     addedItems.forEach((item) -> diff.add('+' + item));
-    removedItems.forEach((item) -> diff.remove('-' + item));
+    removedItems.forEach((item) -> diff.add('-' + item));
 
     state.diff = diff;
   }
