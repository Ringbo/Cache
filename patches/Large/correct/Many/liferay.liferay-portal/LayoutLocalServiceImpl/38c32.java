diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index f11fe3e..58318f0 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -1035,7 +1035,7 @@
 	 */
 	@Override
 	public long getDefaultPlid(long groupId, boolean privateLayout) {
-		Layout layout = getDefaultLayout(groupId, privateLayout);
+		Layout layout = fetchDefaultLayout(groupId, privateLayout);
 
 		if (layout != null) {
 			return layout.getPlid();
