diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
index 74f3291..7458df4 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
@@ -595,7 +595,7 @@
             }
             menu.findItem(R.id.menu_add_reminder).setVisible(true);
             menu.findItem(R.id.menu_category).setVisible(true);
-			menu.findItem(R.id.menu_uncomplete_checklists).setVisible(true);
+			menu.findItem(R.id.menu_uncomplete_checklists).setVisible(false);
             menu.findItem(R.id.menu_tags).setVisible(true);
             menu.findItem(R.id.menu_trash).setVisible(true);
         }
