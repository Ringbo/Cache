diff --git a/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java b/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
index 40ab5f9..1002274 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
@@ -130,7 +130,7 @@
                 }
 
                 ExchangeHelper.copyResults(original, nextExchange);
-                callback.done(true);
+                callback.done(false);
             }
         });
     }
