diff --git a/src/core/org/apache/jmeter/testelement/AbstractTestElement.java b/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
index 3b39a65..e7338ec 100644
--- a/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
+++ b/src/core/org/apache/jmeter/testelement/AbstractTestElement.java
@@ -399,7 +399,7 @@
         PropertyIterator iter = element.propertyIterator();
         while (iter.hasNext()) {
             JMeterProperty prop = iter.next();
-            addProperty(prop, true);
+            addProperty(prop, false);
         }
     }
 
