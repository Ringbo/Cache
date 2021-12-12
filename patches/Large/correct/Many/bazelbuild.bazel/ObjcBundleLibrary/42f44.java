diff --git a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcBundleLibrary.java b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcBundleLibrary.java
index 880c9bd..1a30d4b 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcBundleLibrary.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcBundleLibrary.java
@@ -60,7 +60,7 @@
     new BundleSupport(
             ruleContext,
             appleConfiguration,
-            appleConfiguration.getMultiArchPlatform(PlatformType.IOS),
+            appleConfiguration.getSingleArchPlatform(),
             bundling,
             new ExtraActoolArgs())
         .validateResources(common.getObjcProvider())
