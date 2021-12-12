diff --git a/maven-project/src/main/java/org/apache/maven/project/builder/impl/DefaultProjectBuilder.java b/maven-project/src/main/java/org/apache/maven/project/builder/impl/DefaultProjectBuilder.java
index 557fb85..8dde316 100644
--- a/maven-project/src/main/java/org/apache/maven/project/builder/impl/DefaultProjectBuilder.java
+++ b/maven-project/src/main/java/org/apache/maven/project/builder/impl/DefaultProjectBuilder.java
@@ -220,7 +220,7 @@
                 f = new File( f, "pom.xml" );
             }
             
-            return f.exists();
+            return f.isFile();
         }
         catch ( IOException e )
         {
@@ -290,7 +290,7 @@
             parentFile = new File( parentFile.getAbsolutePath(), "pom.xml" );
         }
 
-        if ( !parentFile.exists() )
+        if ( !parentFile.isFile() )
         {
             throw new IOException( "File does not exist: File = " + parentFile.getAbsolutePath() );
         }
