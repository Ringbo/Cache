diff --git a/smack-jingle-old/src/main/java/org/jivesoftware/smackx/jingleold/packet/Jingle.java b/smack-jingle-old/src/main/java/org/jivesoftware/smackx/jingleold/packet/Jingle.java
index 99608cd..5efbbaa 100644
--- a/smack-jingle-old/src/main/java/org/jivesoftware/smackx/jingleold/packet/Jingle.java
+++ b/smack-jingle-old/src/main/java/org/jivesoftware/smackx/jingleold/packet/Jingle.java
@@ -354,7 +354,7 @@
             buf.append(" responder=\"").append(getResponder()).append('"');
         }
         if (getAction() != null) {
-            buf.append(" action=\"").append(getAction().name()).append('"');
+            buf.append(" action=\"").append(getAction().toString()).append('"');
         }
         if (getSid() != null) {
             buf.append(" sid=\"").append(getSid()).append('"');
