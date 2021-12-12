diff --git a/demo/src/main/java/com/liulishuo/filedownloader/demo/SingleTaskTestActivity.java b/demo/src/main/java/com/liulishuo/filedownloader/demo/SingleTaskTestActivity.java
index 0d33f63..1ceb7e4 100644
--- a/demo/src/main/java/com/liulishuo/filedownloader/demo/SingleTaskTestActivity.java
+++ b/demo/src/main/java/com/liulishuo/filedownloader/demo/SingleTaskTestActivity.java
@@ -109,7 +109,7 @@
         deleteBtn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
-                new File(llsApkDir).delete();
+                new File(normalTaskFilePath).delete();
             }
         });
     }
