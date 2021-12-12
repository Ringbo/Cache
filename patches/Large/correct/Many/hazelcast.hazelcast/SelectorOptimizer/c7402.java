diff --git a/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/SelectorOptimizer.java b/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/SelectorOptimizer.java
index 255bbae..ec2f270 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/SelectorOptimizer.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/SelectorOptimizer.java
@@ -70,7 +70,7 @@
             selectedKeysField.set(selector, set);
             publicSelectedKeysField.set(selector, set);
 
-            logger.info("Optimized Selector: " + selector.getClass().getName());
+            logger.finest("Optimized Selector: " + selector.getClass().getName());
             return set;
         } catch (Throwable t) {
             // we don't want to print at warning level because it could very well be that the target JVM doesn't
