diff --git a/src/org/thoughtcrime/securesms/recipients/Recipient.java b/src/org/thoughtcrime/securesms/recipients/Recipient.java
index 602b5b9..4eeeb7a 100644
--- a/src/org/thoughtcrime/securesms/recipients/Recipient.java
+++ b/src/org/thoughtcrime/securesms/recipients/Recipient.java
@@ -426,7 +426,7 @@
     if      (isResolving())            return new TransparentContactPhoto();
     else if (isGroupRecipient())       return new ResourceContactPhoto(R.drawable.ic_group_white_24dp, R.drawable.ic_group_large);
     else if (!TextUtils.isEmpty(name)) return new GeneratedContactPhoto(name, R.drawable.ic_profile_default);
-    else                               return new ResourceContactPhoto(R.drawable.ic_profile_default);
+    else                               return new ResourceContactPhoto(R.drawable.ic_profile_default, R.drawable.ic_person_large);
   }
 
   public synchronized @Nullable ContactPhoto getContactPhoto() {
