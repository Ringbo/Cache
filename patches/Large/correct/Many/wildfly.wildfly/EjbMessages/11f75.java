diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/EjbMessages.java b/ejb3/src/main/java/org/jboss/as/ejb3/EjbMessages.java
index 59864a8..7d3649f 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/EjbMessages.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/EjbMessages.java
@@ -1978,6 +1978,6 @@
      * Exception thrown if the session-type of a session bean is not specified
      */
     @Message(id=14551, value = "<session-type> not specified for ejb %s. This must be present in ejb-jar.xml")
-    IllegalStateException sessionTypeNotSpecified(String bean);
+    DeploymentUnitProcessingException sessionTypeNotSpecified(String bean);
 
 }
\ No newline at end of file
