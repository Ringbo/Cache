diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/UpdaterTreeState.java b/platform/platform-api/src/com/intellij/ide/util/treeView/UpdaterTreeState.java
index e129bc5..111931a 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/UpdaterTreeState.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/UpdaterTreeState.java
@@ -280,7 +280,7 @@
 
           processHangByParent(hangByParent).notify(result);
         }
-      }, true, true, true);
+      }, false, true, true);
     } else {
       result.setDone();
     }
