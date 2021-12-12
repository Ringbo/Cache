diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index e1e9556..1388f06 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -91,7 +91,7 @@
       @Override public boolean onExceptionalCompletion(Throwable ex, CountedCompleter cc){
         if(!_gotException.getAndSet(true)) {
           Job thisJob = DKV.getGet(_key);
-          if (thisJob._state == JobState.CANCELLED) {
+          if (thisJob._state != JobState.CANCELLED) {
              failed(ex);
           }
           _parms.read_unlock_frames(GLM.this);
