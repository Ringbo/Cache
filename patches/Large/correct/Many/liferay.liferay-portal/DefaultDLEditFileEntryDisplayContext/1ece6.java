diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java b/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
index 590ea112..7eeab8f 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
@@ -59,9 +59,7 @@
 	}
 
 	@Override
-	public DLFilePicker getDLFilePicker(String onFilePickCallback)
-		throws PortalException {
-
+	public DLFilePicker getDLFilePicker(String onFilePickCallback) {
 		return null;
 	}
 
