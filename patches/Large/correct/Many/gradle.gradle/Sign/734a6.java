diff --git a/subprojects/signing/src/main/java/org/gradle/plugins/signing/Sign.java b/subprojects/signing/src/main/java/org/gradle/plugins/signing/Sign.java
index fb90840..5d97b3b 100644
--- a/subprojects/signing/src/main/java/org/gradle/plugins/signing/Sign.java
+++ b/subprojects/signing/src/main/java/org/gradle/plugins/signing/Sign.java
@@ -116,7 +116,7 @@
                 name = "_" + name.substring(1);
             }
 
-            filesWithPotentialNameCollisions.put(name, signature.getToSign());
+            filesWithPotentialNameCollisions.put(name, signature.getFile());
         }
 
         Map<String, File> files = Maps.newHashMap();
