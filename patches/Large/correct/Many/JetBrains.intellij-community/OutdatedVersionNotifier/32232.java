diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/committed/OutdatedVersionNotifier.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/committed/OutdatedVersionNotifier.java
index 3676245..cfa17a6 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/committed/OutdatedVersionNotifier.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/committed/OutdatedVersionNotifier.java
@@ -113,7 +113,7 @@
       public void run() {
         updateAllEditors();
       }
-    });
+    }, myProject.getDisposed());
   }
 
   private void updateAllEditors() {
