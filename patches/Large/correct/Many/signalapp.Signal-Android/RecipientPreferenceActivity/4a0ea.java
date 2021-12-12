diff --git a/src/org/thoughtcrime/securesms/RecipientPreferenceActivity.java b/src/org/thoughtcrime/securesms/RecipientPreferenceActivity.java
index cb58a0e..7d82177 100644
--- a/src/org/thoughtcrime/securesms/RecipientPreferenceActivity.java
+++ b/src/org/thoughtcrime/securesms/RecipientPreferenceActivity.java
@@ -282,7 +282,7 @@
               db.setMessageVibrate(recipient, NotificationChannels.getMessageVibrate(context, recipient) ? VibrateState.ENABLED : VibrateState.DISABLED);
               return null;
             }
-          }.execute();
+          }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
         }
       } else {
         customNotificationsPref.setVisible(false);
@@ -493,7 +493,7 @@
             }
             return null;
           }
-        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, value);
+        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, value);
 
         return false;
       }
@@ -562,7 +562,7 @@
             }
             return null;
           }
-        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
+        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
 
         return false;
       }
