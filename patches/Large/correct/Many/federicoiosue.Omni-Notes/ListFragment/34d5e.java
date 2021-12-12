diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
index 61729a2..baf37a1 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
@@ -1293,7 +1293,7 @@
             }
 
             // If actual navigation is not "Notes" the item will not be removed but replaced to fit the new state
-            if (Navigation.checkNavigation(Navigation.NOTES)) {
+            if (Navigation.checkNavigation(Navigation.NOTES) || (Navigation.checkNavigation(Navigation.ARCHIVE) && !archive)) {
                 listAdapter.remove(note);
             } else {
                 note.setArchived(archive);
