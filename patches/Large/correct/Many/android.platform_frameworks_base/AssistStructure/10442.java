diff --git a/core/java/android/app/assist/AssistStructure.java b/core/java/android/app/assist/AssistStructure.java
index 9673c98..40126d6 100644
--- a/core/java/android/app/assist/AssistStructure.java
+++ b/core/java/android/app/assist/AssistStructure.java
@@ -812,7 +812,7 @@
          * Returns true if assist data has been blocked starting at this node in the hierarchy.
          */
         public boolean isAssistBlocked() {
-            return (mFlags&ViewNode.FLAGS_ASSIST_BLOCKED) == 0;
+            return (mFlags&ViewNode.FLAGS_ASSIST_BLOCKED) != 0;
         }
 
         /**
