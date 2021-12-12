diff --git a/src/org/geometerplus/android/fbreader/library/BookInfoActivity.java b/src/org/geometerplus/android/fbreader/library/BookInfoActivity.java
index 3988fd6..602e3d0 100644
--- a/src/org/geometerplus/android/fbreader/library/BookInfoActivity.java
+++ b/src/org/geometerplus/android/fbreader/library/BookInfoActivity.java
@@ -243,7 +243,7 @@
 		setupInfoPair(R.id.book_series, "series", series == null ? null : series.Series.getTitle());
 		String seriesIndexString = null;
 		if (series != null && series.Index != null) {
-			seriesIndexString = series.Index.toString();
+			seriesIndexString = series.Index.toPlainString();
 		}
 		setupInfoPair(R.id.book_series_index, "indexInSeries", seriesIndexString);
 
