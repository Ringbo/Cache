diff --git a/camel-core/src/main/java/org/apache/camel/api/management/mbean/ManagedBacklogDebuggerMBean.java b/camel-core/src/main/java/org/apache/camel/api/management/mbean/ManagedBacklogDebuggerMBean.java
index 0d938d1..5e0370e 100644
--- a/camel-core/src/main/java/org/apache/camel/api/management/mbean/ManagedBacklogDebuggerMBean.java
+++ b/camel-core/src/main/java/org/apache/camel/api/management/mbean/ManagedBacklogDebuggerMBean.java
@@ -75,9 +75,9 @@
     String dumpTracedMessagesAsXml(String nodeId);
 
     @ManagedAttribute(description = "Number of total debugged messages")
-    public long getDebugCounter();
+    long getDebugCounter();
 
     @ManagedOperation(description = "Resets the debug counter")
-    public void resetDebugCounter();
+    void resetDebugCounter();
 
 }
