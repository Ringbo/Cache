diff --git a/src/core/org/apache/jmeter/testelement/property/FunctionProperty.java b/src/core/org/apache/jmeter/testelement/property/FunctionProperty.java
index ccf9300..1e62d8d 100644
--- a/src/core/org/apache/jmeter/testelement/property/FunctionProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/FunctionProperty.java
@@ -110,7 +110,7 @@
     }
 
     @Override
-    public Object clone() {
+    public FunctionProperty clone() {
         FunctionProperty prop = (FunctionProperty) super.clone();
         prop.cacheValue = cacheValue;
         prop.testIteration = testIteration;
