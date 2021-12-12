diff --git a/JSONPointer.java b/JSONPointer.java
index 563047b..82de7f9 100644
--- a/JSONPointer.java
+++ b/JSONPointer.java
@@ -138,7 +138,7 @@
         if (pointer == null) {
             throw new NullPointerException("pointer cannot be null");
         }
-        if (pointer.isEmpty()) {
+        if (pointer.isEmpty() || pointer.equals("#")) {
             refTokens = Collections.emptyList();
             return;
         }
