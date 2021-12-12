diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/action/ActionUtil.java b/portal-impl/src/com/liferay/portlet/documentlibrary/action/ActionUtil.java
index 5071315..0fbc82c 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/action/ActionUtil.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/action/ActionUtil.java
@@ -111,7 +111,7 @@
 			RawMetadataProcessorUtil.generateMetadata(fileVersion);
 
 			if (fileVersion.isInTrash()) {
-				throw new NoSuchFileException();
+				throw new NoSuchFileEntryException();
 			}
 		}
 	}
