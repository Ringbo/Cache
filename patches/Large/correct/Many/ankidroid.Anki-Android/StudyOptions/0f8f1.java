diff --git a/src/com/ichi2/anki/StudyOptions.java b/src/com/ichi2/anki/StudyOptions.java
index 86116cb..038d5d4 100644
--- a/src/com/ichi2/anki/StudyOptions.java
+++ b/src/com/ichi2/anki/StudyOptions.java
@@ -1788,7 +1788,7 @@
     public boolean onCreateOptionsMenu(Menu menu) {
         Utils.addMenuItemInActionBar(menu, Menu.NONE, MENU_OPEN, Menu.NONE, R.string.menu_open_deck,
                 R.drawable.ic_menu_manage);
-        Utils.addMenuItem(menu, Menu.NONE, MENU_SYNC, Menu.NONE, R.string.menu_rotate,
+        Utils.addMenuItem(menu, Menu.NONE, MENU_ROTATE, Menu.NONE, R.string.menu_rotate,
                 android.R.drawable.ic_menu_always_landscape_portrait);        
         Utils.addMenuItemInActionBar(menu, Menu.NONE, MENU_SYNC, Menu.NONE, R.string.menu_sync,
                 R.drawable.ic_menu_refresh);        	
