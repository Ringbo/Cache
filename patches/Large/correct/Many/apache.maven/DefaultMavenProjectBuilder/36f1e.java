diff --git a/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java b/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
index 31cf23a..95f4b74 100644
--- a/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
+++ b/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
@@ -137,7 +137,7 @@
                 previous = current;
             }
 
-            if ( userModelFile != null )
+            if ( userModel != null )
             {
                 modelInheritanceAssembler.assembleModelInheritance( userModel, previous );
 
