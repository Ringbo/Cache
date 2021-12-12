diff --git a/sandbox/pom-pre-alpha-converter/src/main/java/org/apache/maven/tools/converter/Main.java b/sandbox/pom-pre-alpha-converter/src/main/java/org/apache/maven/tools/converter/Main.java
index d7b7db4..647baa9 100755
--- a/sandbox/pom-pre-alpha-converter/src/main/java/org/apache/maven/tools/converter/Main.java
+++ b/sandbox/pom-pre-alpha-converter/src/main/java/org/apache/maven/tools/converter/Main.java
@@ -431,7 +431,7 @@
 
         org.apache.maven.model.CiManagement newCiManagement = new org.apache.maven.model.CiManagement();
 
-        newCiManagement.setSystem( ciManagement.getNagEmailAddress() );
+        newCiManagement.setSystem( ciManagement.getSystem() );
         newCiManagement.setUrl( ciManagement.getUrl() );
         if ( ciManagement.getNagEmailAddress() != null )
         {
