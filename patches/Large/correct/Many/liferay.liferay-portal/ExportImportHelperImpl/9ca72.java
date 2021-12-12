diff --git a/portal-impl/src/com/liferay/portal/lar/ExportImportHelperImpl.java b/portal-impl/src/com/liferay/portal/lar/ExportImportHelperImpl.java
index e48822f..0196f49 100644
--- a/portal-impl/src/com/liferay/portal/lar/ExportImportHelperImpl.java
+++ b/portal-impl/src/com/liferay/portal/lar/ExportImportHelperImpl.java
@@ -416,7 +416,7 @@
 				Property groupIdProperty = PropertyFactoryUtil.forName(
 					"groupId");
 
-				disjunction.add(groupIdProperty.eq(0));
+				disjunction.add(groupIdProperty.eq(0L));
 				disjunction.add(
 					groupIdProperty.eq(portletDataContext.getScopeGroupId()));
 
