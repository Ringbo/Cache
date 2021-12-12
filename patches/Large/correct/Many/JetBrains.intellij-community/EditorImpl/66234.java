diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index e09f1ee..4a209f7 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -832,7 +832,7 @@
       caret.moveToOffset(caret.getOffset());
     }
 
-    if (myVirtualFile != null) EditorNotifications.getInstance(myProject).updateNotifications(myVirtualFile);
+    if (myVirtualFile != null && myProject != null) EditorNotifications.getInstance(myProject).updateNotifications(myVirtualFile);
   }
 
   /**
