diff --git a/maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java b/maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java
index 9c105a6..6cef960 100644
--- a/maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java
+++ b/maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java
@@ -124,8 +124,8 @@
         }
         else if ( UPDATE_POLICY_DAILY.equals( updatePolicy ) )
         {
-            // Get midnight boundary
-            Calendar cal = Calendar.getInstance( TimeZone.getTimeZone( "UTC" ) );
+            // Get local midnight boundary
+            Calendar cal = Calendar.getInstance();
 
             cal.set( Calendar.HOUR_OF_DAY, 0 );
             cal.set( Calendar.MINUTE, 0 );
