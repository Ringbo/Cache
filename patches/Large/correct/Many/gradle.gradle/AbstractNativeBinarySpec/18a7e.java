diff --git a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/AbstractNativeBinarySpec.java b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/AbstractNativeBinarySpec.java
index a265955..1f86b9d 100644
--- a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/AbstractNativeBinarySpec.java
+++ b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/internal/AbstractNativeBinarySpec.java
@@ -62,7 +62,7 @@
         this.buildType = buildType;
         this.buildable = true;
         this.resolver = resolver;
-        component.getSource().all(new Action<LanguageSourceSet>() {
+        component.getSources().all(new Action<LanguageSourceSet>() {
             public void execute(LanguageSourceSet sourceSet) {
                 sourceSets.add(sourceSet);
             }
