diff --git a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
index 2c5af04..d236e56 100644
--- a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
+++ b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
@@ -248,7 +248,7 @@
      */
     protected Destination getDestination(WebClient client, HttpServletRequest request) throws JMSException {
         String destinationName = request.getParameter(destinationParameter);
-        if (destinationName == null) {
+        if (destinationName == null  || destinationName.equals("")) {
             if (defaultDestination == null) {
                 return getDestinationFromURI(client, request);
             } else {
