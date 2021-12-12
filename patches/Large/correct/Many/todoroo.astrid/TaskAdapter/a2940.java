diff --git a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
index d9032f0..720352a 100644
--- a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
+++ b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
@@ -215,7 +215,7 @@
         displayMetrics = new DisplayMetrics();
         fragment.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
 
-        this.minRowHeight = (int) (4 * displayMetrics.density);
+        this.minRowHeight = (int) (45 * displayMetrics.density);
 
         startDetailThread();
         startTaskActionsThread();
