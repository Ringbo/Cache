diff --git a/src/core/org/apache/jmeter/testelement/property/MapProperty.java b/src/core/org/apache/jmeter/testelement/property/MapProperty.java
index 396ce3c..96a24d7 100644
--- a/src/core/org/apache/jmeter/testelement/property/MapProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/MapProperty.java
@@ -104,7 +104,7 @@
 
     /** {@inheritDoc} */
     @Override
-    public Object clone() {
+    public MapProperty clone() {
         MapProperty prop = (MapProperty) super.clone();
         prop.value = cloneMap();
         return prop;
@@ -117,7 +117,7 @@
             PropertyIterator iter = valueIterator();
             while (iter.hasNext()) {
                 JMeterProperty item = iter.next();
-                newCol.put(item.getName(), (JMeterProperty) item.clone());
+                newCol.put(item.getName(), item.clone());
             }
             return newCol;
         } catch (Exception e) {
