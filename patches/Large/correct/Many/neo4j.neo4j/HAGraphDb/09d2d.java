diff --git a/enterprise/ha/src/main/java/org/neo4j/kernel/HAGraphDb.java b/enterprise/ha/src/main/java/org/neo4j/kernel/HAGraphDb.java
index 6608295..6bf6c1b 100644
--- a/enterprise/ha/src/main/java/org/neo4j/kernel/HAGraphDb.java
+++ b/enterprise/ha/src/main/java/org/neo4j/kernel/HAGraphDb.java
@@ -427,7 +427,7 @@
 
     private int getClientLockReadTimeoutFromConfig( Map<String, String> config )
     {
-        String value = config.get( CONFIG_KEY_READ_TIMEOUT );
+        String value = config.get( CONFIG_KEY_LOCK_READ_TIMEOUT );
         return value != null ? Integer.parseInt( value ) : getClientReadTimeoutFromConfig( config );
     }
     
