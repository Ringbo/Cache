diff --git a/hazelcast/src/main/java/com/hazelcast/impl/management/ManagementCenterService.java b/hazelcast/src/main/java/com/hazelcast/impl/management/ManagementCenterService.java
index 11a1590..2fcd3e6 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/management/ManagementCenterService.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/management/ManagementCenterService.java
@@ -308,7 +308,7 @@
             register(new RunGcRequest());
             register(new GetMemberSystemPropertiesRequest());
             register(new GetMapEntryRequest());
-            register(new LogVersionMismatchRequest());
+            register(new VersionMismatchLogRequest());
             register(new ShutdownMemberRequest());
         }
 
