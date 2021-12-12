diff --git a/source/org/jivesoftware/smack/sasl/SASLMechanism.java b/source/org/jivesoftware/smack/sasl/SASLMechanism.java
index 7c12f92..42b2670 100644
--- a/source/org/jivesoftware/smack/sasl/SASLMechanism.java
+++ b/source/org/jivesoftware/smack/sasl/SASLMechanism.java
@@ -238,7 +238,7 @@
         public String toXML() {
             StringBuilder stanza = new StringBuilder();
             stanza.append("<response xmlns=\"urn:ietf:params:xml:ns:xmpp-sasl\">");
-            if (authenticationText == null) {
+            if (authenticationText != null) {
                 stanza.append(authenticationText);
             }
             else {
