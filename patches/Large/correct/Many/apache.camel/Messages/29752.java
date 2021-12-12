diff --git a/tests/camel-itest-activemq-highvolume/src/main/java/org/apache/camel/itest/highvolume/Messages.java b/tests/camel-itest-activemq-highvolume/src/main/java/org/apache/camel/itest/highvolume/Messages.java
index 7f14b6b..ad0af01 100644
--- a/tests/camel-itest-activemq-highvolume/src/main/java/org/apache/camel/itest/highvolume/Messages.java
+++ b/tests/camel-itest-activemq-highvolume/src/main/java/org/apache/camel/itest/highvolume/Messages.java
@@ -25,7 +25,7 @@
     
     public void generate(Exchange exchange) {
      	StringBuilder messages = new StringBuilder();
-        for (int i = 1; i < 1000; i++) {
+        for (int i = 1; i < 10000; i++) {
         	messages.append("Test Message: " + i + ",");
         }
         template.sendBody(messages.toString());
