diff --git a/flow-sample/src/main/java/com/example/flow/pathview/SimplePathContainer.java b/flow-sample/src/main/java/com/example/flow/pathview/SimplePathContainer.java
index 34cdbbc..fc3f763 100644
--- a/flow-sample/src/main/java/com/example/flow/pathview/SimplePathContainer.java
+++ b/flow-sample/src/main/java/com/example/flow/pathview/SimplePathContainer.java
@@ -58,10 +58,10 @@
 
     Path to = traversalState.toPath();
 
-    ViewGroup newView;
+    View newView;
     context = PathContext.create(oldPath, to, contextFactory);
     int layout = getLayout(to);
-    newView = (ViewGroup) LayoutInflater.from(context)
+    newView = LayoutInflater.from(context)
         .cloneInContext(context)
         .inflate(layout, containerView, false);
 
