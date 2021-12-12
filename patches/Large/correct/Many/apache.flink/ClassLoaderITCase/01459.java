diff --git a/flink-tests/src/test/java/org/apache/flink/test/classloading/ClassLoaderITCase.java b/flink-tests/src/test/java/org/apache/flink/test/classloading/ClassLoaderITCase.java
index c7050e5..ca69e80 100644
--- a/flink-tests/src/test/java/org/apache/flink/test/classloading/ClassLoaderITCase.java
+++ b/flink-tests/src/test/java/org/apache/flink/test/classloading/ClassLoaderITCase.java
@@ -312,7 +312,7 @@
 			}
 		}
 
-		assertNotNull(savepointPath, "Failed to trigger savepoint");
+		assertNotNull("Failed to trigger savepoint", savepointPath);
 
 		// Upload JAR
 		LOG.info("Uploading JAR " + CUSTOM_KV_STATE_JAR_PATH + " for savepoint disposal.");
