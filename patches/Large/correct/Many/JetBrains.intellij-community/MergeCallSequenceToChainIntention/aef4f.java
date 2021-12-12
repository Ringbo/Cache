diff --git a/plugins/IntentionPowerPak/src/com/siyeh/ipp/concatenation/MergeCallSequenceToChainIntention.java b/plugins/IntentionPowerPak/src/com/siyeh/ipp/concatenation/MergeCallSequenceToChainIntention.java
index 53ed2e4..842bf02 100644
--- a/plugins/IntentionPowerPak/src/com/siyeh/ipp/concatenation/MergeCallSequenceToChainIntention.java
+++ b/plugins/IntentionPowerPak/src/com/siyeh/ipp/concatenation/MergeCallSequenceToChainIntention.java
@@ -67,7 +67,7 @@
       }
       methodCallExpression = (PsiMethodCallExpression)grandParent;
     }
-    PsiReplacementUtil.replaceExpression(expression, newMethodCallExpression.toString(), false);
+    PsiReplacementUtil.replaceExpression(expression, newMethodCallExpression.toString());
     tracker.deleteAndRestoreComments(nextSibling);
   }
 
