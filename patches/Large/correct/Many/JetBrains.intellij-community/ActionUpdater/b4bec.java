diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionUpdater.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionUpdater.java
index dafff1b..8f380db 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionUpdater.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionUpdater.java
@@ -218,7 +218,7 @@
   }
 
   boolean hasVisibleChildren(ActionGroup group) {
-    return hasVisibleChildren(group, myCheapStrategy);
+    return hasVisibleChildren(group, myRealUpdateStrategy);
   }
 
   private boolean hasVisibleChildren(ActionGroup group, UpdateStrategy strategy) {
