diff --git a/core/java/android/print/PrinterInfo.java b/core/java/android/print/PrinterInfo.java
index 20d91b2..afef9c0 100644
--- a/core/java/android/print/PrinterInfo.java
+++ b/core/java/android/print/PrinterInfo.java
@@ -410,7 +410,7 @@
          * @see PrinterInfo#STATUS_BUSY
          * @see PrinterInfo#STATUS_UNAVAILABLE
          */
-        public @Nullable Builder setStatus(@Status int status) {
+        public @NonNull Builder setStatus(@Status int status) {
             mPrototype.mStatus = status;
             return this;
         }
