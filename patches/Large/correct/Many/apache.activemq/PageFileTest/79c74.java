diff --git a/activemq-kahadb-store/src/test/java/org/apache/activemq/store/kahadb/disk/page/PageFileTest.java b/activemq-kahadb-store/src/test/java/org/apache/activemq/store/kahadb/disk/page/PageFileTest.java
index 72e8d7b..0f919f2 100644
--- a/activemq-kahadb-store/src/test/java/org/apache/activemq/store/kahadb/disk/page/PageFileTest.java
+++ b/activemq-kahadb-store/src/test/java/org/apache/activemq/store/kahadb/disk/page/PageFileTest.java
@@ -221,7 +221,7 @@
 
         //Load a second instance on the same directory fo the page file which
         //simulates an unclean shutdown from the previous run
-        PageFile pf2 = new PageFile(new File("target/test-data"), getName());
+        final PageFile pf2 = new PageFile(new File("target/test-data"), getName());
         pf2.setEnableRecoveryFile(false);
         pf2.load();
         try {
