diff --git a/community/bolt/src/main/java/org/neo4j/bolt/runtime/BoltStateMachineFactoryImpl.java b/community/bolt/src/main/java/org/neo4j/bolt/runtime/BoltStateMachineFactoryImpl.java
index 55c49be..05392c8 100644
--- a/community/bolt/src/main/java/org/neo4j/bolt/runtime/BoltStateMachineFactoryImpl.java
+++ b/community/bolt/src/main/java/org/neo4j/bolt/runtime/BoltStateMachineFactoryImpl.java
@@ -84,7 +84,7 @@
         Duration txAwaitDuration = Duration.ofMillis( bookmarkReadyTimeout );
         TransactionStateMachineSPI transactionSPI = new TransactionStateMachineV1SPI( db, availabilityGuard, txAwaitDuration, clock );
 
-        BoltStateMachineSPI boltSPI = new BoltStateMachineV1SPI( boltChannel, usageData, logging, authentication, connectionTracker, transactionSPI );
+        BoltStateMachineSPI boltSPI = new BoltStateMachineV1SPI( boltChannel, usageData, logging, authentication, transactionSPI );
         return new BoltStateMachineV1( boltSPI, boltChannel, clock );
     }
 
@@ -94,7 +94,7 @@
         Duration txAwaitDuration = Duration.ofMillis( bookmarkReadyTimeout );
         TransactionStateMachineSPI transactionSPI = new TransactionStateMachineV3SPI( db, availabilityGuard, txAwaitDuration, clock );
 
-        BoltStateMachineSPI boltSPI = new BoltStateMachineV1SPI( boltChannel, usageData, logging, authentication, connectionTracker, transactionSPI );
+        BoltStateMachineSPI boltSPI = new BoltStateMachineV1SPI( boltChannel, usageData, logging, authentication, transactionSPI );
         return new BoltStateMachineV3( boltSPI, boltChannel, clock );
     }
 }
