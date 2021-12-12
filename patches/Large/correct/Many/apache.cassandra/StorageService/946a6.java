diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 9f24945..c2d40d8 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -431,7 +431,7 @@
     {
         isBootstrapMode = true;
         SystemTable.updateToken(token); // DON'T use setToken, that makes us part of the ring locally which is incorrect until we are done bootstrapping
-        Gossiper.instance.addLocalApplicationState(ApplicationState.STATUS, valueFactory.normal(token));
+        Gossiper.instance.addLocalApplicationState(ApplicationState.STATUS, valueFactory.bootstrapping(token));
         setMode("Joining: sleeping " + RING_DELAY + " ms for pending range setup", true);
         try
         {
