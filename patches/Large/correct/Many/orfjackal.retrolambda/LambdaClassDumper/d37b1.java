diff --git a/retrolambda/src/main/java/net/orfjackal/retrolambda/LambdaClassDumper.java b/retrolambda/src/main/java/net/orfjackal/retrolambda/LambdaClassDumper.java
index 4e1bd32..ad809e3 100644
--- a/retrolambda/src/main/java/net/orfjackal/retrolambda/LambdaClassDumper.java
+++ b/retrolambda/src/main/java/net/orfjackal/retrolambda/LambdaClassDumper.java
@@ -35,7 +35,8 @@
             Path p = new VirtualPath("");
             dumperField.set(null, newProxyClassesDumper(p));
         } catch (Exception e) {
-            throw new RuntimeException("Cannot initialize dumper", e);
+            throw new IllegalStateException("Cannot initialize dumper; unexpected JDK implementation. " +
+                    "Please run Retrolambda using the Java agent (enable forking in the Maven plugin).", e);
         }
     }
 
