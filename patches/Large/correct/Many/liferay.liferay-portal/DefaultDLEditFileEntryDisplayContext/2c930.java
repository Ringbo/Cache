diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java b/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
index c6953a3..8a2f3f0 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/context/DefaultDLEditFileEntryDisplayContext.java
@@ -144,7 +144,7 @@
 
 	@Override
 	public boolean isPublishButtonDisabled() {
-		if (_fileEntryDisplayContextHelper.isCheckedOutByMe() ||
+		if (_fileEntryDisplayContextHelper.isCheckedOutByOther() ||
 			(_fileVersionDisplayContextHelper.isPending() &&
 			 _dlPortletInstanceSettings.isEnableFileEntryDrafts())) {
 
