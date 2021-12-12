diff --git a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/portlet/configuration/icon/TemplatesPortletConfigurationIconFactory.java b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/portlet/configuration/icon/TemplatesPortletConfigurationIconFactory.java
index 7b8b187..38c8e16 100644
--- a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/portlet/configuration/icon/TemplatesPortletConfigurationIconFactory.java
+++ b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/portlet/configuration/icon/TemplatesPortletConfigurationIconFactory.java
@@ -39,7 +39,7 @@
 
 	@Override
 	public PortletConfigurationIcon create(PortletRequest portletRequest) {
-		return new StructuresPortletConfigurationIcon(portletRequest);
+		return new TemplatesPortletConfigurationIcon(portletRequest);
 	}
 
 	@Override
