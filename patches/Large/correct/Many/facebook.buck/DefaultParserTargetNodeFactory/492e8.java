diff --git a/src/com/facebook/buck/parser/DefaultParserTargetNodeFactory.java b/src/com/facebook/buck/parser/DefaultParserTargetNodeFactory.java
index ab6381a..8108c65 100644
--- a/src/com/facebook/buck/parser/DefaultParserTargetNodeFactory.java
+++ b/src/com/facebook/buck/parser/DefaultParserTargetNodeFactory.java
@@ -190,7 +190,7 @@
     } catch (NoSuchBuildTargetException e) {
       throw new HumanReadableException(e);
     } catch (ParamInfoException e) {
-      throw new HumanReadableException("%s: %s", target, e.getMessage());
+      throw new HumanReadableException(e, "%s: %s", target, e.getMessage());
     } catch (IOException e) {
       throw new HumanReadableException(e.getMessage(), e);
     }
