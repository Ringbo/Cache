diff --git a/src/core/org/apache/jmeter/testelement/property/BooleanProperty.java b/src/core/org/apache/jmeter/testelement/property/BooleanProperty.java
index cceabe7..f508daf 100644
--- a/src/core/org/apache/jmeter/testelement/property/BooleanProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/BooleanProperty.java
@@ -62,7 +62,7 @@
     }
 
     @Override
-    public Object clone() {
+    public BooleanProperty clone() {
         BooleanProperty prop = (BooleanProperty) super.clone();
         prop.value = value;
         return prop;
