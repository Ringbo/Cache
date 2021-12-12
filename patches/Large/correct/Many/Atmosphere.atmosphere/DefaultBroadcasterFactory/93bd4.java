diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
index ba642cc..345aa22 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
@@ -87,7 +87,7 @@
 
     private void configure(String broadcasterLifeCyclePolicy) {
 
-        int maxIdleTime = 5 * 60 * 100;
+        int maxIdleTime = 5 * 60 * 1000;
         String idleTime = config.getInitParameter(ApplicationConfig.BROADCASTER_LIFECYCLE_POLICY_IDLETIME);
         if (idleTime != null) {
             maxIdleTime = Integer.parseInt(idleTime);
