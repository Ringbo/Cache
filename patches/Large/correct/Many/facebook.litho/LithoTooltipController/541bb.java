diff --git a/litho-core/src/main/java/com/facebook/litho/LithoTooltipController.java b/litho-core/src/main/java/com/facebook/litho/LithoTooltipController.java
index b06d075..4db1fbf 100644
--- a/litho-core/src/main/java/com/facebook/litho/LithoTooltipController.java
+++ b/litho-core/src/main/java/com/facebook/litho/LithoTooltipController.java
@@ -71,7 +71,7 @@
     final ComponentTree componentTree = c.getComponentTree();
     final Component rootComponent = c.getComponentScope();
 
-    if (componentTree == null) {
+    if (componentTree == null || componentTree.isReleased()) {
       return;
     }
 
