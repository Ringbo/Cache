diff --git a/app/src/main/java/com/kickstarter/ui/viewholders/ProjectCardViewHolder.java b/app/src/main/java/com/kickstarter/ui/viewholders/ProjectCardViewHolder.java
index 20043a3..8a9118a 100644
--- a/app/src/main/java/com/kickstarter/ui/viewholders/ProjectCardViewHolder.java
+++ b/app/src/main/java/com/kickstarter/ui/viewholders/ProjectCardViewHolder.java
@@ -129,7 +129,7 @@
         percentageFundedProgressBar.setVisibility(View.GONE);
         fundingUnsuccessfulTextView.setVisibility(View.GONE);
         successfullyFundedTextView.setVisibility(View.VISIBLE);
-        fundingUnsuccessfulTextView.setText(bannerSuccessfulString);
+        successfullyFundedTextView.setText(bannerSuccessfulString);
         break;
       case Project.STATE_CANCELED:
         percentageFundedProgressBar.setVisibility(View.GONE);
