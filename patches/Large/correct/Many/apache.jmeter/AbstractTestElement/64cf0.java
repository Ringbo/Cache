diff --git a/src/core/org/apache/jmeter/testelement/AbstractTestElement.java b/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
index e7338ec..3b39a65 100644
--- a/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
+++ b/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
@@ -399,7 +399,7 @@
         PropertyIterator iter = element.propertyIterator();
         while (iter.hasNext()) {
             JMeterProperty prop = iter.next();
-            addProperty(prop, false);
+            addProperty(prop, true);
         }
     }
 
