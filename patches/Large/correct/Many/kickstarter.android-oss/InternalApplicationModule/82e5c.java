diff --git a/app/src/internal/java/com/kickstarter/InternalApplicationModule.java b/app/src/internal/java/com/kickstarter/InternalApplicationModule.java
index 3b6cc63..a9e46fc 100644
--- a/app/src/internal/java/com/kickstarter/InternalApplicationModule.java
+++ b/app/src/internal/java/com/kickstarter/InternalApplicationModule.java
@@ -20,7 +20,7 @@
 public final class InternalApplicationModule {
   @Provides
   @Singleton
-  ApiEndpoint provideApiEndpoint(@ApiEndpointPreference final @NonNull StringPreference apiEndpointPreference) {
+  ApiEndpoint provideApiEndpoint(@ApiEndpointPreference final @NonNull StringPreferenceType apiEndpointPreference) {
     return ApiEndpoint.from(apiEndpointPreference.get());
   }
 
