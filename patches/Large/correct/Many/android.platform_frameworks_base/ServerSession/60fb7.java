diff --git a/obex/javax/obex/ServerSession.java b/obex/javax/obex/ServerSession.java
index 675272d..aca90bb 100644
--- a/obex/javax/obex/ServerSession.java
+++ b/obex/javax/obex/ServerSession.java
@@ -283,10 +283,10 @@
 
                 ObexHelper.updateHeaderSet(request, headers);
 
-                if (request.mConnectionID != null) {
+                if (mListener.getConnectionId() != -1 && request.mConnectionID != null) {
                     mListener.setConnectionId(ObexHelper.convertToLong(request.mConnectionID));
                 } else {
-                    mListener.setConnectionId(-1);
+                    mListener.setConnectionId(1);
                 }
                 // the Auth chan is initiated by the server, client sent back the authResp .
                 if (request.mAuthResp != null) {
@@ -405,7 +405,7 @@
                 ObexHelper.updateHeaderSet(request, headers);
             }
 
-            if (request.mConnectionID != null) {
+            if (mListener.getConnectionId() != -1 && request.mConnectionID != null) {
                 mListener.setConnectionId(ObexHelper.convertToLong(request.mConnectionID));
             } else {
                 mListener.setConnectionId(1);
@@ -527,7 +527,7 @@
                 ObexHelper.updateHeaderSet(request, headers);
             }
 
-            if (request.mConnectionID != null) {
+            if (mListener.getConnectionId() != -1 && request.mConnectionID != null) {
                 mListener.setConnectionId(ObexHelper.convertToLong(request.mConnectionID));
             } else {
                 mListener.setConnectionId(1);
