diff --git a/core/src/main/java/org/bitcoinj/script/Script.java b/core/src/main/java/org/bitcoinj/script/Script.java
index 59d7fdd..0cce44a 100644
--- a/core/src/main/java/org/bitcoinj/script/Script.java
+++ b/core/src/main/java/org/bitcoinj/script/Script.java
@@ -717,7 +717,7 @@
             }
             // First chunk must be an OP_N opcode too.
             if (decodeFromOpN(chunks.get(0).opcode) < 1) return false;
-        } catch (IllegalStateException e) {
+        } catch (IllegalArgumentException e) { // thrown by decodeFromOpN()
             return false;   // Not an OP_N opcode.
         }
         return true;
