diff --git a/src/test/java/com/fasterxml/jackson/databind/node/TestJsonNode.java b/src/test/java/com/fasterxml/jackson/databind/node/TestJsonNode.java
index 6b7fe16..94aa4af 100644
--- a/src/test/java/com/fasterxml/jackson/databind/node/TestJsonNode.java
+++ b/src/test/java/com/fasterxml/jackson/databind/node/TestJsonNode.java
@@ -149,7 +149,7 @@
                     double d1 = ((NumericNode) o1).asDouble();
                     double d2 = ((NumericNode) o2).asDouble();
                     if (d1 == d2) { // strictly equals because it's integral value
-                        return 1;
+                        return 0;
                     }
                 }
                 return 0;
