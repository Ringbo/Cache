diff --git a/portal-impl/src/com/liferay/portlet/sites/action/EditGroupAction.java b/portal-impl/src/com/liferay/portlet/sites/action/EditGroupAction.java
index 3fa3132..4ba0a5a 100644
--- a/portal-impl/src/com/liferay/portlet/sites/action/EditGroupAction.java
+++ b/portal-impl/src/com/liferay/portlet/sites/action/EditGroupAction.java
@@ -486,11 +486,9 @@
 
 		if (!liveGroup.isStaged()) {
 			long privateLayoutSetPrototypeId = ParamUtil.getLong(
-				actionRequest, "privateLayoutSetPrototypeId",
-				privateLayoutSet.getLayoutSetPrototypeId());
+				actionRequest, "privateLayoutSetPrototypeId");
 			long publicLayoutSetPrototypeId = ParamUtil.getLong(
-				actionRequest, "publicLayoutSetPrototypeId",
-				publicLayoutSet.getLayoutSetPrototypeId());
+				actionRequest, "publicLayoutSetPrototypeId");
 
 			boolean privateLayoutSetPrototypeLinkEnabled = ParamUtil.getBoolean(
 				actionRequest, "privateLayoutSetPrototypeLinkEnabled",
