diff --git a/obex/javax/obex/ServerOperation.java b/obex/javax/obex/ServerOperation.java
index 8710c64..504fe35 100644
--- a/obex/javax/obex/ServerOperation.java
+++ b/obex/javax/obex/ServerOperation.java
@@ -169,10 +169,10 @@
                 mHasBody = true;
             }
 
-            if (requestHeader.mConnectionID != null) {
+            if (mListener.getConnectionId() != -1 && requestHeader.mConnectionID != null) {
                 mListener.setConnectionId(ObexHelper.convertToLong(requestHeader.mConnectionID));
             } else {
-                mListener.setConnectionId(0);
+                mListener.setConnectionId(1);
             }
 
             if (requestHeader.mAuthResp != null) {
@@ -438,7 +438,7 @@
                     if (body != null) {
                         mHasBody = true;
                     }
-                    if (requestHeader.mConnectionID != null) {
+                    if (mListener.getConnectionId() != -1 && requestHeader.mConnectionID != null) {
                         mListener.setConnectionId(ObexHelper
                                 .convertToLong(requestHeader.mConnectionID));
                     } else {
