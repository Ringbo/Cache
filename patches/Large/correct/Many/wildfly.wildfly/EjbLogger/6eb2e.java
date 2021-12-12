diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/EjbLogger.java b/ejb3/src/main/java/org/jboss/as/ejb3/EjbLogger.java
index 08505d5..3fb5a53 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/EjbLogger.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/EjbLogger.java
@@ -480,7 +480,7 @@
     void failedToCreateOptionForProperty(String propertyName, String reason);
 
     @Message(id = 14151, value = "Could not find view %s for EJB %s")
-    RuntimeException viewNotFound(String viewClass, String ejbName);
+    IllegalStateException viewNotFound(String viewClass, String ejbName);
 
     @Message(id = 14152, value = "Cannot perform asynchronous local invocation for component that is not a session bean")
     RuntimeException asyncInvocationOnlyApplicableForSessionBeans();
