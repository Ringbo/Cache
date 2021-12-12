diff --git a/src/main/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentation.java b/src/main/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentation.java
index d0d0812..fb2a57f 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentation.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentation.java
@@ -61,8 +61,7 @@
                 new Runfiles.Builder(ruleContext.getWorkspaceName())
                     .addTransitiveArtifacts(filesToBuild)
                     .build()))
-        .addNativeDeclaredProvider(
-            new AndroidInstrumentationInfoProvider(targetApk, instrumentationApk))
+        .addNativeDeclaredProvider(new AndroidInstrumentationInfo(targetApk, instrumentationApk))
         .build();
   }
 
