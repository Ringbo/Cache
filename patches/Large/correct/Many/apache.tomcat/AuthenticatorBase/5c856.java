diff --git a/java/org/apache/catalina/authenticator/AuthenticatorBase.java b/java/org/apache/catalina/authenticator/AuthenticatorBase.java
index 8f33ce2..1d87d3a 100644
--- a/java/org/apache/catalina/authenticator/AuthenticatorBase.java
+++ b/java/org/apache/catalina/authenticator/AuthenticatorBase.java
@@ -482,7 +482,7 @@
         // The Servlet may specify security constraints through annotations.
         // Ensure that they have been processed before constraints are checked
         Wrapper wrapper = (Wrapper) request.getMappingData().wrapper; 
-        if (wrapper.getServlet() != null) {
+        if (wrapper.getServlet() == null) {
             wrapper.load();
         }
 
