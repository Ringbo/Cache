diff --git a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
index b906417..1277cae 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
@@ -198,7 +198,7 @@
           parentViewGroupManager = (ViewGroupManager) parentViewManager;
         } else {
           throw new IllegalViewOperationException(
-              "Trying to use view with tag " + tag +
+              "Trying to use view with tag " + parentTag +
                   " as a parent, but its Manager doesn't extends ViewGroupManager");
         }
         if (parentViewGroupManager != null
