diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 42e3ddf..d465431 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -2011,7 +2011,7 @@
      */
     public void onChange(InetAddressAndPort endpoint, ApplicationState state, VersionedValue value)
     {
-        if (state == ApplicationState.STATUS | state == ApplicationState.STATUS_WITH_PORT)
+        if (state == ApplicationState.STATUS || state == ApplicationState.STATUS_WITH_PORT)
         {
             String[] pieces = splitValue(value);
             assert (pieces.length > 0);
