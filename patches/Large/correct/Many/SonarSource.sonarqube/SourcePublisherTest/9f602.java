diff --git a/sonar-batch/src/test/java/org/sonar/batch/report/SourcePublisherTest.java b/sonar-batch/src/test/java/org/sonar/batch/report/SourcePublisherTest.java
index 824a6da..e9b379a 100644
--- a/sonar-batch/src/test/java/org/sonar/batch/report/SourcePublisherTest.java
+++ b/sonar-batch/src/test/java/org/sonar/batch/report/SourcePublisherTest.java
@@ -68,7 +68,7 @@
 
     publisher.publish(writer);
 
-    File out = writer.getSourceFile(1);
+    File out = writer.getSourceFile(2);
     assertThat(FileUtils.readFileToString(out, Charsets.UTF_8)).isEqualTo("");
   }
 
@@ -78,7 +78,7 @@
 
     publisher.publish(writer);
 
-    File out = writer.getSourceFile(1);
+    File out = writer.getSourceFile(2);
     assertThat(FileUtils.readFileToString(out, Charsets.UTF_8)).isEqualTo("1\n2\n3\n4\n");
   }
 
@@ -88,7 +88,7 @@
 
     publisher.publish(writer);
 
-    File out = writer.getSourceFile(1);
+    File out = writer.getSourceFile(2);
     assertThat(FileUtils.readFileToString(out, Charsets.UTF_8)).isEqualTo("1\n2\n3\n4\n5");
   }
 
@@ -98,7 +98,7 @@
 
     publisher.publish(writer);
 
-    File out = writer.getSourceFile(1);
+    File out = writer.getSourceFile(2);
     assertThat(FileUtils.readFileToString(out, Charsets.UTF_8)).isEqualTo("\n2\n3\n4\n5");
   }
 }
