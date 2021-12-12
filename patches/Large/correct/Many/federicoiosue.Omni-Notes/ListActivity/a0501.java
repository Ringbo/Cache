diff --git a/src/it/feio/android/omninotes/ListActivity.java b/src/it/feio/android/omninotes/ListActivity.java
index 115fc99..76f4194 100644
--- a/src/it/feio/android/omninotes/ListActivity.java
+++ b/src/it/feio/android/omninotes/ListActivity.java
@@ -106,7 +106,7 @@
 		CharSequence title = "";
 		// If is a traditional navigation item
 		if (index >= 0 && index < navigationListCodes.length) {
-			title = navigationListCodes[index];
+			title = navigationList[index];
 		} else {
 			ArrayList<Tag> tags = db.getTags();
 			for (Tag tag : tags) {
