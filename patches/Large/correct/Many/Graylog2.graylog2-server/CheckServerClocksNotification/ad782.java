diff --git a/app/lib/notifications/CheckServerClocksNotification.java b/app/lib/notifications/CheckServerClocksNotification.java
index 23674fe..92a5593 100644
--- a/app/lib/notifications/CheckServerClocksNotification.java
+++ b/app/lib/notifications/CheckServerClocksNotification.java
@@ -43,6 +43,6 @@
 
     @Override
     public boolean isCloseable() {
-        return false;
+        return true;
     }
 }
