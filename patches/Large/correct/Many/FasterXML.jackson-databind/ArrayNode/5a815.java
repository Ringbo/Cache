diff --git a/src/main/java/com/fasterxml/jackson/databind/node/ArrayNode.java b/src/main/java/com/fasterxml/jackson/databind/node/ArrayNode.java
index 2c3c7b1..fce47fc 100644
--- a/src/main/java/com/fasterxml/jackson/databind/node/ArrayNode.java
+++ b/src/main/java/com/fasterxml/jackson/databind/node/ArrayNode.java
@@ -810,7 +810,7 @@
     {
         if (o == this) return true;
         if (o == null) return false;
-        if (o.getClass() != getClass()) { // final class, can do this
+        if (o.getClass() != getClass() && !(o instanceof ArrayNode)) {
             return false;
         }
         /* This is bit convoluted, but the goal is to make it possible to
