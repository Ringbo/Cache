diff --git a/src/java/org/jivesoftware/openfire/net/SASLAuthentication.java b/src/java/org/jivesoftware/openfire/net/SASLAuthentication.java
index 374927d..e76a885 100644
--- a/src/java/org/jivesoftware/openfire/net/SASLAuthentication.java
+++ b/src/java/org/jivesoftware/openfire/net/SASLAuthentication.java
@@ -554,7 +554,7 @@
                     break;
 
                 case "SCRAM-SHA-1":
-                    if ( AuthFactory.supportsScram() )
+                    if ( !AuthFactory.supportsScram() )
                     {
                         Log.trace( "Cannot support '{}' as the AuthFactory that's in use does not support SCRAM.", mechanism );
                         it.remove();
