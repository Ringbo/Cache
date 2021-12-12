diff --git a/services/java/com/android/server/pm/Settings.java b/services/java/com/android/server/pm/Settings.java
index d058a82..b85353c 100644
--- a/services/java/com/android/server/pm/Settings.java
+++ b/services/java/com/android/server/pm/Settings.java
@@ -1259,7 +1259,7 @@
                     final ArrayList<PackageCleanItem> pkgs = mPackagesToBeCleaned.valueAt(i);
                     for (int j=0; j<pkgs.size(); j++) {
                         serializer.startTag(null, "cleaning-package");
-                        PackageCleanItem item = pkgs.get(i);
+                        PackageCleanItem item = pkgs.get(j);
                         serializer.attribute(null, ATTR_NAME, item.packageName);
                         serializer.attribute(null, ATTR_CODE, item.andCode ? "true" : "false");
                         serializer.attribute(null, ATTR_USER, userStr);
