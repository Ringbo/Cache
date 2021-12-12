diff --git a/advanced/src/test/java/org/neo4j/test/TargetDirectory.java b/advanced/src/test/java/org/neo4j/test/TargetDirectory.java
index c2a29c9..d808800 100644
--- a/advanced/src/test/java/org/neo4j/test/TargetDirectory.java
+++ b/advanced/src/test/java/org/neo4j/test/TargetDirectory.java
@@ -76,7 +76,7 @@
         this.base = base.getAbsoluteFile();
     }
 
-    private void recursiveDelete( File file )
+    public static void recursiveDelete( File file )
     {
         File[] files = file.listFiles();
         if ( files != null ) for ( File each : files )
@@ -89,7 +89,7 @@
         return directory( name, false );
     }
 
-    private File directory( String name, boolean clean )
+    public File directory( String name, boolean clean )
     {
         File dir = new File( base(), name );
         if ( clean && dir.exists() ) recursiveDelete( dir );
