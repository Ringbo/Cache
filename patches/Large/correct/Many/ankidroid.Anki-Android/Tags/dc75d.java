diff --git a/src/com/ichi2/libanki/Tags.java b/src/com/ichi2/libanki/Tags.java
index 113209f..681ae74 100644
--- a/src/com/ichi2/libanki/Tags.java
+++ b/src/com/ichi2/libanki/Tags.java
@@ -92,7 +92,7 @@
     	// case is stored as received, so user can create different case
     	// versions of the same tag if they ignore the qt autocomplete.
     	for (String t : tags) {
-    		if (mTags.containsKey(t)) {
+    		if (!mTags.containsKey(t)) {
     			mTags.put(t, usn == 0 ? mCol.usn() : usn);
     			mChanged = true;
     		}
