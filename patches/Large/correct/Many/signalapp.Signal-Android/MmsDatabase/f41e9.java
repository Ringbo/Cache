diff --git a/src/org/thoughtcrime/securesms/database/MmsDatabase.java b/src/org/thoughtcrime/securesms/database/MmsDatabase.java
index 90889b2..248ae23 100644
--- a/src/org/thoughtcrime/securesms/database/MmsDatabase.java
+++ b/src/org/thoughtcrime/securesms/database/MmsDatabase.java
@@ -280,7 +280,7 @@
       PhoneNumberUtil.MatchType match;
 
       if (localNumber == null) match = PhoneNumberUtil.MatchType.NO_MATCH;
-      else                     match = PhoneNumberUtil.getInstance().isNumberMatch(localNumber, cc.toPhoneString());
+      else                     match = PhoneNumberUtil.getInstance().isNumberMatch(localNumber, cc.serialize());
 
       if (match == PhoneNumberUtil.MatchType.NO_MATCH ||
           match == PhoneNumberUtil.MatchType.NOT_A_NUMBER)
@@ -295,7 +295,7 @@
         PhoneNumberUtil.MatchType match;
 
         if (localNumber == null) match = PhoneNumberUtil.MatchType.NO_MATCH;
-        else                     match = PhoneNumberUtil.getInstance().isNumberMatch(localNumber, to.toPhoneString());
+        else                     match = PhoneNumberUtil.getInstance().isNumberMatch(localNumber, to.serialize());
 
         if (match == PhoneNumberUtil.MatchType.NO_MATCH ||
             match == PhoneNumberUtil.MatchType.NOT_A_NUMBER)
