diff --git a/src/main/java/org/acra/util/ToastSender.java b/src/main/java/org/acra/util/ToastSender.java
index a8c952a..76295f2 100644
--- a/src/main/java/org/acra/util/ToastSender.java
+++ b/src/main/java/org/acra/util/ToastSender.java
@@ -26,7 +26,7 @@
         try {
             Toast.makeText(context, toastResourceId, toastLength).show();
         } catch (RuntimeException e) {
-            ACRA.log.e(LOG_TAG, "Could not send crash Toast", e);
+            ACRA.log.w(LOG_TAG, "Could not send crash Toast", e);
         }
     }
 }
