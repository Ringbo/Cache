diff --git a/camel-core/src/main/java/org/apache/camel/component/bean/BeanHolder.java b/camel-core/src/main/java/org/apache/camel/component/bean/BeanHolder.java
index e80a7e0..b1a0741 100644
--- a/camel-core/src/main/java/org/apache/camel/component/bean/BeanHolder.java
+++ b/camel-core/src/main/java/org/apache/camel/component/bean/BeanHolder.java
@@ -25,7 +25,7 @@
  */
 public interface BeanHolder {
 
-    Object getBean() throws Exception;
+    Object getBean() throws NoBeanAvailableException;
 
     Processor getProcessor();
 
