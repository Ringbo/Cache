diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index 607ee05..8fd5c2c 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -1218,7 +1218,8 @@
 		for (List<Layout> layoutChildLayoutsList :
 				layoutChildLayouts.values()) {
 
-			layoutChildLayouts.sort(Comparator.comparing(Layout::getPriority));
+			layoutChildLayoutsList.sort(
+				Comparator.comparing(Layout::getPriority));
 		}
 
 		return layoutChildLayouts;
