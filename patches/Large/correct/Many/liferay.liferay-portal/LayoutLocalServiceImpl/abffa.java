diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index 4ab2176..910d295 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -2585,7 +2585,7 @@
 			groupId, privateLayout, layoutId);
 
 		layout.setModifiedDate(now);
-		layout.setTypeSettings(typeSettingsProperties.toString());
+		layout.setTypeSettings(typeSettingsProperties.toSortedString());
 
 		layoutPersistence.update(layout);
 
