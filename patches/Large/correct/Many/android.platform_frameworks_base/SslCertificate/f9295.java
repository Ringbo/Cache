diff --git a/core/java/android/net/http/SslCertificate.java b/core/java/android/net/http/SslCertificate.java
index 2715af0..4c0f418 100644
--- a/core/java/android/net/http/SslCertificate.java
+++ b/core/java/android/net/http/SslCertificate.java
@@ -506,6 +506,6 @@
         if (certificateDate == null) {
             return "";
         }
-        return DateFormat.getDateFormat(context).format(certificateDate);
+        return DateFormat.getMediumDateFormat(context).format(certificateDate);
     }
 }
