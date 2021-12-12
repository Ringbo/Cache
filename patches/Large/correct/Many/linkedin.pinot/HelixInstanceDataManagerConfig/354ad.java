diff --git a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/HelixInstanceDataManagerConfig.java b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/HelixInstanceDataManagerConfig.java
index b7fd9db..0a49f11 100644
--- a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/HelixInstanceDataManagerConfig.java
+++ b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/HelixInstanceDataManagerConfig.java
@@ -166,7 +166,7 @@
 
   @Override
   public boolean isDirectRealtimeOffheapAllocation() {
-    return _instanceDataManagerConfiguration.getBoolean(DIRECT_REALTIME_OFFHEAP_ALLOCATION, true);
+    return _instanceDataManagerConfiguration.getBoolean(DIRECT_REALTIME_OFFHEAP_ALLOCATION, false);
   }
 
   @Override
