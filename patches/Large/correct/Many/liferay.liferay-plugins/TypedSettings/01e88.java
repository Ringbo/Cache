diff --git a/shared/portal-settings-shared/src/com/liferay/portal/settings/TypedSettings.java b/shared/portal-settings-shared/src/com/liferay/portal/settings/TypedSettings.java
index ef81232..256fcec 100644
--- a/shared/portal-settings-shared/src/com/liferay/portal/settings/TypedSettings.java
+++ b/shared/portal-settings-shared/src/com/liferay/portal/settings/TypedSettings.java
@@ -41,7 +41,7 @@
 	}
 
 	public double getDoubleValue(String key) {
-		return getDoubleValue(key, 0.0);
+		return getDoubleValue(key, 0);
 	}
 
 	public double getDoubleValue(String key, double defaultValue) {
@@ -51,7 +51,7 @@
 	}
 
 	public float getFloatValue(String key) {
-		return getFloatValue(key, 0.0F);
+		return getFloatValue(key, 0);
 	}
 
 	public float getFloatValue(String key, float defaultValue) {
