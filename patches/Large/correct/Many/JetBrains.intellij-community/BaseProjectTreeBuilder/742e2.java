diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java b/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
index 76d614e..5c7752e 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
@@ -171,7 +171,7 @@
       result.setResult(null);
     };
 
-    final Condition<AbstractTreeNode> condition = abstractTreeNode -> result.getState() != Promise.State.PENDING && nonStopCondition.value(abstractTreeNode);
+    final Condition<AbstractTreeNode> condition = abstractTreeNode -> result.getState() == Promise.State.PENDING && nonStopCondition.value(abstractTreeNode);
 
     if (alreadySelected == null) {
       expandPathTo(file, (AbstractTreeNode)getTreeStructure().getRootElement(), element, condition, indicator, virtualSelectTarget)
