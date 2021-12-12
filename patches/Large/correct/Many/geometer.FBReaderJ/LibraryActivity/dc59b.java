diff --git a/src/org/geometerplus/android/fbreader/library/LibraryActivity.java b/src/org/geometerplus/android/fbreader/library/LibraryActivity.java
index 6a6dbe4..8486e09 100644
--- a/src/org/geometerplus/android/fbreader/library/LibraryActivity.java
+++ b/src/org/geometerplus/android/fbreader/library/LibraryActivity.java
@@ -43,7 +43,7 @@
 import org.geometerplus.android.fbreader.libraryService.SQLiteBooksDatabase;
 import org.geometerplus.android.fbreader.tree.TreeActivity;
 
-public class LibraryActivity extends TreeActivity implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener, Library.ChangeListener {
+public class LibraryActivity extends TreeActivity<LibraryTree> implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener, Library.ChangeListener {
 	static volatile boolean ourToBeKilled = false;
 
 	private BooksDatabase myDatabase;
@@ -83,7 +83,7 @@
 	}
 
 	@Override
-	protected FBTree getTreeByKey(FBTree.Key key) {
+	protected LibraryTree getTreeByKey(FBTree.Key key) {
 		return key != null ? myLibrary.getLibraryTree(key) : myLibrary.getRootTree();
 	}
 
