diff --git a/subprojects/osgi/src/main/java/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java b/subprojects/osgi/src/main/java/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
index 663a99a..6adb14a 100644
--- a/subprojects/osgi/src/main/java/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
+++ b/subprojects/osgi/src/main/java/org/gradle/api/internal/plugins/osgi/DefaultOsgiManifest.java
@@ -311,7 +311,7 @@
         modelledInstructions.put(Analyzer.BUNDLE_NAME, createListFromPropertyString(name));
         modelledInstructions.put(Analyzer.BUNDLE_VERSION, createListFromPropertyString(version));
         modelledInstructions.put(Analyzer.BUNDLE_DESCRIPTION, createListFromPropertyString(description));
-        modelledInstructions.put(Analyzer.BUNDLE_LICENSE, createListFromPropertyString(description));
+        modelledInstructions.put(Analyzer.BUNDLE_LICENSE, createListFromPropertyString(license));
         modelledInstructions.put(Analyzer.BUNDLE_VENDOR, createListFromPropertyString(vendor));
         modelledInstructions.put(Analyzer.BUNDLE_DOCURL, createListFromPropertyString(docURL));
 
