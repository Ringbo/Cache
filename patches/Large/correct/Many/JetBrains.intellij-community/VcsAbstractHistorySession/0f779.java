diff --git a/platform/vcs-api/src/com/intellij/openapi/vcs/history/VcsAbstractHistorySession.java b/platform/vcs-api/src/com/intellij/openapi/vcs/history/VcsAbstractHistorySession.java
index 4534bce..60a1d22 100644
--- a/platform/vcs-api/src/com/intellij/openapi/vcs/history/VcsAbstractHistorySession.java
+++ b/platform/vcs-api/src/com/intellij/openapi/vcs/history/VcsAbstractHistorySession.java
@@ -106,6 +106,6 @@
 
   @Override
   public boolean hasLocalSource() {
-    return false;
+    return true;
   }
 }
