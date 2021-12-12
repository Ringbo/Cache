diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/settings/SubCompositeConfigurable.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/settings/SubCompositeConfigurable.java
index 1d4dc08..c1c6465 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/settings/SubCompositeConfigurable.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/settings/SubCompositeConfigurable.java
@@ -63,7 +63,7 @@
 
     if (isChildrenMerged()) {
       for (Configurable child : children) {
-        child.reset();
+        child.disposeUIResources();
       }
     }
     children = null;
