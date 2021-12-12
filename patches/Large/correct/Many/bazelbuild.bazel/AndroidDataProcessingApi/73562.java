diff --git a/src/main/java/com/google/devtools/build/lib/skylarkbuildapi/android/AndroidDataProcessingApi.java b/src/main/java/com/google/devtools/build/lib/skylarkbuildapi/android/AndroidDataProcessingApi.java
index 88845d1..6cef1cf 100644
--- a/src/main/java/com/google/devtools/build/lib/skylarkbuildapi/android/AndroidDataProcessingApi.java
+++ b/src/main/java/com/google/devtools/build/lib/skylarkbuildapi/android/AndroidDataProcessingApi.java
@@ -572,7 +572,7 @@
             positional = false,
             defaultValue = "[]",
             type = SkylarkList.class,
-            generic1 = AndroidAssetsInfoApi.class,
+            generic1 = TransitiveInfoCollectionApi.class,
             named = true,
             doc =
                 "Dependency targets. Providers will be extracted from these dependencies for each"
