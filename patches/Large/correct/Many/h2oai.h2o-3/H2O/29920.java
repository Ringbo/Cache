diff --git a/h2o-core/src/main/java/water/H2O.java b/h2o-core/src/main/java/water/H2O.java
index f8cf4b9..b1a10bc 100644
--- a/h2o-core/src/main/java/water/H2O.java
+++ b/h2o-core/src/main/java/water/H2O.java
@@ -1007,7 +1007,7 @@
       } catch( Throwable ex ) {
         // If the higher priority job popped an exception, complete it
         // exceptionally...  but then carry on and do the lower priority job.
-        if( h2o != null ) h2o.onExceptionalCompletion(ex, h2o.getCompleter());
+        if( h2o != null ) h2o.completeExceptionally(ex);
         else ex.printStackTrace();
       } finally {
         t._priority = pp;
