diff --git a/src/main/java/net/sf/jabref/gui/keyboard/KeyBinding.java b/src/main/java/net/sf/jabref/gui/keyboard/KeyBinding.java
index 6433c2d..7028db0 100644
--- a/src/main/java/net/sf/jabref/gui/keyboard/KeyBinding.java
+++ b/src/main/java/net/sf/jabref/gui/keyboard/KeyBinding.java
@@ -9,7 +9,7 @@
     ACCEPT("Accept", Localization.lang("Accept"), "ctrl ENTER", KeyBindingCategory.EDIT),
     AUTOMATICALLY_LINK_FILES("Automatically link files", Localization.lang("Automatically set file links"), "F7", KeyBindingCategory.QUALITY),
     BACK("Back", Localization.lang("Back"), "alt LEFT", KeyBindingCategory.VIEW),
-    CHECK_INTEGRITY("Check integrity", Localization.lang("Check integrity"), "ctrl F8", KeyBindingCategory.QUALITY),
+    CHECK_INTEGRITY("Check integrity", Localization.menuTitle("Check integrity"), "ctrl F8", KeyBindingCategory.QUALITY),
     CLEANUP("Cleanup", Localization.lang("Cleanup entries"), "F8", KeyBindingCategory.QUALITY),
     CLEAR_SEARCH("Clear search", Localization.lang("Clear search"), "ESCAPE", KeyBindingCategory.SEARCH),
     CLOSE_DATABASE("Close database", Localization.lang("Close database"), "ctrl W", KeyBindingCategory.FILE),
