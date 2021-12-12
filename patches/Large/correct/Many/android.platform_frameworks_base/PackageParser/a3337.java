diff --git a/core/java/android/content/pm/PackageParser.java b/core/java/android/content/pm/PackageParser.java
index f8898c1..c43111f 100644
--- a/core/java/android/content/pm/PackageParser.java
+++ b/core/java/android/content/pm/PackageParser.java
@@ -572,7 +572,7 @@
         }
 
         try {
-            JarFile jarFile = new JarFile(mArchiveSourcePath);
+            JarFile jarFile = new JarFile(mArchiveSourcePath, true, true);
 
             Certificate[] certs = null;
 
