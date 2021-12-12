diff --git a/portal-impl/src/com/liferay/portlet/asset/service/impl/AssetEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/asset/service/impl/AssetEntryLocalServiceImpl.java
index 6bded03..ed9fbd6 100644
--- a/portal-impl/src/com/liferay/portlet/asset/service/impl/AssetEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/asset/service/impl/AssetEntryLocalServiceImpl.java
@@ -885,7 +885,7 @@
 
 	protected long[] getClassNameIds(long companyId, String className) {
 		if (Validator.isNotNull(className)) {
-			return new long[] {PortalUtil.getClassNameId(className)};
+			return new long[] {classNameLocalService.getClassNameId(className)};
 		}
 
 		List<AssetRendererFactory> rendererFactories =
@@ -897,7 +897,7 @@
 		for (int i = 0; i < rendererFactories.size(); i++) {
 			AssetRendererFactory rendererFactory = rendererFactories.get(i);
 
-			classNameIds[i] = PortalUtil.getClassNameId(
+			classNameIds[i] = classNameLocalService.getClassNameId(
 				rendererFactory.getClassName());
 		}
 
