diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPortletDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPortletDataHandlerTest.java
index fb6d851..16a341d 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPortletDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPortletDataHandlerTest.java
@@ -47,7 +47,7 @@
 		WikiTestUtil.addPage(
 			TestPropsValues.getUserId(), node.getNodeId(),
 			ServiceTestUtil.randomString(), ServiceTestUtil.randomString(),
-			true, serviceContext);
+			true, true, serviceContext);
 	}
 
 	@Override
