diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLProcessorRegistryImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLProcessorRegistryImpl.java
index 9954ccc..17e30f1 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLProcessorRegistryImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLProcessorRegistryImpl.java
@@ -36,7 +36,7 @@
 			return;
 		}
 
-		if (fileEntry == null) {
+		if (fileEntry == null || fileEntry.getSize() == 0) {
 			return;
 		}
 
