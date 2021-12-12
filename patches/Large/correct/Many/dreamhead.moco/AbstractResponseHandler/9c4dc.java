diff --git a/moco-core/src/main/java/com/github/dreamhead/moco/handler/AbstractResponseHandler.java b/moco-core/src/main/java/com/github/dreamhead/moco/handler/AbstractResponseHandler.java
index b6ce7a6..5837fe1 100644
--- a/moco-core/src/main/java/com/github/dreamhead/moco/handler/AbstractResponseHandler.java
+++ b/moco-core/src/main/java/com/github/dreamhead/moco/handler/AbstractResponseHandler.java
@@ -6,7 +6,7 @@
 public abstract class AbstractResponseHandler implements ResponseHandler {
     @Override
     @SuppressWarnings("unchecked")
-    public final ResponseHandler apply(final MocoConfig config) {
+    public ResponseHandler apply(final MocoConfig config) {
         if (config.isFor(MocoConfig.RESPONSE_ID)) {
             return (ResponseHandler) config.apply(this);
         }
