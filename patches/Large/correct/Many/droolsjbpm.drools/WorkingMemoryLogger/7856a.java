diff --git a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
index a1dc369..2aec006 100644
--- a/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
+++ b/drools-core/src/main/java/org/drools/audit/WorkingMemoryLogger.java
@@ -134,7 +134,7 @@
         if (session instanceof StatefulKnowledgeSessionImpl) {
             WorkingMemoryEventManager eventManager = ((StatefulKnowledgeSessionImpl) session).session;
             eventManager.addEventListener( (WorkingMemoryEventListener) this );
-            eventManager.addEventListener( (RuleBaseEventListener) this );
+            eventManager.addEventListener( (AgendaEventListener) this );
             eventManager.addEventListener( (RuleBaseEventListener) this );
             InternalProcessRuntime processRuntime = ((StatefulKnowledgeSessionImpl) session).session.getProcessRuntime();
             if (processRuntime != null) {
