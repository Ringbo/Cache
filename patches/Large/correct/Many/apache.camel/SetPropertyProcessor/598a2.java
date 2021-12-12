diff --git a/camel-core/src/main/java/org/apache/camel/processor/SetPropertyProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/SetPropertyProcessor.java
index 1276108..70d1a60 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/SetPropertyProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/SetPropertyProcessor.java
@@ -54,7 +54,7 @@
             }
 
             exchange.setProperty(propertyName, newProperty);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             exchange.setException(e);
         }
 
