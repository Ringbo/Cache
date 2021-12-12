diff --git a/javaparser-core/src/main/java/com/github/javaparser/ast/validator/BaseJavaValidator.java b/javaparser-core/src/main/java/com/github/javaparser/ast/validator/BaseJavaValidator.java
index b0d45b6..eb66177 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/ast/validator/BaseJavaValidator.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/ast/validator/BaseJavaValidator.java
@@ -53,7 +53,7 @@
                         if (n.isInterface()) {
                             n.getMethods().forEach(m -> {
                                 if (m.isDefault() && !m.getBody().isPresent()) {
-                                    reporter.report("\"default\" methods must have a body", n);
+                                    reporter.report("\"default\" methods must have a body", m);
                                 }
                             });
                         }
@@ -66,7 +66,7 @@
                         if (!n.isInterface()) {
                             n.getMethods().forEach(m -> {
                                 if (m.isDefault()) {
-                                    reporter.report("A class cannot have default members", n);
+                                    reporter.report("A class cannot have default members", m);
                                 }
                             });
                         }
