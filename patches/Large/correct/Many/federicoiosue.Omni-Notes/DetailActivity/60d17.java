diff --git a/src/it/feio/android/omninotes/DetailActivity.java b/src/it/feio/android/omninotes/DetailActivity.java
index 925e4e2..f9995b2 100644
--- a/src/it/feio/android/omninotes/DetailActivity.java
+++ b/src/it/feio/android/omninotes/DetailActivity.java
@@ -393,7 +393,7 @@
 		content.addTextChangedListener(this);
 		content.gatherLinksForText();
 		content.setOnTextLinkClickListener(this);
-		if (note.get_id() == 0) {
+		if (note.get_id() == 0 && !noteTmp.isChanged(note)) {
 			content.requestFocus();
 		}
 
