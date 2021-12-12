diff --git a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXHandbackTest.java b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXHandbackTest.java
index 842b5ff..885358a 100644
--- a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXHandbackTest.java
+++ b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXHandbackTest.java
@@ -59,6 +59,6 @@
     @Override
     protected void initRegistry() {
         super.initRegistry();
-        getRegistry().put("hb", hb);
+        getRegistry().bind("hb", hb);
     }
 }
