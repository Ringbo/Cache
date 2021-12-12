diff --git a/smack-core/src/main/java/org/jivesoftware/smack/filter/FromMatchesFilter.java b/smack-core/src/main/java/org/jivesoftware/smack/filter/FromMatchesFilter.java
index 2e1354b..83eb264 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/filter/FromMatchesFilter.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/filter/FromMatchesFilter.java
@@ -72,7 +72,7 @@
      *        have a from address.
      */
     public static FromMatchesFilter createBare(String address) {
-        address = (address == null) ? null : XmppStringUtils.parseBareAddress(address);
+        address = (address == null) ? null : XmppStringUtils.parseBareJid(address);
         return new FromMatchesFilter(address, true);
     }
 
@@ -96,7 +96,7 @@
         // Simplest form of NAMEPREP/STRINGPREP
         from = from.toLowerCase(Locale.US);
         if (matchBareJID) {
-            from = XmppStringUtils.parseBareAddress(from);
+            from = XmppStringUtils.parseBareJid(from);
         }
         return from.equals(address);
     }
