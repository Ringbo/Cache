diff --git a/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java b/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
index fa3e7cb..437f29f 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
@@ -331,7 +331,7 @@
     private void configureFacetAndCheckJvm(JvmTarget jvmTarget) {
         IdeModifiableModelsProviderImpl modelsProvider = new IdeModifiableModelsProviderImpl(getProject());
         try {
-            KotlinFacet facet = FacetUtilsKt.getOrCreateFacet(getModule(), modelsProvider, false, false);
+            KotlinFacet facet = FacetUtilsKt.getOrCreateFacet(getModule(), modelsProvider, false, null, false);
             TargetPlatformKind.Jvm platformKind = TargetPlatformKind.Jvm.Companion.get(jvmTarget);
             FacetUtilsKt.configureFacet(
                     facet,
