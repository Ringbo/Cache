diff --git a/src/core/org/apache/jmeter/testelement/property/LongProperty.java b/src/core/org/apache/jmeter/testelement/property/LongProperty.java
index af3d6cf..bc5268a 100644
--- a/src/core/org/apache/jmeter/testelement/property/LongProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/LongProperty.java
@@ -93,7 +93,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public LongProperty clone() {
         LongProperty prop = (LongProperty) super.clone();
         prop.value = value;
         return prop;
