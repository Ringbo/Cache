diff --git a/src/core/org/apache/jmeter/testelement/property/TestElementProperty.java b/src/core/org/apache/jmeter/testelement/property/TestElementProperty.java
index b914fb5..f390ea7 100644
--- a/src/core/org/apache/jmeter/testelement/property/TestElementProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/TestElementProperty.java
@@ -95,7 +95,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public TestElementProperty clone() {
         TestElementProperty prop = (TestElementProperty) super.clone();
         prop.value = (TestElement) value.clone();
         return prop;
