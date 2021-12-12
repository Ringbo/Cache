diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
index 98962e1..086c618 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
@@ -1458,7 +1458,7 @@
         Pair<String, List<Tag>> taggingResult = TagsHelper.addTagToNote(tags, selectedTags, note);
 
         if (note.isChecklist()) {
-            note.setTitle(note.getContent() + System.getProperty("line.separator") + taggingResult.first);
+            note.setTitle(note.getTitle() + System.getProperty("line.separator") + taggingResult.first);
         } else {
             StringBuilder sb = new StringBuilder(note.getContent());
             if (sb.length() > 0) {
