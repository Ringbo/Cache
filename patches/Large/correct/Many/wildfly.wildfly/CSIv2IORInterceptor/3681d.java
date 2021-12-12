diff --git a/iiop-openjdk/src/main/java/org/wildfly/iiop/openjdk/csiv2/CSIv2IORInterceptor.java b/iiop-openjdk/src/main/java/org/wildfly/iiop/openjdk/csiv2/CSIv2IORInterceptor.java
index 933102b..8028f4d 100644
--- a/iiop-openjdk/src/main/java/org/wildfly/iiop/openjdk/csiv2/CSIv2IORInterceptor.java
+++ b/iiop-openjdk/src/main/java/org/wildfly/iiop/openjdk/csiv2/CSIv2IORInterceptor.java
@@ -72,8 +72,8 @@
         String sslPortString = CorbaORBService.getORBProperty(Constants.ORB_SSL_PORT);
         int sslPort = sslPortString == null ? 0 : Integer.parseInt(sslPortString);
         try {
-            SSL ssl = new SSL((short) 0,
-                    (short) MIN_SSL_OPTIONS, /* required options  */
+            SSL ssl = new SSL((short) MIN_SSL_OPTIONS,
+                    (short) 0, /* required options  */
                     (short) sslPort);
             ORB orb = ORB.init();
             Any any = orb.create_any();
