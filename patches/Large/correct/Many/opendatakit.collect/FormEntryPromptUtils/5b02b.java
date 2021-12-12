diff --git a/collect_app/src/main/java/org/odk/collect/android/utilities/FormEntryPromptUtils.java b/collect_app/src/main/java/org/odk/collect/android/utilities/FormEntryPromptUtils.java
index 80a24df..6bcebfa 100644
--- a/collect_app/src/main/java/org/odk/collect/android/utilities/FormEntryPromptUtils.java
+++ b/collect_app/src/main/java/org/odk/collect/android/utilities/FormEntryPromptUtils.java
@@ -125,8 +125,8 @@
         return questionText;
     }
 
-    public static String getItemText(FormEntryPrompt formEntryPrompt, SelectChoice selectChoice) {
+    public static CharSequence getItemText(FormEntryPrompt formEntryPrompt, SelectChoice selectChoice) {
         String choiceName = formEntryPrompt.getSelectChoiceText(selectChoice);
-        return choiceName != null ? TextUtils.textToHtml(choiceName).toString() : "";
+        return choiceName != null ? TextUtils.textToHtml(choiceName) : "";
     }
 }
