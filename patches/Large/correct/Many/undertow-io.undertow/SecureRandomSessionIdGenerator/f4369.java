diff --git a/core/src/main/java/io/undertow/server/session/SecureRandomSessionIdGenerator.java b/core/src/main/java/io/undertow/server/session/SecureRandomSessionIdGenerator.java
index 87a241c..4eb3eed 100644
--- a/core/src/main/java/io/undertow/server/session/SecureRandomSessionIdGenerator.java
+++ b/core/src/main/java/io/undertow/server/session/SecureRandomSessionIdGenerator.java
@@ -84,13 +84,13 @@
                 val |= (0xFF & (int) data[i + 2]);
                 quad = true;
             }
-            out[index + 3] = alphabet[(quad ? (val & 0x3F) : 64)];
+            out[index + 3] = alphabet[(quad ? (val & 0x3F) : 63)];
             val >>= 6;
-            out[index + 2] = alphabet[(trip ? (val & 0x3F) : 64)];
+            out[index + 2] = alphabet[(trip ? (val & 0x3F) : 63)];
             val >>= 6;
             out[index + 1] = alphabet[val & 0x3F];
             val >>= 6;
-            out[index + 0] = alphabet[val & 0x3F];
+            out[index] = alphabet[val & 0x3F];
         }
         return out;
     }
