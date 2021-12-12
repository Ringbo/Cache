diff --git a/k9mail/src/main/java/com/fsck/k9/activity/compose/RecipientPresenter.java b/k9mail/src/main/java/com/fsck/k9/activity/compose/RecipientPresenter.java
index 20d2539..ec326a1 100644
--- a/k9mail/src/main/java/com/fsck/k9/activity/compose/RecipientPresenter.java
+++ b/k9mail/src/main/java/com/fsck/k9/activity/compose/RecipientPresenter.java
@@ -241,7 +241,7 @@
             boolean alreadyVisible = recipientMvpView.isBccVisible();
             boolean singleBccRecipientFromAccount =
                     bccRecipients.length == 1 && bccRecipients[0].toString().equals(bccAddress);
-            recipientMvpView.setBccVisibility(alreadyVisible || singleBccRecipientFromAccount);
+            recipientMvpView.setBccVisibility(alreadyVisible || !singleBccRecipientFromAccount);
             updateRecipientExpanderVisibility();
         }
     }
