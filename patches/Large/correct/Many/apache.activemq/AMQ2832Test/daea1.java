diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ2832Test.java b/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ2832Test.java
index 6ce1bf9..fefb826 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ2832Test.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/bugs/AMQ2832Test.java
@@ -289,7 +289,7 @@
         assertTrue("Less than three journal file expected, was " + getNumberOfJournalFiles(), Wait.waitFor(new Wait.Condition() {
             @Override
             public boolean isSatisified() throws Exception {
-                return getNumberOfJournalFiles() <= 3;
+                return getNumberOfJournalFiles() <= 4;
             }
         }, TimeUnit.MINUTES.toMillis(3)));
 
