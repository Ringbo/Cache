diff --git a/src/com/ichi2/libanki/importer/Anki2Importer.java b/src/com/ichi2/libanki/importer/Anki2Importer.java
index ac7584d..6e978f8 100644
--- a/src/com/ichi2/libanki/importer/Anki2Importer.java
+++ b/src/com/ichi2/libanki/importer/Anki2Importer.java
@@ -422,7 +422,7 @@
             		card[8] = (Long) card[8] - aheadBy;
             	}
             	// if odid true, convert card from filtered to normal
-            	if ((Integer)card[15] != 0) {
+            	if ((Long)card[15] != 0) {
             		// odid
             		card[15] = 0;
             		// odue
