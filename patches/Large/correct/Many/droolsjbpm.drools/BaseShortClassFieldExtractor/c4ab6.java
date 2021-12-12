diff --git a/drools-core/src/main/java/org/drools/base/extractors/BaseShortClassFieldExtractor.java b/drools-core/src/main/java/org/drools/base/extractors/BaseShortClassFieldExtractor.java
index aa24b12..cb330e5 100755
--- a/drools-core/src/main/java/org/drools/base/extractors/BaseShortClassFieldExtractor.java
+++ b/drools-core/src/main/java/org/drools/base/extractors/BaseShortClassFieldExtractor.java
@@ -33,7 +33,7 @@
     }
 
     public Object getValue(InternalWorkingMemory workingMemory, final Object object) {
-        return new Long( getShortValue( workingMemory, object ) );
+        return new Short( getShortValue( workingMemory, object ) );
     }
 
     public boolean getBooleanValue(InternalWorkingMemory workingMemory, final Object object) {
