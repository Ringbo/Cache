diff --git a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
index 3265817..1a9ff98 100644
--- a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
@@ -166,8 +166,7 @@
 		ZipReader zipReader = ZipReaderFactoryUtil.getZipReader(file);
 
 		PortletDataContext portletDataContext = new PortletDataContextImpl(
-			layoutSet.getCompanyId(), groupId, parameterMap,
-			new HashSet<String>(), null, zipReader);
+			layoutSet.getCompanyId(), groupId, parameterMap, null, zipReader);
 
 		validateFile(portletDataContext);
 	}
