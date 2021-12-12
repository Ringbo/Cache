diff --git a/java/java-impl/src/com/intellij/codeInsight/intention/impl/BreakStringOnLineBreaksIntentionAction.java b/java/java-impl/src/com/intellij/codeInsight/intention/impl/BreakStringOnLineBreaksIntentionAction.java
index 8f7316f..ea3398e 100644
--- a/java/java-impl/src/com/intellij/codeInsight/intention/impl/BreakStringOnLineBreaksIntentionAction.java
+++ b/java/java-impl/src/com/intellij/codeInsight/intention/impl/BreakStringOnLineBreaksIntentionAction.java
@@ -53,7 +53,7 @@
       return false;
     }
 
-    if (indexOfSlashN != -1 && Comparing.equal(text.substring(indexOfSlashNSlashR, text.length()), "\\n\\r\"")){
+    if (indexOfSlashNSlashR != -1 && Comparing.equal(text.substring(indexOfSlashNSlashR, text.length()), "\\n\\r\"")){
       return false;
     }
 
