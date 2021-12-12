diff --git a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
index e5d7b47..508b238 100644
--- a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
+++ b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
@@ -188,7 +188,7 @@
 		layoutLocalService.addLayout(
 			user.getUserId(), group.getGroupId(), false,
 			LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, "Portlets", null, null,
-			LayoutConstants.TYPE_PORTLET, false, "/portlets", false,
+			LayoutConstants.TYPE_PORTLET, false, "/portlets",
 			new ServiceContext());
 
 		return group;
