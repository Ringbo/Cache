diff --git a/modules/core/src/test/java/org/apache/ignite/marshaller/MarshallerContextSelfTest.java b/modules/core/src/test/java/org/apache/ignite/marshaller/MarshallerContextSelfTest.java
index f61a2aa..8a0ff9a 100644
--- a/modules/core/src/test/java/org/apache/ignite/marshaller/MarshallerContextSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/marshaller/MarshallerContextSelfTest.java
@@ -39,7 +39,7 @@
      * @throws Exception If failed.
      */
     public void testClassName() throws Exception {
-        File workDir = U.resolveWorkDirectory("marshaller", false);
+        File workDir = U.resolveWorkDirectory(U.defaultWorkDirectory(), "marshaller", false);
 
         final MarshallerContextImpl.ContinuousQueryListener queryListener =
                 new MarshallerContextImpl.ContinuousQueryListener(log, workDir);
@@ -67,7 +67,7 @@
      * @throws Exception If failed.
      */
     public void testOnUpdated() throws Exception {
-        File workDir = U.resolveWorkDirectory("marshaller", false);
+        File workDir = U.resolveWorkDirectory(U.defaultWorkDirectory(), "marshaller", false);
 
         final MarshallerContextImpl.ContinuousQueryListener queryListener =
                 new MarshallerContextImpl.ContinuousQueryListener(log, workDir);
