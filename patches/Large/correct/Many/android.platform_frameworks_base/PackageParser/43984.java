diff --git a/core/java/android/content/pm/PackageParser.java b/core/java/android/content/pm/PackageParser.java
index bac55cc..b31df32 100644
--- a/core/java/android/content/pm/PackageParser.java
+++ b/core/java/android/content/pm/PackageParser.java
@@ -2138,7 +2138,7 @@
                     havePerm = true;
                 }
                 if (writePermission != null) {
-                    writePermission = readPermission.intern();
+                    writePermission = writePermission.intern();
                     havePerm = true;
                 }
 
