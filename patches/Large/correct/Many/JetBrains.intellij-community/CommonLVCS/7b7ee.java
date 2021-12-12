diff --git a/source/com/intellij/localVcs/common/CommonLVCS.java b/source/com/intellij/localVcs/common/CommonLVCS.java
index 2738c17..21017fb 100644
--- a/source/com/intellij/localVcs/common/CommonLVCS.java
+++ b/source/com/intellij/localVcs/common/CommonLVCS.java
@@ -494,7 +494,7 @@
       progress.pushState();
       progress.setText(LocalVcsBundle.message("progress.text.clearing.local.history"));
     }
-    myImplementation.clearAndRecreate();
+    myImplementation.clearAndRecreate(myVcsLocation);
     if (progress != null) {
       progress.popState();
     }
@@ -738,7 +738,7 @@
   }
 
   public void clear() {
-    myImplementation.clear();
+    myImplementation.clear(myVcsLocation);
     FileUtil.delete(myVcsLocation);
   }
 
