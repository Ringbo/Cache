diff --git a/src/main/java/com/google/devtools/build/lib/rules/android/ApkProvider.java b/src/main/java/com/google/devtools/build/lib/rules/android/ApkProvider.java
index d265fd3..534e24a 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/android/ApkProvider.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/android/ApkProvider.java
@@ -27,10 +27,10 @@
   public static ApkProvider create(
       Artifact apk,
       Artifact unsignedApk,
-      @Nullable Artifact coverageMetdata,
+      @Nullable Artifact coverageMetadata,
       Artifact mergedManifest,
       Artifact keystore) {
-    return new AutoValue_ApkProvider(apk, unsignedApk, coverageMetdata, mergedManifest, keystore);
+    return new AutoValue_ApkProvider(apk, unsignedApk, coverageMetadata, mergedManifest, keystore);
   }
 
   /** Returns the APK file built in the transitive closure. */
