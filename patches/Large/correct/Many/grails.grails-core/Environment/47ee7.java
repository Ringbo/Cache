diff --git a/grails-bootstrap/src/main/groovy/grails/util/Environment.java b/grails-bootstrap/src/main/groovy/grails/util/Environment.java
index 8a659b2..aa66ced 100644
--- a/grails-bootstrap/src/main/groovy/grails/util/Environment.java
+++ b/grails-bootstrap/src/main/groovy/grails/util/Environment.java
@@ -146,7 +146,7 @@
      * @return True if is
      */
     public static boolean isWithinShell() {
-        return DefaultGroovyMethods.getRootLoader(Environment.class.getClassLoader()) == null;
+        return DefaultGroovyMethods.getRootLoader(Environment.class.getClassLoader()) != null;
     }
 
     /**
