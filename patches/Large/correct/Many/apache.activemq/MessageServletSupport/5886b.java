diff --git a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
index f59813c..5b07102 100644
--- a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
+++ b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
@@ -127,7 +127,7 @@
             message.setJMSReplyTo(replyTo);
         }
         String type = (String)asString(parameters.remove("JMSType"));
-        if (correlationID != null) {
+        if (type != null) {
             message.setJMSType(type);
         }
 
