diff --git a/zeppelin-server/src/main/java/org/apache/zeppelin/service/NotebookService.java b/zeppelin-server/src/main/java/org/apache/zeppelin/service/NotebookService.java
index 4cf3bf6..641e799 100644
--- a/zeppelin-server/src/main/java/org/apache/zeppelin/service/NotebookService.java
+++ b/zeppelin-server/src/main/java/org/apache/zeppelin/service/NotebookService.java
@@ -1174,7 +1174,7 @@
       String paragraphText = p.getText() == null ? "" : p.getText();
       paragraphText = (String) dmp.patchApply(patches, paragraphText)[0];
       p.setText(paragraphText);
-      callback.onSuccess(paragraphText, context);
+      callback.onSuccess(patchText, context);
     } catch (IOException e) {
       callback.onFailure(new IOException("Fail to patch", e), context);
     }
