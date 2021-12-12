diff --git a/enterprise/backup/src/main/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProvider.java b/enterprise/backup/src/main/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProvider.java
index 042b2bf..a935d65 100644
--- a/enterprise/backup/src/main/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProvider.java
+++ b/enterprise/backup/src/main/java/org/neo4j/backup/impl/BackupSupportingClassesFactoryProvider.java
@@ -26,7 +26,7 @@
 
 import static java.util.Comparator.comparingInt;
 
-class BackupSupportingClassesFactoryProvider extends Service
+public class BackupSupportingClassesFactoryProvider extends Service
 {
     /**
      * Create a new instance of a service implementation identified with the
@@ -34,12 +34,12 @@
      *
      * @param key the main key for identifying this service implementation
      */
-    protected BackupSupportingClassesFactoryProvider( String key )
+    public BackupSupportingClassesFactoryProvider( String key )
     {
         super( key );
     }
 
-    protected BackupSupportingClassesFactoryProvider()
+    public BackupSupportingClassesFactoryProvider()
     {
         super( "default-backup-support-provider" );
     }
