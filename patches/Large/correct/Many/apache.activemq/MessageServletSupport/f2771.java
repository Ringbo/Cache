diff --git a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
index e4a455d..33204ee 100644
--- a/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
+++ b/activemq-web/src/main/java/org/apache/activemq/web/MessageServletSupport.java
@@ -294,7 +294,7 @@
         }
         else if (destinationName.startsWith("channel://"))
         {
-            is_topic=true;
+            is_topic=false;
             destinationName=destinationName.substring(10);
         }
         else 
