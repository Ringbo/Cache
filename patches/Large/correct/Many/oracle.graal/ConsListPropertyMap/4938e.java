diff --git a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/ConsListPropertyMap.java b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/ConsListPropertyMap.java
index 0490780..6359d50 100644
--- a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/ConsListPropertyMap.java
+++ b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/ConsListPropertyMap.java
@@ -284,7 +284,7 @@
     private static final class MapEntryImpl implements Map.Entry<Object, Property> {
         private final Property backingProperty;
 
-        public MapEntryImpl(Property backingProperty) {
+        MapEntryImpl(Property backingProperty) {
             this.backingProperty = backingProperty;
         }
 
