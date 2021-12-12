diff --git a/core/java/android/app/Notification.java b/core/java/android/app/Notification.java
index 7a5c0e9..7b7cb37 100644
--- a/core/java/android/app/Notification.java
+++ b/core/java/android/app/Notification.java
@@ -752,7 +752,7 @@
         }
 
         public Builder setAutoCancel(boolean autoCancel) {
-            setFlag(FLAG_ONLY_ALERT_ONCE, autoCancel);
+            setFlag(FLAG_AUTO_CANCEL, autoCancel);
             return this;
         }
 
