diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
index dc82981..1ca662a 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
@@ -48,7 +48,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
