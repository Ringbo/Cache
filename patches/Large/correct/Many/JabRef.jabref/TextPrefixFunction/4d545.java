diff --git a/src/main/java/net/sf/jabref/bst/TextPrefixFunction.java b/src/main/java/net/sf/jabref/bst/TextPrefixFunction.java
index b4e25cb..16940d7 100644
--- a/src/main/java/net/sf/jabref/bst/TextPrefixFunction.java
+++ b/src/main/java/net/sf/jabref/bst/TextPrefixFunction.java
@@ -59,7 +59,7 @@
             stack.push("");
             return;
         }
-        if (!(o1 instanceof String)) {
+        if (!(o2 instanceof String)) {
             vm.warn("A string is needed as second parameter to text.prefix$");
             stack.push("");
             return;
