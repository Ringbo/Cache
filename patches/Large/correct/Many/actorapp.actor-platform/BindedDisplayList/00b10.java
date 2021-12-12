diff --git a/library/actor-common-base/src/main/java/im/actor/model/mvvm/BindedDisplayList.java b/library/actor-common-base/src/main/java/im/actor/model/mvvm/BindedDisplayList.java
index 5872b3e..4324d7f 100644
--- a/library/actor-common-base/src/main/java/im/actor/model/mvvm/BindedDisplayList.java
+++ b/library/actor-common-base/src/main/java/im/actor/model/mvvm/BindedDisplayList.java
@@ -378,7 +378,7 @@
                     // Generation already checked
                     isLoadMoreBackwardRequested = false;
                 } else {
-                    window.onBackwardSliceLoaded(bottomSortKey);
+                    window.onBackwardSliceLoaded(topSortKey);
                     if (linearLayoutCallback != null) linearLayoutCallback.setStackFromEnd(true);
                     editList(Modifications.addOnly(items), new Runnable() {
                         @Override
