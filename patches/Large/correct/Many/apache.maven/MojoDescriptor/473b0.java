diff --git a/maven-plugin-descriptor/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java b/maven-plugin-descriptor/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java
index 0f0af89..f7718a8 100755
--- a/maven-plugin-descriptor/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java
+++ b/maven-plugin-descriptor/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java
@@ -149,7 +149,7 @@
         {
             parameterMap = new HashMap();
 
-            if ( parameters == null )
+            if ( parameters != null )
             {
                 for ( Iterator iterator = parameters.iterator(); iterator.hasNext(); )
                 {
