diff --git a/java/org/apache/catalina/connector/CoyoteAdapter.java b/java/org/apache/catalina/connector/CoyoteAdapter.java
index 42d4af8..12d20ef 100644
--- a/java/org/apache/catalina/connector/CoyoteAdapter.java
+++ b/java/org/apache/catalina/connector/CoyoteAdapter.java
@@ -132,7 +132,7 @@
                             if (request.read()) {
                                 read = true;
                             }
-                        } catch (Exception e) {
+                        } catch (IOException e) {
                             error = true;
                         }
                         if (read) {
