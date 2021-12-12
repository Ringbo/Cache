diff --git a/src/core/org/apache/jmeter/testelement/property/ObjectProperty.java b/src/core/org/apache/jmeter/testelement/property/ObjectProperty.java
index 22afe9e..056e8a9 100644
--- a/src/core/org/apache/jmeter/testelement/property/ObjectProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/ObjectProperty.java
@@ -56,7 +56,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public ObjectProperty clone() {
         ObjectProperty p = (ObjectProperty) super.clone();
         p.value = value;
         return p;
