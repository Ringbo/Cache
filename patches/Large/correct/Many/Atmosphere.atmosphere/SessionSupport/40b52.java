diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/SessionSupport.java b/modules/cpr/src/main/java/org/atmosphere/cpr/SessionSupport.java
index 8c69493..76e0c1b 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/SessionSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/SessionSupport.java
@@ -31,12 +31,12 @@
 
     @Override
     public void sessionCreated(HttpSessionEvent se) {
-        logger.info("Session created");
+        logger.trace("Session created");
     }
 
     @Override
     public void sessionDestroyed(HttpSessionEvent se) {
-        logger.info("Session destroyed");
+        logger.trace("Session destroyed");
         try {
             HttpSession s = se.getSession();
             for (Broadcaster b : BroadcasterFactory.getDefault().lookupAll()) {
