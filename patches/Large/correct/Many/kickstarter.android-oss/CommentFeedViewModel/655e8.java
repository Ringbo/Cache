diff --git a/app/src/main/java/com/kickstarter/viewmodels/CommentFeedViewModel.java b/app/src/main/java/com/kickstarter/viewmodels/CommentFeedViewModel.java
index 7c21fd8..5dcbe83 100644
--- a/app/src/main/java/com/kickstarter/viewmodels/CommentFeedViewModel.java
+++ b/app/src/main/java/com/kickstarter/viewmodels/CommentFeedViewModel.java
@@ -262,6 +262,6 @@
       .compose(Transformers.pipeApiErrorsTo(postCommentError))
       .compose(Transformers.neverError())
       .doOnSubscribe(() -> commentIsPosting.onNext(true))
-      .finallyDo(() -> commentIsPosting.onNext(false));
+      .doAfterTerminate(() -> commentIsPosting.onNext(false));
   }
 }
