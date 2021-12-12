diff --git a/src/com/facebook/buck/cli/BuckQueryEnvironment.java b/src/com/facebook/buck/cli/BuckQueryEnvironment.java
index d49ce89..41421e3 100644
--- a/src/com/facebook/buck/cli/BuckQueryEnvironment.java
+++ b/src/com/facebook/buck/cli/BuckQueryEnvironment.java
@@ -103,9 +103,13 @@
     try {
       targetPatternEvaluator.preloadTargetPatterns(patterns, executor);
     } catch (IOException e) {
-      throw new QueryException("Error in preloading targets. %s: %s", e.getClass(), e.getMessage());
+      throw new QueryException(
+          e,
+          "Error in preloading targets. %s: %s",
+          e.getClass(),
+          e.getMessage());
     } catch (BuildTargetException | BuildFileParseException e) {
-      throw new QueryException("Error in preloading targets. %s", e.getMessage());
+      throw new QueryException(e, "Error in preloading targets. %s", e.getMessage());
     }
   }
 
@@ -138,7 +142,7 @@
               targetPatternEvaluator.resolveTargetPatterns(ImmutableList.of(pattern), executor)
                   .values()));
     } catch (BuildTargetException | BuildFileParseException | IOException e) {
-      throw new QueryException("Error in resolving targets matching %s", pattern);
+      throw new QueryException(e, "Error in resolving targets matching %s", pattern);
     }
   }
 
@@ -151,7 +155,7 @@
           MostExecutors.newSingleThreadExecutor("buck query.getNode"));
       return parserState.getTargetNode(((QueryBuildTarget) target).getBuildTarget());
     } catch (BuildTargetException | BuildFileParseException e) {
-      throw new QueryException("Error getting target node for %s\n%s", target, e.getMessage());
+      throw new QueryException(e, "Error getting target node for %s\n%s", target, e.getMessage());
     } finally {
       if (executor != null) {
         executor.shutdown();
@@ -234,7 +238,7 @@
     try {
       graph = parserState.buildTargetGraph(targets);
     } catch (BuildFileParseException | BuildTargetException | IOException e) {
-      throw new QueryException("Error in building dependency graph");
+      throw new QueryException(e, "Error in building dependency graph");
     }
   }
 
@@ -323,7 +327,7 @@
           files);
       return getTargetsFromBuildTargetsContainer(report.owners.keySet());
     } catch (BuildFileParseException | BuildTargetException | IOException e) {
-      throw new QueryException("Could not parse build targets.\n%s", e.getMessage());
+      throw new QueryException(e, "Could not parse build targets.\n%s", e.getMessage());
     }
   }
 
