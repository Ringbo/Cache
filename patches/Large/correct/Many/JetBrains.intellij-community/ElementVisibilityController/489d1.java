diff --git a/graph/src/org/hanuna/gitalk/graph/new_mutable/ElementVisibilityController.java b/graph/src/org/hanuna/gitalk/graph/new_mutable/ElementVisibilityController.java
index 0210a9c..ee2b583 100644
--- a/graph/src/org/hanuna/gitalk/graph/new_mutable/ElementVisibilityController.java
+++ b/graph/src/org/hanuna/gitalk/graph/new_mutable/ElementVisibilityController.java
@@ -14,7 +14,7 @@
     private final Set<GraphElement> hiddenElements = new HashSet<GraphElement>();
 
     public boolean isVisible(@NotNull GraphElement graphElement) {
-        return hiddenElements.contains(graphElement);
+        return !hiddenElements.contains(graphElement);
     }
 
     public void hide(@NotNull Collection<GraphElement> graphElements) {
