diff --git a/src/main/com/mongodb/DBTCPConnector.java b/src/main/com/mongodb/DBTCPConnector.java
index 7064c6a..b54a531 100644
--- a/src/main/com/mongodb/DBTCPConnector.java
+++ b/src/main/com/mongodb/DBTCPConnector.java
@@ -269,7 +269,8 @@
         boolean secondaryOk = !(readPref == ReadPreference.primary());
 
         _checkClosed();
-        if (!secondaryOk)
+        // Don't check master on secondary reads unless connected to a replica set
+        if (!secondaryOk || getReplicaSetStatus() == null)
             checkMaster( false, !secondaryOk );
 
         final MyPort mp = _myPort.get();
