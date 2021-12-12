diff --git a/src/org/geometerplus/android/fbreader/tree/TreeActivity.java b/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
index cffdc5c..22e965a 100644
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
 
@@ -149,7 +149,7 @@
 	protected void init(Intent intent) {
 		final FBTree.Key key = (FBTree.Key)intent.getSerializableExtra(TREE_KEY_KEY);
 		final FBTree.Key selectedKey = (FBTree.Key)intent.getSerializableExtra(SELECTED_TREE_KEY_KEY);
-		myCurrentTree = getTreeByKey(key);
+		myCurrentTree = (T)getTreeByKey(key);
 		// not myCurrentKey = key
 		// because key might be null
 		myCurrentKey = myCurrentTree.getUniqueKey();
