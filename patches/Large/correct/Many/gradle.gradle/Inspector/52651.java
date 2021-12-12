diff --git a/subprojects/internal-android-performance-testing/src/main/java/org/gradle/performance/android/Inspector.java b/subprojects/internal-android-performance-testing/src/main/java/org/gradle/performance/android/Inspector.java
index d234740..c9bafe8 100644
--- a/subprojects/internal-android-performance-testing/src/main/java/org/gradle/performance/android/Inspector.java
+++ b/subprojects/internal-android-performance-testing/src/main/java/org/gradle/performance/android/Inspector.java
@@ -102,7 +102,7 @@
         if (!javaLibsByFile.containsKey(javaLibrary.getJarFile())) {
             javaLibsByFile.put(javaLibrary.getJarFile(), javaLibrary);
         }
-        if (!javaLibsByFile.containsKey(javaLibrary)) {
+        if (!javaLibsByIdentity.containsKey(javaLibrary)) {
             javaLibsByIdentity.put(javaLibrary, javaLibrary);
         }
         unpack(javaLibrary, javaLibsBackingByIdentity);
