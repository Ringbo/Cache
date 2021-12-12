diff --git a/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubSelectorDelayTest.java b/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubSelectorDelayTest.java
index 1cb0be1..2dbd198 100644
--- a/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubSelectorDelayTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/usecases/DurableSubSelectorDelayTest.java
@@ -76,11 +76,11 @@
         TimeUnit.MINUTES.sleep(2);
 
         final KahaDBPersistenceAdapter pa = (KahaDBPersistenceAdapter) broker.getPersistenceAdapter();
-        assertTrue("only one journal file should be left ", Wait.waitFor(new Wait.Condition() {
+        assertTrue("only two journal files should be left ", Wait.waitFor(new Wait.Condition() {
 
             @Override
             public boolean isSatisified() throws Exception {
-                return pa.getStore().getJournal().getFileMap().size() == 1;
+                return pa.getStore().getJournal().getFileMap().size() == 2;
             }
         }, TimeUnit.MINUTES.toMillis(2)));
 
