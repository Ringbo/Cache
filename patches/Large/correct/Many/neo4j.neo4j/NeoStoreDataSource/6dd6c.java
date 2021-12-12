diff --git a/community/kernel/src/main/java/org/neo4j/kernel/NeoStoreDataSource.java b/community/kernel/src/main/java/org/neo4j/kernel/NeoStoreDataSource.java
index 3eebc52..ae9552f 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/NeoStoreDataSource.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/NeoStoreDataSource.java
@@ -484,8 +484,7 @@
         catch ( Throwable e )
         {
             // Something unexpected happened during startup
-            msgLog.warn( "Exception occurred while setting up store modules. Attempting to close things down.",
-                    e, true );
+            msgLog.warn( "Exception occurred while setting up store modules. Attempting to close things down.", e );
             try
             {
                 // Close the neostore, so that locks are released properly
@@ -508,8 +507,7 @@
         catch ( Throwable e )
         {
             // Something unexpected happened during startup
-            msgLog.warn( "Exception occurred while starting the datasource. Attempting to close things down.",
-                    e, true );
+            msgLog.warn( "Exception occurred while starting the datasource. Attempting to close things down.", e );
             try
             {
                 life.shutdown();
