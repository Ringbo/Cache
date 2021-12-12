diff --git a/src/com/facebook/buck/parser/Parser.java b/src/com/facebook/buck/parser/Parser.java
index 200b61a..8f9b45a 100644
--- a/src/com/facebook/buck/parser/Parser.java
+++ b/src/com/facebook/buck/parser/Parser.java
@@ -471,9 +471,10 @@
               } catch (HumanReadableException | BuildTargetException | BuildFileParseException e) {
                 throw new HumanReadableException(
                     e,
-                    "Couldn't get dependency %s of target %s.",
+                    "Couldn't get dependency '%s' of target '%s':\n%s",
                     buildTargetForDep,
-                    buildTarget);
+                    buildTarget,
+                    e.getHumanReadableErrorMessage());
               }
             }
 
