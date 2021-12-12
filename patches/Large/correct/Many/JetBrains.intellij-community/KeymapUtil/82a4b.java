diff --git a/platform/platform-api/src/com/intellij/openapi/keymap/KeymapUtil.java b/platform/platform-api/src/com/intellij/openapi/keymap/KeymapUtil.java
index 2ef8edf..752e6bf 100644
--- a/platform/platform-api/src/com/intellij/openapi/keymap/KeymapUtil.java
+++ b/platform/platform-api/src/com/intellij/openapi/keymap/KeymapUtil.java
@@ -200,10 +200,10 @@
   }
 
   @NotNull
-  public static ShortcutSet getActiveKeymapShortcuts(@NotNull String actionId) {
+  public static ShortcutSet getActiveKeymapShortcuts(@Nullable String actionId) {
     Application application = ApplicationManager.getApplication();
     KeymapManager keymapManager = application == null ? null : application.getComponent(KeymapManager.class);
-    if (keymapManager == null) {
+    if (keymapManager == null || actionId == null) {
       return new CustomShortcutSet(Shortcut.EMPTY_ARRAY);
     }
     return new CustomShortcutSet(keymapManager.getActiveKeymap().getShortcuts(actionId));
