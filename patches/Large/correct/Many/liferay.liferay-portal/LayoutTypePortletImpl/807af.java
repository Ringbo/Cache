diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
index 61e7dfa..4f72bdd 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
@@ -1799,7 +1799,7 @@
 	}
 
 	protected void onRemoveFromLayout(String[] portletIds) {
-		List<String> portletIdList = new ArrayList<String>();
+		Set<String> portletIdList = new HashSet<String>();
 
 		for (String portletId : portletIds) {
 			removeModesPortletId(portletId);
