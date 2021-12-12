diff --git a/app/src/main/java/com/kickstarter/libs/ApiPaginator.java b/app/src/main/java/com/kickstarter/libs/ApiPaginator.java
index 5882de6..b42bfd9 100644
--- a/app/src/main/java/com/kickstarter/libs/ApiPaginator.java
+++ b/app/src/main/java/com/kickstarter/libs/ApiPaginator.java
@@ -234,7 +234,7 @@
       .map(envelopeToListOfData)
       .map(pageTransformation)
       .doOnSubscribe(() -> _isFetching.onNext(true))
-      .finallyDo(() -> _isFetching.onNext(false));
+      .doAfterTerminate(() -> _isFetching.onNext(false));
   }
 
   private void keepMorePath(final @NonNull Envelope envelope) {
