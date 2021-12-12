diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
index 6ac6dd2..70c83d6 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSignature.java
@@ -134,7 +134,7 @@
     }
 
     @Override
-    public JavaType returnType(JavaType accessingClass) {
+    public JavaType returnType(ResolvedJavaType accessingClass) {
         if (returnTypeCache == null) {
             returnTypeCache = HotSpotGraalRuntime.getInstance().lookupType(returnType, (HotSpotResolvedJavaType) accessingClass, false);
         }
