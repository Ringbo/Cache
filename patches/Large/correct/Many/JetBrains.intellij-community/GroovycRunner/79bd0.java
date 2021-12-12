diff --git a/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/GroovycRunner.java b/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/GroovycRunner.java
index a07d326..eafefcc 100644
--- a/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/GroovycRunner.java
+++ b/plugins/groovy/rt/src/org/jetbrains/groovy/compiler/rt/GroovycRunner.java
@@ -351,7 +351,7 @@
                 iterator.remove();
               }
             }
-            catch (URISyntaxException ignored) {
+            catch (Exception ignored) {
               System.out.println("Invalid URI syntax: " + url.toString());
             }
           }
