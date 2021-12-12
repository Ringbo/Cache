diff --git a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/BranchDetectingTxVerifier.java b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/BranchDetectingTxVerifier.java
index 2960941..98951e7 100644
--- a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/BranchDetectingTxVerifier.java
+++ b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/BranchDetectingTxVerifier.java
@@ -30,6 +30,10 @@
 import org.neo4j.kernel.impl.util.StringLogger;
 import org.neo4j.kernel.logging.Logging;
 
+/**
+ * Used on the master to verify that slaves are using the same logical database as the master is running. This is done
+ * by verifying transaction checksums.
+ */
 public class BranchDetectingTxVerifier implements TxChecksumVerifier
 {
     private final StringLogger logger;
@@ -55,14 +59,16 @@
             
             if ( !match )
             {
-                throw new BranchedDataException( stringify( txId, masterId, checksum ) +
-                        " doesn't match " + readChecksum );
+                throw new BranchedDataException(
+                        "The cluster contains two logically different versions of the database. " +
+                        "This will be automatically resolved. Details: " + stringify( txId, masterId, checksum ) +
+                        " does not match " + readChecksum );
             }
         }
         catch ( IOException e )
         {
             logger.logMessage( "Couldn't verify checksum for " + stringify( txId, masterId, checksum ), e );
-            throw new BranchedDataException( e );
+            throw new BranchedDataException( "Unable to perform a mandatory sanity check due to an IO error.", e );
         }
     }
     
