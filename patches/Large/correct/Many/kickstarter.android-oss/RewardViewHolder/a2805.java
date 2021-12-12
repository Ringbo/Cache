diff --git a/app/src/main/java/com/kickstarter/ui/viewholders/RewardViewHolder.java b/app/src/main/java/com/kickstarter/ui/viewholders/RewardViewHolder.java
index 5a11253..76f60f8 100644
--- a/app/src/main/java/com/kickstarter/ui/viewholders/RewardViewHolder.java
+++ b/app/src/main/java/com/kickstarter/ui/viewholders/RewardViewHolder.java
@@ -168,7 +168,7 @@
       .map(hidden -> hidden ? whiteColor : lightGreenColor)
       .compose(bindToLifecycle())
       .compose(observeForUI())
-      .subscribe(rewardView::setBackgroundColor);
+      .subscribe(rewardView::setCardBackgroundColor);
 
     viewModel.outputs.shippingSummarySectionIsHidden()
       .compose(bindToLifecycle())
