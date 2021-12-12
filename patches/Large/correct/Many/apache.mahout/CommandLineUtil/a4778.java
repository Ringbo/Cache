diff --git a/core/src/main/java/org/apache/mahout/common/CommandLineUtil.java b/core/src/main/java/org/apache/mahout/common/CommandLineUtil.java
index 4f22556..fb0c818 100644
--- a/core/src/main/java/org/apache/mahout/common/CommandLineUtil.java
+++ b/core/src/main/java/org/apache/mahout/common/CommandLineUtil.java
@@ -73,7 +73,7 @@
     formatter.setGroup(group);
     formatter.setPrintWriter(pw);
     formatter.setException(oe);
-    formatter.printHelp();
+    formatter.print();
     pw.flush();
   }
 
