diff --git a/src/core/org/apache/jmeter/testelement/property/IntegerProperty.java b/src/core/org/apache/jmeter/testelement/property/IntegerProperty.java
index 13afce8..3a00bda 100644
--- a/src/core/org/apache/jmeter/testelement/property/IntegerProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/IntegerProperty.java
@@ -97,7 +97,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public IntegerProperty clone() {
         IntegerProperty prop = (IntegerProperty) super.clone();
         prop.value = value;
         return prop;
