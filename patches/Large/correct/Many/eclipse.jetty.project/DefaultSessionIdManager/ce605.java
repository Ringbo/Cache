diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/session/DefaultSessionIdManager.java b/jetty-server/src/main/java/org/eclipse/jetty/server/session/DefaultSessionIdManager.java
index 01793d2..c69130c 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/session/DefaultSessionIdManager.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/session/DefaultSessionIdManager.java
@@ -354,7 +354,7 @@
 
         if (_houseKeeper == null)
         {
-            LOG.warn("No SessionScavenger set, using defaults");
+            LOG.info("No SessionScavenger set, using defaults");
             _ownHouseKeeper = true;
             _houseKeeper = new HouseKeeper();
             _houseKeeper.setSessionIdManager(this);
