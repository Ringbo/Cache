diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
index fe2b6df..994fe7d 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
@@ -87,7 +87,7 @@
      */
     @Override
     public final AtmosphereResource create(AtmosphereConfig config,
-                                           DefaultAtmosphereRequest request,
+                                           AtmosphereRequest request,
                                            AtmosphereResponse response,
                                            AsyncSupport<?> a) {
         AtmosphereResource r = null;
@@ -114,7 +114,7 @@
     @Override
     public final AtmosphereResource create(AtmosphereConfig config,
                                            Broadcaster broadcaster,
-                                           DefaultAtmosphereRequest request,
+                                           AtmosphereRequest request,
                                            AtmosphereResponse response,
                                            AsyncSupport<?> a,
                                            AtmosphereHandler handler) {
@@ -135,7 +135,7 @@
     @Override
     public final AtmosphereResource create(AtmosphereConfig config,
                                            Broadcaster broadcaster,
-                                           DefaultAtmosphereRequest request,
+                                           AtmosphereRequest request,
                                            AtmosphereResponse response,
                                            AsyncSupport<?> a,
                                            AtmosphereHandler handler,
@@ -220,7 +220,7 @@
         response.setHeader(HeaderConfig.X_ATMOSPHERE_TRACKING_ID, uuid);
         return create(config,
                 noOps,
-                DefaultAtmosphereRequest.newInstance(),
+                AtmosphereRequest.newInstance(),
                 response,
                 config.framework().getAsyncSupport(),
                 noOpsHandler);
@@ -231,11 +231,11 @@
      *
      * @param config an {@link AtmosphereConfig}
      * @param uuid   a String representing a UUID
-     * @param request a {@link DefaultAtmosphereRequest}
+     * @param request a {@link AtmosphereRequest}
      * @return
      */
     @Override
-    public final AtmosphereResource create(AtmosphereConfig config, String uuid, DefaultAtmosphereRequest request) {
+    public final AtmosphereResource create(AtmosphereConfig config, String uuid, AtmosphereRequest request) {
         AtmosphereResponse response = AtmosphereResponse.newInstance();
         response.setHeader(HeaderConfig.X_ATMOSPHERE_TRACKING_ID, uuid);
         return create(config,
