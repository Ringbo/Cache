diff --git a/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java b/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
index c754bc1..1f8ee0b 100644
--- a/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
+++ b/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
@@ -607,7 +607,7 @@
 			myInsertBookSeriesStatement.bindLong(2, seriesId);
 			SQLiteUtil.bindString(
 				myInsertBookSeriesStatement, 3,
-				seriesInfo.Index != null ? seriesInfo.Index.toString() : null
+				seriesInfo.Index != null ? seriesInfo.Index.toPlainString() : null
 			);
 			myInsertBookSeriesStatement.execute();
 		}
