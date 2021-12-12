diff --git a/substratevm/src/org.graalvm.polyglot.nativeapi/src/org/graalvm/polyglot/nativeapi/PolyglotNativeAPI.java b/substratevm/src/org.graalvm.polyglot.nativeapi/src/org/graalvm/polyglot/nativeapi/PolyglotNativeAPI.java
index ec493d2..d586a58 100644
--- a/substratevm/src/org.graalvm.polyglot.nativeapi/src/org/graalvm/polyglot/nativeapi/PolyglotNativeAPI.java
+++ b/substratevm/src/org.graalvm.polyglot.nativeapi/src/org/graalvm/polyglot/nativeapi/PolyglotNativeAPI.java
@@ -335,7 +335,7 @@
     public static PolyglotStatus poly_context_builder_allow_create_thread(PolyglotIsolateThread thread, PolyglotContextBuilder context_builder, boolean allow_create_thread) {
         return withHandledErrors(() -> {
             Context.Builder contextBuilder = fetchHandle(context_builder);
-            contextBuilder.allowNativeAccess(allow_create_thread);
+            contextBuilder.allowCreateThread(allow_create_thread);
         });
     }
 
