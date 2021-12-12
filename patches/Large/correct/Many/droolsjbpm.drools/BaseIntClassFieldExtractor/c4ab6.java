diff --git a/drools-core/src/main/java/org/drools/base/extractors/BaseIntClassFieldExtractor.java b/drools-core/src/main/java/org/drools/base/extractors/BaseIntClassFieldExtractor.java
index 8824814..3c5a164 100755
--- a/drools-core/src/main/java/org/drools/base/extractors/BaseIntClassFieldExtractor.java
+++ b/drools-core/src/main/java/org/drools/base/extractors/BaseIntClassFieldExtractor.java
@@ -33,7 +33,7 @@
     }
 
     public Object getValue(InternalWorkingMemory workingMemory, final Object object) {
-        return new Long( getIntValue( workingMemory, object ) );
+        return new Integer( getIntValue( workingMemory, object ) );
     }
 
     public boolean getBooleanValue(InternalWorkingMemory workingMemory, final Object object) {
