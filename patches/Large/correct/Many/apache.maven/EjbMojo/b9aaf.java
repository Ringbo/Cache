diff --git a/maven-plugins/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/ejb/EjbMojo.java b/maven-plugins/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/ejb/EjbMojo.java
index 57b771f..83fa308 100644
--- a/maven-plugins/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/ejb/EjbMojo.java
+++ b/maven-plugins/maven-ejb-plugin/src/main/java/org/apache/maven/plugin/ejb/EjbMojo.java
@@ -120,7 +120,7 @@
                                                            DEFAULT_EXCLUDES );
 
                 // create archive
-                archiver.createArchive( project, archive );
+                clientArchiver.createArchive( project, archive );
             }
         }
         catch ( Exception e )
