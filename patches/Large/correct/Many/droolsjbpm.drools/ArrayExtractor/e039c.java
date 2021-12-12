diff --git a/drools-core/src/main/java/org/drools/base/extractors/ArrayExtractor.java b/drools-core/src/main/java/org/drools/base/extractors/ArrayExtractor.java
index 3f07e64..937043d 100644
--- a/drools-core/src/main/java/org/drools/base/extractors/ArrayExtractor.java
+++ b/drools-core/src/main/java/org/drools/base/extractors/ArrayExtractor.java
@@ -32,7 +32,7 @@
     }
     public byte getByteValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Byte)array[ this.index ]).byteValue();
+        return ( (Number)array[ this.index ]).byteValue();
     }
     public char getCharValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
@@ -40,28 +40,28 @@
     }
     public double getDoubleValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Double)array[ this.index ]).doubleValue();
+        return ( (Number)array[ this.index ]).doubleValue();
     }
 
     public float getFloatValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Float)array[ this.index ]).floatValue();
+        return ( (Number)array[ this.index ]).floatValue();
     }
 
     public int getIntValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Integer)array[ this.index ]).intValue();
+        return ( (Number)array[ this.index ]).intValue();
     }
     public long getLongValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Long) array[ this.index ]).longValue();
+        return ( (Number) array[ this.index ]).longValue();
     }
     public Method getNativeReadMethod() {
         throw new UnsupportedOperationException("cannot call a method on an array extractor" );
     }
     public short getShortValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
-        return ( (Short)array[ this.index ]).shortValue();
+        return ( (Number)array[ this.index ]).shortValue();
     }
     public Object getValue(InternalWorkingMemory workingMemory, Object object) {
         Object[] array = ( Object[] ) this.arrayExtractor.getValue( workingMemory, object );
