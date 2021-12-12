diff --git a/src/java/org/apache/cassandra/gms/VersionedValue.java b/src/java/org/apache/cassandra/gms/VersionedValue.java
index fb6181a..2323f2b 100644
--- a/src/java/org/apache/cassandra/gms/VersionedValue.java
+++ b/src/java/org/apache/cassandra/gms/VersionedValue.java
@@ -160,7 +160,7 @@
 
         public VersionedValue rpcaddress(InetAddress endpoint)
         {
-            return new VersionedValue(endpoint.toString());
+            return new VersionedValue(endpoint.getHostAddress());
         }
 
         public VersionedValue releaseVersion()
