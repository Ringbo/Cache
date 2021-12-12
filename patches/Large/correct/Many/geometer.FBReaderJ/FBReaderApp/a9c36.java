diff --git a/src/org/geometerplus/fbreader/fbreader/FBReaderApp.java b/src/org/geometerplus/fbreader/fbreader/FBReaderApp.java
index ad44dae..0660344 100644
--- a/src/org/geometerplus/fbreader/fbreader/FBReaderApp.java
+++ b/src/org/geometerplus/fbreader/fbreader/FBReaderApp.java
@@ -329,7 +329,7 @@
 				CancelActionType.previousBook, previousBook.getTitle()
 			));
 		}
-		if (Model.Book != null) {
+		if (Model != null && Model.Book != null) {
 			for (Bookmark bookmark : Bookmark.invisibleBookmarks(Model.Book)) {
 				myCancelActionsList.add(new BookmarkDescription(bookmark));
 			}
