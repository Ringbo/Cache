diff --git a/k9mail/src/main/java/com/fsck/k9/fragment/MessageListFragment.java b/k9mail/src/main/java/com/fsck/k9/fragment/MessageListFragment.java
index e004843..20bc304 100644
--- a/k9mail/src/main/java/com/fsck/k9/fragment/MessageListFragment.java
+++ b/k9mail/src/main/java/com/fsck/k9/fragment/MessageListFragment.java
@@ -1343,7 +1343,8 @@
                 handler.updateFooter(context.getResources().getQuantityString(R.plurals.remote_search_downloading_limited,
                         maxResults, maxResults, numResults));
             } else {
-                handler.updateFooter(context.getResources().getQuantityString(R.plurals.remote_search_downloading, numResults));
+                handler.updateFooter(context.getResources().getQuantityString(R.plurals.remote_search_downloading,
+                        numResults, numResults));
             }
             fragmentListener.setMessageListProgress(Window.PROGRESS_START);
         }
