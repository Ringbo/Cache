diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaField.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaField.java
index 6ee290d..48e6b34 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaField.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaField.java
@@ -99,7 +99,7 @@
         ResolvedJavaMethod initMethod = null;
         try {
             Class<?> rjm = ResolvedJavaMethod.class;
-            makeGraphMethod = runtime.lookupJavaMethod(ReplacementsImpl.class.getDeclaredMethod("makeGraph", rjm, rjm, SnippetInliningPolicy.class));
+            makeGraphMethod = runtime.lookupJavaMethod(ReplacementsImpl.class.getDeclaredMethod("makeGraph", rjm, rjm, SnippetInliningPolicy.class, boolean.class));
             initMethod = runtime.lookupJavaMethod(SnippetTemplate.AbstractTemplates.class.getDeclaredMethod("template", Arguments.class));
         } catch (NoSuchMethodException | SecurityException e) {
             throw new GraalInternalError(e);
