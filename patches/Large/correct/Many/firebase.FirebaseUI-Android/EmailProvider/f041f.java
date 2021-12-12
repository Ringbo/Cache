diff --git a/auth/src/main/java/com/firebase/ui/auth/provider/EmailProvider.java b/auth/src/main/java/com/firebase/ui/auth/provider/EmailProvider.java
index c4d220b..0c7cbe1 100644
--- a/auth/src/main/java/com/firebase/ui/auth/provider/EmailProvider.java
+++ b/auth/src/main/java/com/firebase/ui/auth/provider/EmailProvider.java
@@ -47,7 +47,7 @@
 
     @Override
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
-        if (resultCode == ResultCodes.OK) {
+        if (requestCode == RC_EMAIL_FLOW && resultCode == ResultCodes.OK) {
             mHelper.finishActivity(mActivity, ResultCodes.OK, data);
         }
     }
