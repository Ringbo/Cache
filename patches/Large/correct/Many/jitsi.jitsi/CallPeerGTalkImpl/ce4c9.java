diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
index f000de5..c630ba9 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
@@ -665,19 +665,21 @@
 
     /**
      * Returns whether or not the <tt>CallPeer</tt> is an Android phone or
-     * a call pass throught Google Voice.
+     * a call pass throught Google Voice or uses Google Talk client.
      *
      * We base the detection of the JID's resource which in the case of Android
-     * is androidXXXXXXX (where XXXXXX is a suite of numbers/letters).
+     * is android/Vtok/Talk.vXXXXXXX (where XXXXXX is a suite of
+     * numbers/letters).
      */
-    private static boolean isAndroid(String fullJID)
+    private static boolean isAndroidOrVtokOrTalkClient(String fullJID)
     {
         int idx = fullJID.indexOf('/');
 
         if(idx != -1)
         {
             String res = fullJID.substring(idx + 1);
-            if(res.startsWith("android") || res.startsWith("Vtok"))
+            if(res.startsWith("android") || res.startsWith("Vtok") ||
+                res.startsWith("Talk.v"))
             {
                 return true;
             }
@@ -715,10 +717,10 @@
 
         for (GTalkCandidatePacketExtension candidate : candidates)
         {
-            // Android phone does not seems to like IPv6 candidates since it
-            // reject the IQ candidates with an error
-            // so do not send IPv6 candidates to Android phone
-            if(isAndroid(getAddress()) &&
+            // Android phone and Google Talk client does not seems to like IPv6
+            // candidates since it reject the IQ candidates with an error
+            // so do not send IPv6 candidates to Android phone or Talk client
+            if(isAndroidOrVtokOrTalkClient(getAddress()) &&
                 NetworkUtils.isIPv6Address(candidate.getAddress()))
                 continue;
 
