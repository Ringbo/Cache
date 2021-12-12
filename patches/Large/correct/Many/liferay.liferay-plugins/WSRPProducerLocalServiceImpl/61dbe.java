diff --git a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
index ef73fc6..4aeba9e 100644
--- a/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
+++ b/portlets/wsrp-portlet/docroot/WEB-INF/src/com/liferay/wsrp/service/impl/WSRPProducerLocalServiceImpl.java
@@ -184,8 +184,8 @@
 		}
 
 		Group group = groupLocalService.addGroup(
-			user.getUserId(), null, 0, 0, name, null, type, null, true, true,
-			null);
+			user.getUserId(), GroupConstants.DEFAULT_PARENT_GROUP_ID, null, 0,
+			0, name, null, type, null, true, true, null);
 
 		layoutLocalService.addLayout(
 			user.getUserId(), group.getGroupId(), false,
