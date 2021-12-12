diff --git a/QKSMS/src/main/java/com/moez/QKSMS/common/ConversationPrefsHelper.java b/QKSMS/src/main/java/com/moez/QKSMS/common/ConversationPrefsHelper.java
index 7cca1bb..a502f84 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/common/ConversationPrefsHelper.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/common/ConversationPrefsHelper.java
@@ -98,6 +98,6 @@
     }
 
     public SharedPreferences getConversationPrefs() {
-        return mPrefs;
+        return mConversationPrefs;
     }
 }
