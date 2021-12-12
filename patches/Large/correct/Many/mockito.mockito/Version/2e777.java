diff --git a/buildSrc/src/main/groovy/org/mockito/release/version/Version.java b/buildSrc/src/main/groovy/org/mockito/release/version/Version.java
index a51faa6..62ff968 100644
--- a/buildSrc/src/main/groovy/org/mockito/release/version/Version.java
+++ b/buildSrc/src/main/groovy/org/mockito/release/version/Version.java
@@ -10,7 +10,7 @@
     /**
      * Provides instance of version file
      */
-    VersionFile versionFile(File versionFile) {
+    public static VersionFile versionFile(File versionFile) {
         return new DefaultVersionFile(versionFile);
     }
 }
