diff --git a/core/camel-core/src/main/java/org/apache/camel/processor/ThrowExceptionProcessor.java b/core/camel-core/src/main/java/org/apache/camel/processor/ThrowExceptionProcessor.java
index 0d5e16d..ba5ddc7 100644
--- a/core/camel-core/src/main/java/org/apache/camel/processor/ThrowExceptionProcessor.java
+++ b/core/camel-core/src/main/java/org/apache/camel/processor/ThrowExceptionProcessor.java
@@ -58,7 +58,7 @@
                 // create the message using simple language so it can be dynamic
                 String text = simple.evaluate(exchange, String.class);
                 // create a new exception of that type, and provide the message as
-                Constructor<?> constructor = type.getDeclaredConstructor(String.class);
+                Constructor<?> constructor = type.getConstructor(String.class);
                 cause = (Exception) constructor.newInstance(text);
                 exchange.setException(cause);
             } else if (cause == null && type != null) {
