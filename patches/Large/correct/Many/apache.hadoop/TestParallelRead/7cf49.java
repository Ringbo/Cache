diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestParallelRead.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestParallelRead.java
index eb37422..c5aec72 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestParallelRead.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestParallelRead.java
@@ -109,11 +109,11 @@
             pRead(startOff, len);
             bytesRead += len;
           }
-        } catch (Exception ex) {
+        } catch (Throwable t) {
           LOG.error(getName() + ": Error while testing read at " + startOff +
                     " length " + len);
           error = true;
-          fail(ex.getMessage());
+          fail(t.getMessage());
         }
       }
     }
@@ -135,8 +135,8 @@
      */
     private void read(int start, int len) throws Exception {
       assertTrue(
-          "Bad args: " + start + " + " + len + " should be < " + fileSize,
-          start + len < fileSize);
+          "Bad args: " + start + " + " + len + " should be <= " + fileSize,
+          start + len <= fileSize);
       DFSInputStream dis = testInfo.dis;
 
       synchronized (dis) {
