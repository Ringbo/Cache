diff --git a/community/server/src/functionaltest/java/org/neo4j/server/webadmin/logging/HTTPLoggingFunctionalTest.java b/community/server/src/functionaltest/java/org/neo4j/server/webadmin/logging/HTTPLoggingFunctionalTest.java
index 192820c..785ab00 100644
--- a/community/server/src/functionaltest/java/org/neo4j/server/webadmin/logging/HTTPLoggingFunctionalTest.java
+++ b/community/server/src/functionaltest/java/org/neo4j/server/webadmin/logging/HTTPLoggingFunctionalTest.java
@@ -197,7 +197,7 @@
     {
         TargetDirectory targetDirectory = TargetDirectory.forTest( this.getClass() );
 
-        final File file = targetDirectory.directory( "unwritable" );
+        final File file = targetDirectory.file( "unwritable" );
         file.setWritable( false, false );
 
         System.out.println( "file = " + file );
