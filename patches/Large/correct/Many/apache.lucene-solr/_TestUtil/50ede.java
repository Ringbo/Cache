diff --git a/lucene/test-framework/src/java/org/apache/lucene/util/_TestUtil.java b/lucene/test-framework/src/java/org/apache/lucene/util/_TestUtil.java
index 1fb842a..bded141 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/util/_TestUtil.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/util/_TestUtil.java
@@ -187,15 +187,15 @@
     ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
     CheckIndex checker = new CheckIndex(dir);
     checker.setCrossCheckTermVectors(crossCheckTermVectors);
-    checker.setInfoStream(new PrintStream(bos), false);
+    checker.setInfoStream(new PrintStream(bos, false, "UTF-8"), false);
     CheckIndex.Status indexStatus = checker.checkIndex(null);
     if (indexStatus == null || indexStatus.clean == false) {
       System.out.println("CheckIndex failed");
-      System.out.println(bos.toString());
+      System.out.println(bos.toString("UTF-8"));
       throw new RuntimeException("CheckIndex failed");
     } else {
       if (LuceneTestCase.INFOSTREAM) {
-        System.out.println(bos.toString());
+        System.out.println(bos.toString("UTF-8"));
       }
       return indexStatus;
     }
