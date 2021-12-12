diff --git a/src/main/java/com/gitblit/utils/CompressionUtils.java b/src/main/java/com/gitblit/utils/CompressionUtils.java
index d4bfbb3..b06edd2 100644
--- a/src/main/java/com/gitblit/utils/CompressionUtils.java
+++ b/src/main/java/com/gitblit/utils/CompressionUtils.java
@@ -132,7 +132,7 @@
 		} catch (IOException e) {
 			error(e, repository, "{0} failed to zip files from commit {1}", commit.getName());
 		} finally {
-			tw.release();
+			tw.close();
 			rw.dispose();
 		}
 		return success;
@@ -291,7 +291,7 @@
 		} catch (IOException e) {
 			error(e, repository, "{0} failed to {1} stream files from commit {2}", algorithm, commit.getName());
 		} finally {
-			tw.release();
+			tw.close();
 			rw.dispose();
 		}
 		return success;
