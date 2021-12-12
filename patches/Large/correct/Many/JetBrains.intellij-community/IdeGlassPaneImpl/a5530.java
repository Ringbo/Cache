diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeGlassPaneImpl.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeGlassPaneImpl.java
index 5324e14..0338c47 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeGlassPaneImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeGlassPaneImpl.java
@@ -220,7 +220,7 @@
     IdeEventQueue queue = IdeEventQueue.getInstance();
     if (!queue.containsDispatcher(this) && myPreprocessorActive) {
       queue.addDispatcher(this, null);
-    } else if (queue.containsDispatcher(this) && myPreprocessorActive) {
+    } else if (queue.containsDispatcher(this) && !myPreprocessorActive) {
       queue.removeDispatcher(this);
     }
 
