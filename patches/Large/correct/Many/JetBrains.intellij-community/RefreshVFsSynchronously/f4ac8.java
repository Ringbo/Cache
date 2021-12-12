diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/update/RefreshVFsSynchronously.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/update/RefreshVFsSynchronously.java
index b60f678..045c438 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/update/RefreshVFsSynchronously.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/update/RefreshVFsSynchronously.java
@@ -152,7 +152,7 @@
     }
 
     public boolean movedOrRenamedOrReplaced(Change change) {
-      return change.isIsReplaced() || change.isRenamed() || change.isIsReplaced();
+      return change.isMoved() || change.isRenamed() || change.isIsReplaced();
     }
   }
 
@@ -178,7 +178,7 @@
     }
 
     public boolean movedOrRenamedOrReplaced(Change change) {
-      return change.isIsReplaced() || change.isRenamed() || change.isIsReplaced();
+      return change.isMoved() || change.isRenamed() || change.isIsReplaced();
     }
   }
 
