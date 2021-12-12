diff --git a/java/org/apache/juli/OneLineFormatter.java b/java/org/apache/juli/OneLineFormatter.java
index cbbaac5..f7e32c4 100644
--- a/java/org/apache/juli/OneLineFormatter.java
+++ b/java/org/apache/juli/OneLineFormatter.java
@@ -119,7 +119,7 @@
         int index;
         try {
             index = Integer.parseInt(month) - 1;
-        } catch (Throwable t) {
+        } catch (Exception e) {
             index = 0;  // Can not happen, in theory
         }
         return (months[index]);
