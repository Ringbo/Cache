diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
index 1ca662a..dc82981 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRRuleImpl.java
@@ -48,7 +48,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
