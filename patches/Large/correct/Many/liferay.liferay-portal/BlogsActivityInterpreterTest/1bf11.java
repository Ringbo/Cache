diff --git a/portal-impl/test/integration/com/liferay/portlet/blogs/social/BlogsActivityInterpreterTest.java b/portal-impl/test/integration/com/liferay/portlet/blogs/social/BlogsActivityInterpreterTest.java
index fd1a9de..a51641b 100644
--- a/portal-impl/test/integration/com/liferay/portlet/blogs/social/BlogsActivityInterpreterTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/blogs/social/BlogsActivityInterpreterTest.java
@@ -78,7 +78,7 @@
 		BlogsEntryLocalServiceUtil.updateEntry(
 			_entry.getUserId(), _entry.getEntryId(), _entry.getTitle(),
 			_entry.getSubtitle(), _entry.getDescription(), _entry.getContent(),
-			1, 1, 2012, 12, 00, true, true, new String[0], null,
+			1, 1, 2012, 12, 00, true, true, new String[0], null, null,
 			serviceContext);
 	}
 
