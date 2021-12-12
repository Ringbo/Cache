diff --git a/src/main/java/co/paralleluniverse/fibers/instrument/JavaAgent.java b/src/main/java/co/paralleluniverse/fibers/instrument/JavaAgent.java
index dad81f0..f55ff1b 100644
--- a/src/main/java/co/paralleluniverse/fibers/instrument/JavaAgent.java
+++ b/src/main/java/co/paralleluniverse/fibers/instrument/JavaAgent.java
@@ -180,7 +180,7 @@
                 return null;
             if (className.startsWith("org/objectweb/asm/"))
                 return null;
-            if (className.startsWith(Classes.COROUTINE_NAME))
+            if (className.equals(Classes.COROUTINE_NAME))
                 return null;
 
             db.log(LogLevel.INFO, "TRANSFORM: %s %s", className, (db.getClassEntry(className) != null && db.getClassEntry(className).requiresInstrumentation()) ? "request" : "");
