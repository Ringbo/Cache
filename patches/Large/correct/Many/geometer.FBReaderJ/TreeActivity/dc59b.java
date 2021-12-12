diff --git a/src/org/geometerplus/android/fbreader/tree/TreeActivity.java b/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
index cffdc5c..7368837 100644
--- a/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
+++ b/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
@@ -32,14 +32,14 @@
 
 import org.geometerplus.android.fbreader.OrientationUtil;
 
-public abstract class TreeActivity extends ListActivity {
+public abstract class TreeActivity<T extends FBTree> extends ListActivity {
 	private static final String OPEN_TREE_ACTION = "android.fbreader.action.OPEN_TREE";
 
 	public static final String TREE_KEY_KEY = "TreeKey";
 	public static final String SELECTED_TREE_KEY_KEY = "SelectedTreeKey";
 	public static final String HISTORY_KEY = "HistoryKey";
 
-	private FBTree myCurrentTree;
+	private T myCurrentTree;
 	// we store the key separately because
 	// it will be changed in case of myCurrentTree.removeSelf() call
 	private FBTree.Key myCurrentKey;
@@ -63,7 +63,7 @@
 		return (TreeAdapter)super.getListAdapter();
 	}
 
-	protected FBTree getCurrentTree() {
+	protected T getCurrentTree() {
 		return myCurrentTree;
 	}
 
@@ -81,7 +81,7 @@
 		}
 	}
 
-	protected abstract FBTree getTreeByKey(FBTree.Key key);
+	protected abstract T getTreeByKey(FBTree.Key key);
 	public abstract boolean isTreeSelected(FBTree tree);
 
 	protected boolean isTreeInvisible(FBTree tree) {
