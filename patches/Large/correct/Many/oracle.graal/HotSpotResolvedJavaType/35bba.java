diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaType.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaType.java
index 31d4a32..5246947 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaType.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaType.java
@@ -358,7 +358,7 @@
     @Override
     public ResolvedJavaField[] getInstanceFields(boolean includeSuperclasses) {
         if (instanceFields == null) {
-            if (isArrayClass() && isInterface()) {
+            if (isArrayClass() || isInterface()) {
                 instanceFields = new HotSpotResolvedJavaField[0];
             } else {
                 HotSpotResolvedJavaField[] myFields = HotSpotGraalRuntime.getInstance().getCompilerToVM().getInstanceFields(this);
