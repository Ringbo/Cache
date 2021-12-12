diff --git a/src/core/org/apache/jmeter/testelement/property/StringProperty.java b/src/core/org/apache/jmeter/testelement/property/StringProperty.java
index 72962b7..28be08e 100644
--- a/src/core/org/apache/jmeter/testelement/property/StringProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/StringProperty.java
@@ -77,7 +77,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public StringProperty clone() {
         StringProperty prop = (StringProperty) super.clone();
         prop.value = value;
         return prop;
