diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPageStagedModelDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPageStagedModelDataHandlerTest.java
index 3d0ac30..36e26c0 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPageStagedModelDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/lar/WikiPageStagedModelDataHandlerTest.java
@@ -95,7 +95,7 @@
 		WikiPage page = WikiTestUtil.addPage(
 			TestPropsValues.getUserId(), node.getNodeId(),
 			ServiceTestUtil.randomString(), ServiceTestUtil.randomString(),
-			true, serviceContext);
+			true, true, serviceContext);
 
 		WikiTestUtil.addWikiAttachment(
 			TestPropsValues.getUserId(), node.getNodeId(), page.getTitle(),
