diff --git a/core/java/android/content/pm/PackageParser.java b/core/java/android/content/pm/PackageParser.java
index a1c0f48..88907c1 100644
--- a/core/java/android/content/pm/PackageParser.java
+++ b/core/java/android/content/pm/PackageParser.java
@@ -1189,7 +1189,7 @@
 
         if (sa.getBoolean(
                 com.android.internal.R.styleable.AndroidManifestApplication_testOnly,
-                true)) {
+                false)) {
             ai.flags |= ApplicationInfo.FLAG_TEST_ONLY;
         }
 
