diff --git a/jOOQ-test/src/org/jooq/test/jOOQAbstractTest.java b/jOOQ-test/src/org/jooq/test/jOOQAbstractTest.java
index e1bc6d9..47f8797 100644
--- a/jOOQ-test/src/org/jooq/test/jOOQAbstractTest.java
+++ b/jOOQ-test/src/org/jooq/test/jOOQAbstractTest.java
@@ -427,7 +427,7 @@
                 try {
                     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                     Debugger debugger = new ClientDebugger("127.0.0.1", DEBUGGER_PORT);
-                    Console console = new Console(debugger, true);
+                    Console console = new Console(debugger, true, true);
                     console.setLoggingActive(true);
                     console.setVisible(true);
                 }
