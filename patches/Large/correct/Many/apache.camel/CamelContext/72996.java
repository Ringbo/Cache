diff --git a/camel-core/src/main/java/org/apache/camel/CamelContext.java b/camel-core/src/main/java/org/apache/camel/CamelContext.java
index 8a3c31b..022ae36 100644
--- a/camel-core/src/main/java/org/apache/camel/CamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/CamelContext.java
@@ -235,7 +235,7 @@
      * @param type the class type
      * @return the service instance or <tt>null</tt> if not already added.
      */
-    public <T> T hasService(Class<T> type);
+    <T> T hasService(Class<T> type);
 
     /**
      * Adds the given listener to be invoked when {@link CamelContext} have just been started.
