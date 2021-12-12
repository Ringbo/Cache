diff --git a/src/main/com/mongodb/ReplicaSetStatus.java b/src/main/com/mongodb/ReplicaSetStatus.java
index 7db2372..7131b65 100644
--- a/src/main/com/mongodb/ReplicaSetStatus.java
+++ b/src/main/com/mongodb/ReplicaSetStatus.java
@@ -293,7 +293,7 @@
     }
 
     void close(){
-        _closed = false;
+        _closed = true;
     }
 
     final Mongo _mongo;
