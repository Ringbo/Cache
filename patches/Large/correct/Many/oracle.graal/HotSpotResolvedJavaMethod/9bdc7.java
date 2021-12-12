diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethod.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethod.java
index b05e7ee..fc947ea 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethod.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethod.java
@@ -141,7 +141,7 @@
     }
 
     @Override
-    public ResolvedJavaType getDeclaringClass() {
+    public HotSpotResolvedObjectType getDeclaringClass() {
         return holder;
     }
 
