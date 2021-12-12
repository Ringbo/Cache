diff --git a/xabber/src/main/java/com/xabber/android/ui/fragment/ContactListDrawerFragment.java b/xabber/src/main/java/com/xabber/android/ui/fragment/ContactListDrawerFragment.java
index 6f315ee..be4b7d7 100644
--- a/xabber/src/main/java/com/xabber/android/ui/fragment/ContactListDrawerFragment.java
+++ b/xabber/src/main/java/com/xabber/android/ui/fragment/ContactListDrawerFragment.java
@@ -187,7 +187,7 @@
 
             String accountName = account.getFirstName() + " " + account.getLastName();
             if (accountName.trim().isEmpty())
-                accountName = getContext().getString(R.string.title_xabber_account);
+                accountName = getActivity().getString(R.string.title_xabber_account);
 
             if (XabberAccount.STATUS_NOT_CONFIRMED.equals(account.getAccountStatus())) {
                 tvAccountName.setText(accountName);
