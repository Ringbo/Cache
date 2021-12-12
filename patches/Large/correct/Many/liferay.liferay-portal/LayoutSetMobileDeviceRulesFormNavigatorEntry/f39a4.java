diff --git a/modules/apps/mobile-device-rules/mobile-device-rules-web/src/main/java/com/liferay/mobile/device/rules/web/form/navigator/LayoutSetMobileDeviceRulesFormNavigatorEntry.java b/modules/apps/mobile-device-rules/mobile-device-rules-web/src/main/java/com/liferay/mobile/device/rules/web/form/navigator/LayoutSetMobileDeviceRulesFormNavigatorEntry.java
index 8aa36e7..0d0c12e 100644
--- a/modules/apps/mobile-device-rules/mobile-device-rules-web/src/main/java/com/liferay/mobile/device/rules/web/form/navigator/LayoutSetMobileDeviceRulesFormNavigatorEntry.java
+++ b/modules/apps/mobile-device-rules/mobile-device-rules-web/src/main/java/com/liferay/mobile/device/rules/web/form/navigator/LayoutSetMobileDeviceRulesFormNavigatorEntry.java
@@ -59,7 +59,7 @@
 		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
 			"content.Language", locale, getClass());
 
-		return LanguageUtil.get(locale, getKey());
+		return LanguageUtil.get(resourceBundle, getKey());
 	}
 
 	@Override
