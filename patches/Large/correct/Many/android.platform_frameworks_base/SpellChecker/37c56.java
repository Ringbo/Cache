diff --git a/core/java/android/widget/SpellChecker.java b/core/java/android/widget/SpellChecker.java
index a106159..a9aec82 100644
--- a/core/java/android/widget/SpellChecker.java
+++ b/core/java/android/widget/SpellChecker.java
@@ -102,7 +102,8 @@
 
         mTextServicesManager = (TextServicesManager) mTextView.getContext().
                 getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE);
-        if (!mTextServicesManager.isSpellCheckerEnabled()) {
+        if (!mTextServicesManager.isSpellCheckerEnabled()
+                ||  mTextServicesManager.getCurrentSpellCheckerSubtype(true) == null) {
             mSpellCheckerSession = null;
         } else {
             mSpellCheckerSession = mTextServicesManager.newSpellCheckerSession(
