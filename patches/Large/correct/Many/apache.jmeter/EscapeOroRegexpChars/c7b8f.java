diff --git a/src/functions/org/apache/jmeter/functions/EscapeOroRegexpChars.java b/src/functions/org/apache/jmeter/functions/EscapeOroRegexpChars.java
index c6793b5..dae8b0e 100644
--- a/src/functions/org/apache/jmeter/functions/EscapeOroRegexpChars.java
+++ b/src/functions/org/apache/jmeter/functions/EscapeOroRegexpChars.java
@@ -94,7 +94,7 @@
 
     /** {@inheritDoc} */
     @Override
-    public synchronized void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
+    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
         checkParameterCount(parameters, MIN_PARAM_COUNT, MAX_PARAM_COUNT);
         values = parameters.toArray(new CompoundVariable[parameters.size()]);
     }
