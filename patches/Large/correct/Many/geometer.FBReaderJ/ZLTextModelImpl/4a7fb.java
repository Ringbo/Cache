diff --git a/src/org/geometerplus/zlibrary/text/model/ZLTextModelImpl.java b/src/org/geometerplus/zlibrary/text/model/ZLTextModelImpl.java
index 86290f4..197837b 100644
--- a/src/org/geometerplus/zlibrary/text/model/ZLTextModelImpl.java
+++ b/src/org/geometerplus/zlibrary/text/model/ZLTextModelImpl.java
@@ -315,7 +315,7 @@
 
 		ZLTextMark mark = null;
 		for (ZLTextMark current : myMarks) {
-			if (current.compareTo(position) <= 0) {
+			if (current.compareTo(position) < 0) {
 				if ((mark == null) || (mark.compareTo(current) < 0)) {
 					mark = current;
 				}
