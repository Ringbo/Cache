diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/InjectedGeneralHighlightingPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/InjectedGeneralHighlightingPass.java
index b3d84e0..b1f0775 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/InjectedGeneralHighlightingPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/InjectedGeneralHighlightingPass.java
@@ -104,7 +104,7 @@
       result = injectedResult;
     }
     for (HighlightInfo info : result) {
-      if (myPriorityRange.contains(info)) {
+      if (myRestrictRange.contains(info)) {
         gotHighlights.add(info);
       }
       else {
