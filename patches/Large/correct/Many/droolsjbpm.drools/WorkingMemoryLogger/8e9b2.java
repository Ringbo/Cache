diff --git a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
index 8f7ed0f..71cf783 100644
--- a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
+++ b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
@@ -278,7 +278,7 @@
                     // This handle is now invalid, probably due to an fact retraction
                     continue;
                 }
-                final Object value = declaration.getValue( (InternalWorkingMemory) workingMemory, workingMemory.getObject( handle ) );
+                final Object value = declaration.getValue( (InternalWorkingMemory) workingMemory, handleImpl.getObject() );
 
                 result.append( declaration.getIdentifier() );
                 result.append( "=" );
