diff --git a/portal-impl/test/unit/com/liferay/portlet/blogs/action/TrackbackActionTest.java b/portal-impl/test/unit/com/liferay/portlet/blogs/action/TrackbackActionTest.java
index d2c89d1..9fbcb9e 100644
--- a/portal-impl/test/unit/com/liferay/portlet/blogs/action/TrackbackActionTest.java
+++ b/portal-impl/test/unit/com/liferay/portlet/blogs/action/TrackbackActionTest.java
@@ -318,7 +318,7 @@
 		doReturn(_mockBlogsEntry).when(
 			_mockActionRequest).getAttribute(WebKeys.BLOGS_ENTRY);
 
-		doReturn(Collections.emptyEnumeration()).when(
+		doReturn(Collections.enumeration(Collections.emptySet())).when(
 			_mockActionRequest).getParameterNames();
 
 		doReturn(_mockMBMessageDisplay).when(
