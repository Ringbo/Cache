diff --git a/src/org/geometerplus/zlibrary/text/view/ZLTextView.java b/src/org/geometerplus/zlibrary/text/view/ZLTextView.java
index 605f1ba..335e840 100644
--- a/src/org/geometerplus/zlibrary/text/view/ZLTextView.java
+++ b/src/org/geometerplus/zlibrary/text/view/ZLTextView.java
@@ -178,7 +178,7 @@
 	}
 
 	public synchronized int search(final String text, boolean ignoreCase, boolean wholeText, boolean backward, boolean thisSectionOnly) {
-		if (text.length() == 0) {
+		if (myModel == null || text.length() == 0) {
 			return 0;
 		}
 		int startIndex = 0;
