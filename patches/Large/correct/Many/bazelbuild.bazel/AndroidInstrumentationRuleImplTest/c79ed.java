diff --git a/src/test/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentationRuleImplTest.java b/src/test/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentationRuleImplTest.java
index 860082c..000057a 100644
--- a/src/test/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentationRuleImplTest.java
+++ b/src/test/java/com/google/devtools/build/lib/rules/android/AndroidInstrumentationRuleImplTest.java
@@ -71,8 +71,8 @@
         ")");
     ConfiguredTarget instrumentation = getConfiguredTarget("//javatests/com/app/instrumentation");
     assertThat(instrumentation).isNotNull();
-    AndroidInstrumentationInfoProvider instrumentationProvider =
-        instrumentation.get(AndroidInstrumentationInfoProvider.ANDROID_INSTRUMENTATION_INFO);
+    AndroidInstrumentationInfo instrumentationProvider =
+        instrumentation.get(AndroidInstrumentationInfo.PROVIDER);
     assertThat(instrumentationProvider.getTargetApk()).isNotNull();
     assertThat(instrumentationProvider.getTargetApk().prettyPrint())
         .isEqualTo("javatests/com/app/instrumentation/instrumentation-target.apk");
@@ -95,8 +95,8 @@
         ")");
     ConfiguredTarget instrumentation = getConfiguredTarget("//javatests/com/app/instrumentation");
     assertThat(instrumentation).isNotNull();
-    AndroidInstrumentationInfoProvider instrumentationProvider =
-        instrumentation.get(AndroidInstrumentationInfoProvider.ANDROID_INSTRUMENTATION_INFO);
+    AndroidInstrumentationInfo instrumentationProvider =
+        instrumentation.get(AndroidInstrumentationInfo.PROVIDER);
 
     Artifact targetApk = instrumentationProvider.getTargetApk();
     assertThat(targetApk).isNotNull();
