diff --git a/app/src/main/java/com/arialyy/simple/multi_task/DownloadActivity.java b/app/src/main/java/com/arialyy/simple/multi_task/DownloadActivity.java
index a8ccc44..61d4836 100644
--- a/app/src/main/java/com/arialyy/simple/multi_task/DownloadActivity.java
+++ b/app/src/main/java/com/arialyy/simple/multi_task/DownloadActivity.java
@@ -25,7 +25,7 @@
 
   @Override protected void init(Bundle savedInstanceState) {
     super.init(savedInstanceState);
-    mAdapter = new DownloadAdapter(this, Aria.download(this).getDownloadList());
+    mAdapter = new DownloadAdapter(this, Aria.download(this).getTaskList());
     mList.setLayoutManager(new LinearLayoutManager(this));
     mList.setAdapter(mAdapter);
   }
