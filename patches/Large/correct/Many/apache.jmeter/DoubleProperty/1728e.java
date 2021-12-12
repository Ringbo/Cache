diff --git a/src/core/org/apache/jmeter/testelement/property/DoubleProperty.java b/src/core/org/apache/jmeter/testelement/property/DoubleProperty.java
index 42958b7..b39ef8e 100644
--- a/src/core/org/apache/jmeter/testelement/property/DoubleProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/DoubleProperty.java
@@ -76,7 +76,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public DoubleProperty clone() {
         DoubleProperty prop = (DoubleProperty) super.clone();
         prop.value = value;
         return prop;
