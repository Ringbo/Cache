diff --git a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
index be555c8..eeeb4c1 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
@@ -466,7 +466,7 @@
   /**
    * Releases all references to given native View.
    */
-  protected final void dropView(View view) {
+  protected void dropView(View view) {
     UiThreadUtil.assertOnUiThread();
     if (!mRootTags.get(view.getId())) {
       // For non-root views we notify viewmanager with {@link ViewManager#onDropInstance}
