diff --git a/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubProcessMultiRestartTest.java b/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubProcessMultiRestartTest.java
index 27e48fd..c4077be 100644
--- a/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubProcessMultiRestartTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubProcessMultiRestartTest.java
@@ -114,12 +114,12 @@
         assertTrue("no exceptions: " + exceptions, exceptions.isEmpty());
 
         final KahaDBPersistenceAdapter pa = (KahaDBPersistenceAdapter) broker.getPersistenceAdapter();
-        assertTrue("only one journal file should be left: " + pa.getStore().getJournal().getFileMap().size(),
+        assertTrue("only two journal files should be left: " + pa.getStore().getJournal().getFileMap().size(),
             Wait.waitFor(new Wait.Condition() {
 
                 @Override
                 public boolean isSatisified() throws Exception {
-                    return pa.getStore().getJournal().getFileMap().size() == 1;
+                    return pa.getStore().getJournal().getFileMap().size() == 2;
                 }
             }, TimeUnit.MINUTES.toMillis(3))
         );
