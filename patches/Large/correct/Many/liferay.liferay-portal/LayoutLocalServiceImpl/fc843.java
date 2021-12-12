diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index 910d295..4ab2176 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -2585,7 +2585,7 @@
 			groupId, privateLayout, layoutId);
 
 		layout.setModifiedDate(now);
-		layout.setTypeSettings(typeSettingsProperties.toSortedString());
+		layout.setTypeSettings(typeSettingsProperties.toString());
 
 		layoutPersistence.update(layout);
 
