diff --git a/camel-core/src/main/java/org/apache/camel/impl/converter/AsyncProcessorTypeConverter.java b/camel-core/src/main/java/org/apache/camel/impl/converter/AsyncProcessorTypeConverter.java
index 3bb0d40..fe24df7 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/converter/AsyncProcessorTypeConverter.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/converter/AsyncProcessorTypeConverter.java
@@ -45,7 +45,8 @@
             } catch (Throwable e) {
                 exchange.setException(e);
             }
-            callback.done(true);
+            // false means processing of the exchange asynchronously,
+            callback.done(false);
             return true;
         }
 
