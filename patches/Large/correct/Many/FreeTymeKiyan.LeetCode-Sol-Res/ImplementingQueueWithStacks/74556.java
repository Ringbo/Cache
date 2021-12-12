diff --git a/Easy/ImplementingQueueWithStacks.java b/Easy/ImplementingQueueWithStacks.java
index 0f6b012..1fcea47 100644
--- a/Easy/ImplementingQueueWithStacks.java
+++ b/Easy/ImplementingQueueWithStacks.java
@@ -47,7 +47,7 @@
 
         // Get the front element.
         public int peek() {
-            if (!output.isEmpty()) {
+            if (output.isEmpty()) {
                 while (!input.isEmpty())
                     output.push(input.pop());
             }
