diff --git a/services/core/java/com/android/server/pm/Settings.java b/services/core/java/com/android/server/pm/Settings.java
index 648f847..4cf1814 100644
--- a/services/core/java/com/android/server/pm/Settings.java
+++ b/services/core/java/com/android/server/pm/Settings.java
@@ -3122,7 +3122,7 @@
                             ATTR_VOLUME_UUID);
                     final VersionInfo ver = findOrCreateVersion(volumeUuid);
                     ver.sdkVersion = XmlUtils.readIntAttribute(parser, ATTR_SDK_VERSION);
-                    ver.databaseVersion = XmlUtils.readIntAttribute(parser, ATTR_SDK_VERSION);
+                    ver.databaseVersion = XmlUtils.readIntAttribute(parser, ATTR_DATABASE_VERSION);
                     ver.fingerprint = XmlUtils.readStringAttribute(parser, ATTR_FINGERPRINT);
                 } else {
                     Slog.w(PackageManagerService.TAG, "Unknown element under <packages>: "
