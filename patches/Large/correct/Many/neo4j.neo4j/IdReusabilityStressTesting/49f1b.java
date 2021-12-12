diff --git a/stresstests/src/test/java/org/neo4j/causalclustering/stresstests/IdReusabilityStressTesting.java b/stresstests/src/test/java/org/neo4j/causalclustering/stresstests/IdReusabilityStressTesting.java
index c887553..364b9be 100644
--- a/stresstests/src/test/java/org/neo4j/causalclustering/stresstests/IdReusabilityStressTesting.java
+++ b/stresstests/src/test/java/org/neo4j/causalclustering/stresstests/IdReusabilityStressTesting.java
@@ -139,7 +139,7 @@
         catch ( Throwable e )
         {
             System.out.println( "Exception thrown from execution service:" );
-            e.printStackTrace();
+            e.printStackTrace( System.out );
         }
         finally
         {
@@ -273,7 +273,7 @@
 
                 // Ignore throws for now
                 System.out.println( "InsertionWorkload encountered error:" );
-                e.printStackTrace();
+                e.printStackTrace( System.out );
             }
         }
     }
@@ -311,7 +311,7 @@
 
                 // Ignore throws for now
                 System.out.println( "ReelectionWorkload encountered error:" );
-                e.printStackTrace();
+                e.printStackTrace( System.out );
             }
         }
     }
@@ -357,7 +357,7 @@
 
                 // Ignore throws for now
                 System.out.println( "DeletionWorkload encountered error:" );
-                e.printStackTrace();
+                e.printStackTrace( System.out );
             }
         }
     }
