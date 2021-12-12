diff --git a/src/main/com/mongodb/DBTCPConnector.java b/src/main/com/mongodb/DBTCPConnector.java
index c464049..a265292 100644
--- a/src/main/com/mongodb/DBTCPConnector.java
+++ b/src/main/com/mongodb/DBTCPConnector.java
@@ -272,7 +272,8 @@
         boolean secondaryOk = !(readPref == ReadPreference.primary());
 
         _checkClosed();
-        if (!secondaryOk)
+        // Don't check master on secondary reads unless connected to a replica set
+        if (!secondaryOk || getReplicaSetStatus() == null)
             checkMaster( false, !secondaryOk );
 
         final MyPort mp = _myPort.get();
