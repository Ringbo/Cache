diff --git a/retrolambda-maven-plugin/src/main/java/net/orfjackal/retrolambda/maven/ProcessClassesMojo.java b/retrolambda-maven-plugin/src/main/java/net/orfjackal/retrolambda/maven/ProcessClassesMojo.java
index 304e8b8..6801a3a 100644
--- a/retrolambda-maven-plugin/src/main/java/net/orfjackal/retrolambda/maven/ProcessClassesMojo.java
+++ b/retrolambda-maven-plugin/src/main/java/net/orfjackal/retrolambda/maven/ProcessClassesMojo.java
@@ -103,7 +103,7 @@
 
     private void validateTarget() throws MojoExecutionException {
         if (!targetBytecodeVersions.containsKey(target)) {
-            String possibleValues = Joiner.on(", ").join(new ArrayList<String>(targetBytecodeVersions.keySet()));
+            String possibleValues = Joiner.on(", ").join(new TreeSet<String>(targetBytecodeVersions.keySet()));
             throw new MojoExecutionException(
                     "Unrecognized target '" + target + "'. Possible values are " + possibleValues);
         }
