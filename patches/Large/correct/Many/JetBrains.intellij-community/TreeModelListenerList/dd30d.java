diff --git a/platform/util/src/com/intellij/util/ui/tree/TreeModelListenerList.java b/platform/util/src/com/intellij/util/ui/tree/TreeModelListenerList.java
index 41d2e55..5fc0e0c 100644
--- a/platform/util/src/com/intellij/util/ui/tree/TreeModelListenerList.java
+++ b/platform/util/src/com/intellij/util/ui/tree/TreeModelListenerList.java
@@ -35,7 +35,8 @@
    * @param listener a listener to add
    */
   public void add(@NotNull TreeModelListener listener) {
-    myListeners.add(listener);
+    // in this weird swing world it's customary to fire listeners in the reverse order of their addition
+    myListeners.add(0, listener);
   }
 
   /**
