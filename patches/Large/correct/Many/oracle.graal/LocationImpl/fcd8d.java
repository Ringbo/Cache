diff --git a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LocationImpl.java b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LocationImpl.java
index c46ac41..c98ad00 100644
--- a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LocationImpl.java
+++ b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LocationImpl.java
@@ -73,12 +73,12 @@
     protected abstract void setInternal(DynamicObject store, Object value) throws IncompatibleLocationException;
 
     @Override
-    public final boolean canSet(DynamicObject store, Object value) {
+    public boolean canSet(DynamicObject store, Object value) {
         return canStore(value) && canStoreFinal(store, value);
     }
 
     @Override
-    public final boolean canSet(Object value) {
+    public boolean canSet(Object value) {
         return canSet(null, value);
     }
 
