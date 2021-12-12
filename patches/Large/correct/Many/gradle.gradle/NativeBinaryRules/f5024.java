diff --git a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/configure/NativeBinaryRules.java b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/configure/NativeBinaryRules.java
index 5e40cac..8124bc6 100644
--- a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/configure/NativeBinaryRules.java
+++ b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/configure/NativeBinaryRules.java
@@ -107,7 +107,7 @@
         return nativeBinary.getPlatformToolProvider().getStaticLibraryName(baseNameOf(nativeBinary));
     }
 
-    private static String baseNameOf(NativeBinarySpecInternal nativeBinary) {
+    private static String baseNameOf(NativeBinarySpec nativeBinary) {
         return nativeBinary.getComponent().getBaseName();
     }
 
