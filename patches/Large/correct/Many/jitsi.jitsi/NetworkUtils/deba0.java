diff --git a/src/net/java/sip/communicator/util/NetworkUtils.java b/src/net/java/sip/communicator/util/NetworkUtils.java
index fe481ea..90bbaac 100644
--- a/src/net/java/sip/communicator/util/NetworkUtils.java
+++ b/src/net/java/sip/communicator/util/NetworkUtils.java
@@ -720,7 +720,7 @@
                 // Second tries to define the priority with the NAPTR
                 // preference.
                 int preference
-                    = Integer.parseInt(array1[4]) - Integer.parseInt(array2[4]);
+                    = Integer.parseInt(array1[3]) - Integer.parseInt(array2[3]);
                 if(preference != 0)
                 {
                     return preference;
