diff --git a/smack-core/src/main/java/org/jivesoftware/smack/sasl/core/SCRAMSHA1Mechanism.java b/smack-core/src/main/java/org/jivesoftware/smack/sasl/core/SCRAMSHA1Mechanism.java
index 217ace4..4d15a8f 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/sasl/core/SCRAMSHA1Mechanism.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/sasl/core/SCRAMSHA1Mechanism.java
@@ -257,7 +257,10 @@
         if (c == ',') {
             return false;
         }
-        return c >= 32 && c < 127;
+        // RFC 5802 § 7. 'printable': Contains all chars within 0x21 (33d) to 0x2b (43d) and 0x2d (45d) to 0x7e (126)
+        // aka. "Printable ASCII except ','". Since we already filter the ASCII ',' (0x2c, 44d) above, we only have to
+        // ensure that c is within [33, 126].
+        return c > 32 && c < 127;
     }
 
     /**
