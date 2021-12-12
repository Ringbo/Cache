diff --git a/src/main/java/com/orangefunction/tomcat/redissessions/RedisSessionManager.java b/src/main/java/com/orangefunction/tomcat/redissessions/RedisSessionManager.java
index 0f5c8e3..3ae82b7 100644
--- a/src/main/java/com/orangefunction/tomcat/redissessions/RedisSessionManager.java
+++ b/src/main/java/com/orangefunction/tomcat/redissessions/RedisSessionManager.java
@@ -186,7 +186,7 @@
   }
 
   public void setSentinelMaster(String master) {
-    this.sentinelMaster = sentinelMaster;
+    this.sentinelMaster = master;
   }
 
   @Override
