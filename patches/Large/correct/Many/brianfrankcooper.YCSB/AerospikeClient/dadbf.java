diff --git a/aerospike/src/main/java/com/yahoo/ycsb/db/AerospikeClient.java b/aerospike/src/main/java/com/yahoo/ycsb/db/AerospikeClient.java
index 3678f97..87d3dcf 100644
--- a/aerospike/src/main/java/com/yahoo/ycsb/db/AerospikeClient.java
+++ b/aerospike/src/main/java/com/yahoo/ycsb/db/AerospikeClient.java
@@ -77,7 +77,7 @@
           new com.aerospike.client.AerospikeClient(clientPolicy, host, port);
     } catch (AerospikeException e) {
       throw new DBException(String.format("Error while creating Aerospike " +
-          "client for %s:%d.", host, port));
+          "client for %s:%d.", host, port), e);
     }
   }
 
@@ -150,7 +150,7 @@
         return RESULT_OK;
       } catch (AerospikeException e) {
         if (e.getResultCode() != ResultCode.DEVICE_OVERLOAD) {
-          System.err.println("Error while updating key " + key + ": " + e);
+          System.err.println("Error while writing key " + key + ": " + e);
           return RESULT_ERROR;
         }
 
