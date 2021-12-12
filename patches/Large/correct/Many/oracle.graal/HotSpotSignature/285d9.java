diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
index 1d45409..978b7ad 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
@@ -117,7 +117,7 @@
         }
         JavaType type = argumentTypes[index];
         if (type == null || !(type instanceof ResolvedJavaType)) {
-            type = HotSpotGraalRuntime.getInstance().lookupType(arguments.get(index), (HotSpotResolvedJavaType) accessingClass, true);
+            type = HotSpotGraalRuntime.getInstance().lookupType(arguments.get(index), (HotSpotResolvedJavaType) accessingClass, false);
             argumentTypes[index] = type;
         }
         return type;
@@ -134,7 +134,7 @@
 
     @Override
     public JavaType getReturnType(ResolvedJavaType accessingClass) {
-        if (returnTypeCache == null) {
+        if (returnTypeCache == null || !(returnTypeCache instanceof ResolvedJavaType)) {
             returnTypeCache = HotSpotGraalRuntime.getInstance().lookupType(returnType, (HotSpotResolvedJavaType) accessingClass, false);
         }
         return returnTypeCache;
