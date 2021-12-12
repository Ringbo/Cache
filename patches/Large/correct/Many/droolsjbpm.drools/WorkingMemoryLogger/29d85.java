diff --git a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
index c274e42..a2759b8 100644
--- a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
+++ b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
@@ -264,7 +264,7 @@
                     // This handle is now invalid, probably due to an fact retraction
                     continue;
                 }
-                final Object value = declaration.getValue( (InternalWorkingMemory) workingMemory, workingMemory.getObject( handle ) );
+                final Object value = declaration.getValue( (InternalWorkingMemory) workingMemory, handleImpl.getObject() );
 
                 result.append( declaration.getIdentifier() );
                 result.append( "=" );
