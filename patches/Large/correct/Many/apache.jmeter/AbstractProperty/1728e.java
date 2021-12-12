diff --git a/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java b/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
index 9e53786..1c56183 100644
--- a/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
@@ -86,7 +86,7 @@
 
     /** {@inheritDoc} */
     @Override
-    public Object clone() {
+    public AbstractProperty clone() {
         try {
             AbstractProperty prop = (AbstractProperty) super.clone();
             prop.name = name;
