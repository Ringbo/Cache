diff --git a/fabric-core/src/main/scala/org/fusesource/fabric/internal/AgentImpl.java b/fabric-core/src/main/scala/org/fusesource/fabric/internal/AgentImpl.java
index a1c4896..7e60b39 100644
--- a/fabric-core/src/main/scala/org/fusesource/fabric/internal/AgentImpl.java
+++ b/fabric-core/src/main/scala/org/fusesource/fabric/internal/AgentImpl.java
@@ -47,7 +47,7 @@
         this.parent = parent;
         this.id = id;
         this.service = service;
-        this.agentTemplate = new AgentTemplate(parent, true);
+        this.agentTemplate = new AgentTemplate(this, true);
     }
 
     public Agent getParent() {
