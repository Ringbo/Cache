diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
index 5193573..9ac3e82 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
@@ -358,7 +358,7 @@
 
 		WikiPage originalPage = WikiTestUtil.addPage(
 			TestPropsValues.getUserId(), _node.getNodeId(),
-			ServiceTestUtil.randomString(), originalContent, true,
+			ServiceTestUtil.randomString(), originalContent, true, true,
 			serviceContext);
 
 		if (hasExpandoValues) {
