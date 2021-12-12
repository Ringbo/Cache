diff --git a/src/core/org/apache/jmeter/testelement/property/FloatProperty.java b/src/core/org/apache/jmeter/testelement/property/FloatProperty.java
index 0011795..ddafe75 100644
--- a/src/core/org/apache/jmeter/testelement/property/FloatProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/FloatProperty.java
@@ -92,7 +92,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public FloatProperty clone() {
         FloatProperty prop = (FloatProperty) super.clone();
         prop.value = value;
         return prop;
