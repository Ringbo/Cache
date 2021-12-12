diff --git a/src/java/org/apache/cassandra/exceptions/AlreadyExistsException.java b/src/java/org/apache/cassandra/exceptions/AlreadyExistsException.java
index f023a07..4530568 100644
--- a/src/java/org/apache/cassandra/exceptions/AlreadyExistsException.java
+++ b/src/java/org/apache/cassandra/exceptions/AlreadyExistsException.java
@@ -31,7 +31,7 @@
 
     public AlreadyExistsException(String ksName, String cfName)
     {
-        this(ksName, cfName, String.format("Cannot add already existing column family \"%s\" to keyspace \"%s\"", ksName, cfName));
+        this(ksName, cfName, String.format("Cannot add already existing column family \"%s\" to keyspace \"%s\"", cfName, ksName));
     }
 
     public AlreadyExistsException(String ksName)
