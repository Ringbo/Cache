diff --git a/platform/testFramework/src/com/intellij/testFramework/propertyBased/IntentionPolicy.java b/platform/testFramework/src/com/intellij/testFramework/propertyBased/IntentionPolicy.java
index 1e703eb..125351dd0 100644
--- a/platform/testFramework/src/com/intellij/testFramework/propertyBased/IntentionPolicy.java
+++ b/platform/testFramework/src/com/intellij/testFramework/propertyBased/IntentionPolicy.java
@@ -59,7 +59,7 @@
     else {
       familyName = original.getFamilyName();
     }
-    return shouldSkipByFamilyName(familyName);
+    return !shouldSkipByFamilyName(familyName);
   }
 
   protected boolean shouldSkipIntention(@NotNull String actionText) {
