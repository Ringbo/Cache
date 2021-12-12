diff --git a/src/org/geometerplus/android/fbreader/SQLiteBooksDatabase.java b/src/org/geometerplus/android/fbreader/SQLiteBooksDatabase.java
index a89da53..a320fe1 100644
--- a/src/org/geometerplus/android/fbreader/SQLiteBooksDatabase.java
+++ b/src/org/geometerplus/android/fbreader/SQLiteBooksDatabase.java
@@ -472,7 +472,7 @@
 		final Cursor cursor = myDatabase.rawQuery("SELECT Series.name,BookSeries.book_index FROM BookSeries INNER JOIN Series ON Series.series_id = BookSeries.series_id WHERE BookSeries.book_id = ?", new String[] { "" + bookId });
 		SeriesInfo info = null;
 		if (cursor.moveToNext()) {
-			info = new SeriesInfo(cursor.getString(0), cursor.getLong(1));
+			info = new SeriesInfo(cursor.getString(0), cursor.getFloat(1));
 		}
 		cursor.close();	
 		return info;
