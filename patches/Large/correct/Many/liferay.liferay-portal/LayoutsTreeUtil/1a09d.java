diff --git a/portal-impl/src/com/liferay/portlet/layoutsadmin/util/LayoutsTreeUtil.java b/portal-impl/src/com/liferay/portlet/layoutsadmin/util/LayoutsTreeUtil.java
index c807fb2..72b9bce 100644
--- a/portal-impl/src/com/liferay/portlet/layoutsadmin/util/LayoutsTreeUtil.java
+++ b/portal-impl/src/com/liferay/portlet/layoutsadmin/util/LayoutsTreeUtil.java
@@ -244,7 +244,7 @@
 			layoutTreeNodes.add(layoutTreeNode);
 		}
 
-		return new LayoutTreeNodes(layoutTreeNodes, layoutTreeNodes.size());
+		return new LayoutTreeNodes(layoutTreeNodes, layouts.size());
 	}
 
 	private static int _getLoadedLayoutsCount(
