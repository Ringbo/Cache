diff --git a/portal-impl/src/com/liferay/portlet/blogs/service/impl/BlogsEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/blogs/service/impl/BlogsEntryLocalServiceImpl.java
index edb0ba7..8b7b3ee 100644
--- a/portal-impl/src/com/liferay/portlet/blogs/service/impl/BlogsEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/blogs/service/impl/BlogsEntryLocalServiceImpl.java
@@ -2207,10 +2207,12 @@
 		throws PortalException {
 
 		if (Validator.isNull(title)) {
-			throw new EntryTitleException();
+			throw new EntryTitleException(
+				"Blogs entry title must be a non null string");
 		}
 		else if (Validator.isNull(content)) {
-			throw new EntryContentException();
+			throw new EntryContentException(
+				"Blogs entry content must be a non null string");
 		}
 	}
 
