diff --git a/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java b/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
index 8e864ea..3f80047 100644
--- a/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
+++ b/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
@@ -212,7 +212,7 @@
 
         @Override
         protected int computeMinRowHeight() {
-            return (int) (metrics.density * 40);
+            return (int) (metrics.density * 45);
         }
 
         @Override
