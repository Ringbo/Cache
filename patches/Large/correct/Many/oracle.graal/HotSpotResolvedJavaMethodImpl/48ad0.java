diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethodImpl.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethodImpl.java
index 450ee5b..ba1dc0f 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethodImpl.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotResolvedJavaMethodImpl.java
@@ -121,7 +121,7 @@
 
     @Override
     public boolean equals(Object obj) {
-        if (obj instanceof HotSpotResolvedJavaMethod) {
+        if (obj instanceof HotSpotResolvedJavaMethodImpl) {
             HotSpotResolvedJavaMethodImpl that = (HotSpotResolvedJavaMethodImpl) obj;
             return that.metaspaceMethod == metaspaceMethod;
         }
