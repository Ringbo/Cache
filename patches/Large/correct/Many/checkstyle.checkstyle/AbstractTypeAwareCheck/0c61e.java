diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
index c18a455..a4ac5cf 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
@@ -268,7 +268,7 @@
                                                     getId(),
                                                     this.getClass(),
                                                     null);
-            throw new RuntimeException(msg.getMessage());
+            throw new IllegalStateException(msg.getMessage());
         }
 
         if (!suppressLoadErrors) {
