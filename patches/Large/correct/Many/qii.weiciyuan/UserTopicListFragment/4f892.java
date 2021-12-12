diff --git a/src/org/qii/weiciyuan/ui/topic/UserTopicListFragment.java b/src/org/qii/weiciyuan/ui/topic/UserTopicListFragment.java
index 50b218e..8fb7b16 100644
--- a/src/org/qii/weiciyuan/ui/topic/UserTopicListFragment.java
+++ b/src/org/qii/weiciyuan/ui/topic/UserTopicListFragment.java
@@ -86,7 +86,7 @@
                 startActivity(intent);
             }
         });
-        if (result == null) {
+        if (result == null || result.size() == 0) {
             task = new TopicListTask();
             task.executeOnExecutor(MyAsyncTask.THREAD_POOL_EXECUTOR);
         }
