diff --git a/camel-core/src/main/java/org/apache/camel/CamelContext.java b/camel-core/src/main/java/org/apache/camel/CamelContext.java
index 501f6da..cb21071 100644
--- a/camel-core/src/main/java/org/apache/camel/CamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/CamelContext.java
@@ -1384,14 +1384,14 @@
      *
      * @return the factory
      */
-    public MessageHistoryFactory getMessageHistoryFactory();
+    MessageHistoryFactory getMessageHistoryFactory();
 
     /**
      * Sets a custom {@link org.apache.camel.spi.MessageHistoryFactory}
      *
      * @param messageHistoryFactory the custom factory
      */
-    public void setMessageHistoryFactory(MessageHistoryFactory messageHistoryFactory);
+    void setMessageHistoryFactory(MessageHistoryFactory messageHistoryFactory);
 
     /**
      * Gets the current {@link Debugger}
