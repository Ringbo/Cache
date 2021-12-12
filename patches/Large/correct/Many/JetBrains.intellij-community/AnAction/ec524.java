diff --git a/platform/editor-ui-api/src/com/intellij/openapi/actionSystem/AnAction.java b/platform/editor-ui-api/src/com/intellij/openapi/actionSystem/AnAction.java
index 5cd2c21..dad449d 100644
--- a/platform/editor-ui-api/src/com/intellij/openapi/actionSystem/AnAction.java
+++ b/platform/editor-ui-api/src/com/intellij/openapi/actionSystem/AnAction.java
@@ -279,7 +279,7 @@
 
   protected void setShortcutSet(ShortcutSet shortcutSet) {
     if (myIsGlobal && myShortcutSet != shortcutSet) {
-      LOG.error("Shortcuts of global AnActions should not be changed outside of KeymapManager");
+      LOG.warn("Shortcuts of global AnActions should not be changed outside of KeymapManager", new Throwable());
     }
     myShortcutSet = shortcutSet;
   }
