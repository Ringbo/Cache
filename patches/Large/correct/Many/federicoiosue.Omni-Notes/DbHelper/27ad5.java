diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/db/DbHelper.java b/omniNotes/src/main/java/it/feio/android/omninotes/db/DbHelper.java
index 692643e..a3c7102 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/db/DbHelper.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/db/DbHelper.java
@@ -694,7 +694,7 @@
         Collections.sort(tags, new Comparator<Tag>() {
             @Override
             public int compare(Tag tag1, Tag tag2) {
-                return tag1.getText().compareToIgnoreCase(tag1.getText());
+                return tag1.getText().compareToIgnoreCase(tag2.getText());
             }
         });
         return tags;
