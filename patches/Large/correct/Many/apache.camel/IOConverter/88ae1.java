diff --git a/camel-core/src/main/java/org/apache/camel/converter/IOConverter.java b/camel-core/src/main/java/org/apache/camel/converter/IOConverter.java
index 958547a..ebc6dd1 100644
--- a/camel-core/src/main/java/org/apache/camel/converter/IOConverter.java
+++ b/camel-core/src/main/java/org/apache/camel/converter/IOConverter.java
@@ -376,7 +376,7 @@
      */
     @Deprecated
     public static String getCharsetName(Exchange exchange, boolean useDefault) {
-        return IOHelper.getCharsetName(exchange);
+        return IOHelper.getCharsetName(exchange, useDefault);
     }
 
     /**
