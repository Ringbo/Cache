diff --git a/source/com/intellij/openapi/vcs/actions/CommonCheckinProjectAction.java b/source/com/intellij/openapi/vcs/actions/CommonCheckinProjectAction.java
index 1124126..c0c4104 100644
--- a/source/com/intellij/openapi/vcs/actions/CommonCheckinProjectAction.java
+++ b/source/com/intellij/openapi/vcs/actions/CommonCheckinProjectAction.java
@@ -38,6 +38,6 @@
   }
 
   protected boolean filterRootsBeforeAction() {
-    return true;
+    return false;
   }
 }
