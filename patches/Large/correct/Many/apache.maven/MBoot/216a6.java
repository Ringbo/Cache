diff --git a/maven-mboot2/src/main/java/MBoot.java b/maven-mboot2/src/main/java/MBoot.java
index 1a9d4a5..ce43983 100644
--- a/maven-mboot2/src/main/java/MBoot.java
+++ b/maven-mboot2/src/main/java/MBoot.java
@@ -152,7 +152,7 @@
 
             Profile activeProfile = userModelReader.getActiveProfile();
 
-            if ( mavenRepoLocal == null )
+            if ( mavenRepoLocal == null && activeProfile != null )
             {
                 mavenRepoLocal = new File( activeProfile.getLocalRepo() ).getAbsolutePath();
             }
