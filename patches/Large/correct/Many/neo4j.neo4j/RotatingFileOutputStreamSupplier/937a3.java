diff --git a/community/logging/src/main/java/org/neo4j/logging/RotatingFileOutputStreamSupplier.java b/community/logging/src/main/java/org/neo4j/logging/RotatingFileOutputStreamSupplier.java
index da24e10..83019c2 100644
--- a/community/logging/src/main/java/org/neo4j/logging/RotatingFileOutputStreamSupplier.java
+++ b/community/logging/src/main/java/org/neo4j/logging/RotatingFileOutputStreamSupplier.java
@@ -197,7 +197,7 @@
                 if ( fileSystem.fileExists( outputFile ) )
                 {
                     shiftArchivedOutputFiles();
-                    fileSystem.move( outputFile, archivedOutputFile( 1 ) );
+                    fileSystem.renameFile( outputFile, archivedOutputFile( 1 ) );
                 }
                 newStream = openOutputFile();
             }
@@ -252,7 +252,7 @@
                 fileSystem.deleteFile( archive );
             } else
             {
-                fileSystem.move( archive, archivedOutputFile( i + 1 ) );
+                fileSystem.renameFile( archive, archivedOutputFile( i + 1 ) );
             }
         }
     }
