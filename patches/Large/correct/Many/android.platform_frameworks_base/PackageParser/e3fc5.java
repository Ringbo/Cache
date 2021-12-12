diff --git a/core/java/android/content/pm/PackageParser.java b/core/java/android/content/pm/PackageParser.java
index faf71ee..64376c1 100644
--- a/core/java/android/content/pm/PackageParser.java
+++ b/core/java/android/content/pm/PackageParser.java
@@ -1505,7 +1505,8 @@
                 if (!parseUsesPermission(pkg, res, parser, attrs)) {
                     return null;
                 }
-            } else if (tagName.equals("uses-permission-sdk-m")) {
+            } else if (tagName.equals("uses-permission-sdk-m")
+                    || tagName.equals("uses-permission-sdk-23")) {
                 if (!parseUsesPermission(pkg, res, parser, attrs)) {
                     return null;
                 }
