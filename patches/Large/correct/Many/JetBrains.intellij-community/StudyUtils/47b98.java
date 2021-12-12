diff --git a/python/edu/learn-python/src/com/jetbrains/python/edu/StudyUtils.java b/python/edu/learn-python/src/com/jetbrains/python/edu/StudyUtils.java
index 90afbc2..5d9bb13 100644
--- a/python/edu/learn-python/src/com/jetbrains/python/edu/StudyUtils.java
+++ b/python/edu/learn-python/src/com/jetbrains/python/edu/StudyUtils.java
@@ -71,7 +71,7 @@
       return wrapHTML ? UIUtil.toHtml(taskText.toString()) : taskText.toString();
     }
     catch (IOException e) {
-      LOG.error("Failed to get file text from file " + fileName, e);
+      LOG.info("Failed to get file text from file " + fileName, e);
     }
     finally {
       closeSilently(reader);
