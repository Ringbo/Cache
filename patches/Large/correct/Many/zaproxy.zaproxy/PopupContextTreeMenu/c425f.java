diff --git a/src/org/zaproxy/zap/extension/stdmenus/PopupContextTreeMenu.java b/src/org/zaproxy/zap/extension/stdmenus/PopupContextTreeMenu.java
index dfc72b9..5ad4239 100644
--- a/src/org/zaproxy/zap/extension/stdmenus/PopupContextTreeMenu.java
+++ b/src/org/zaproxy/zap/extension/stdmenus/PopupContextTreeMenu.java
@@ -47,7 +47,7 @@
 		if (invoker instanceof JTree && SiteMapPanel.CONTEXT_TREE_COMPONENT_NAME.equals(invoker.getName())) {
 			JTree contextTree = (JTree)invoker;
 			SiteNode node = (SiteNode)contextTree.getLastSelectedPathComponent();
-			if (node.isRoot()) {
+			if (node == null || node.isRoot()) {
 				return false;
 			}
 			contextId = ((Target)node.getUserObject()).getContext().getIndex();
