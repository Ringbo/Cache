diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
index 4271a73..66a63c8 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
@@ -323,7 +323,7 @@
     if (intp == null) {
       throw new InterpreterException("Interpreter " + p.getRequiredReplName() + " not found");
     }
-    if ((Boolean) p.getConfig().get("enabled")) {
+    if (p.getConfig().get("enabled") == null || (Boolean) p.getConfig().get("enabled")) {
       intp.getScheduler().submit(p);
     }
   }
