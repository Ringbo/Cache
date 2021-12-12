diff --git a/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java b/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java
index 730e19f..0fe4f54 100644
--- a/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java
+++ b/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java
@@ -1120,7 +1120,7 @@
             }
 
             if (failOnError) {
-                log.info(message);
+                log.error(message);
                 throw new BuildException("Compilation Failed", t, getLocation());
             } else {
                 log.error(message);
