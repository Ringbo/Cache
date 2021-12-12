diff --git a/src/org/geometerplus/android/fbreader/library/LibraryTopLevelActivity.java b/src/org/geometerplus/android/fbreader/library/LibraryTopLevelActivity.java
index 3e303a7..3fdf2bb 100644
--- a/src/org/geometerplus/android/fbreader/library/LibraryTopLevelActivity.java
+++ b/src/org/geometerplus/android/fbreader/library/LibraryTopLevelActivity.java
@@ -46,7 +46,7 @@
 		requestWindowFeature(Window.FEATURE_NO_TITLE);
 
 		if (SQLiteBooksDatabase.Instance() == null) {
-			new SQLiteBooksDatabase("LIBRARY_NG");
+			new SQLiteBooksDatabase(this, "LIBRARY_NG");
 		}
 		if (Library == null) {
 			Library = new Library();
