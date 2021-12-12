diff --git a/drools-core/src/main/java/org/drools/base/extractors/BaseByteClassFieldExtractor.java b/drools-core/src/main/java/org/drools/base/extractors/BaseByteClassFieldExtractor.java
index b9346e6..74d41d8 100755
--- a/drools-core/src/main/java/org/drools/base/extractors/BaseByteClassFieldExtractor.java
+++ b/drools-core/src/main/java/org/drools/base/extractors/BaseByteClassFieldExtractor.java
@@ -55,7 +55,7 @@
     }
 
     public Object getValue(InternalWorkingMemory workingMemory, final Object object) {
-        return new Long( getByteValue( workingMemory, object ) );
+        return new Byte( getByteValue( workingMemory, object ) );
     }
 
     public boolean getBooleanValue(InternalWorkingMemory workingMemory, final Object object) {
