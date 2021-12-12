diff --git a/drools-core/src/main/java/org/drools/event/rule/impl/ObjectUpdatedEventImpl.java b/drools-core/src/main/java/org/drools/event/rule/impl/ObjectUpdatedEventImpl.java
index 0c27adf..1ea2b88 100644
--- a/drools-core/src/main/java/org/drools/event/rule/impl/ObjectUpdatedEventImpl.java
+++ b/drools-core/src/main/java/org/drools/event/rule/impl/ObjectUpdatedEventImpl.java
@@ -21,7 +21,7 @@
         super( ((InternalWorkingMemory) event.getWorkingMemory() ).getKnowledgeRuntime(), event.getPropagationContext() );
         factHandle = event.getFactHandle();
         object = event.getObject();
-        object = event.getOldObject();
+        oldObject = event.getOldObject();
     }    
     
     public void writeExternal(ObjectOutput out) throws IOException {
