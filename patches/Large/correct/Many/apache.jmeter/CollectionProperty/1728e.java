diff --git a/src/core/org/apache/jmeter/testelement/property/CollectionProperty.java b/src/core/org/apache/jmeter/testelement/property/CollectionProperty.java
index 386741e..7e68646 100644
--- a/src/core/org/apache/jmeter/testelement/property/CollectionProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/CollectionProperty.java
@@ -131,7 +131,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Object clone() {
+    public CollectionProperty clone() {
         CollectionProperty prop = (CollectionProperty) super.clone();
         prop.value = cloneCollection();
         return prop;
@@ -143,7 +143,7 @@
             Collection<JMeterProperty> newCol = value.getClass().newInstance();
             PropertyIterator iter = iterator();
             while (iter.hasNext()) {
-                newCol.add((JMeterProperty) iter.next().clone());
+                newCol.add(iter.next().clone());
             }
             return newCol;
         } catch (Exception e) {
