diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayApplicationPlugin.java b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayApplicationPlugin.java
index 00b4629..2328c2e 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayApplicationPlugin.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayApplicationPlugin.java
@@ -259,7 +259,7 @@
             createGeneratedScalaSourceSetsForType(RoutesSourceSet.class, binaries, serviceRegistry);
         }
 
-        void createGeneratedScalaSourceSetsForType(final Class<? extends LanguageSourceSet> languageSourceSetType, ModelMap<PlayApplicationBinarySpec> binaries, ServiceRegistry serviceRegistry) {
+        private void createGeneratedScalaSourceSetsForType(final Class<? extends LanguageSourceSet> languageSourceSetType, ModelMap<PlayApplicationBinarySpec> binaries, ServiceRegistry serviceRegistry) {
             final FileResolver fileResolver = serviceRegistry.get(FileResolver.class);
             final Instantiator instantiator = serviceRegistry.get(Instantiator.class);
             binaries.all(new Action<PlayApplicationBinarySpec>() {
