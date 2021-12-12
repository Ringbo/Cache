diff --git a/java/org/apache/catalina/connector/CoyoteAdapter.java b/java/org/apache/catalina/connector/CoyoteAdapter.java
index 92e4d1b..a93823e 100644
--- a/java/org/apache/catalina/connector/CoyoteAdapter.java
+++ b/java/org/apache/catalina/connector/CoyoteAdapter.java
@@ -1046,7 +1046,7 @@
             }
             if (conv != null) {
                 try {
-                    conv.convert(bc, cc);
+                    conv.convert(bc, cc, true);
                     uri.setChars(cc.getBuffer(), cc.getStart(),
                                  cc.getLength());
                     return;
