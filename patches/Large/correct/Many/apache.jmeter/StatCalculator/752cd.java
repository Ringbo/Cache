diff --git a/src/jorphan/org/apache/jorphan/math/StatCalculator.java b/src/jorphan/org/apache/jorphan/math/StatCalculator.java
index 048502c..0d7b66b 100644
--- a/src/jorphan/org/apache/jorphan/math/StatCalculator.java
+++ b/src/jorphan/org/apache/jorphan/math/StatCalculator.java
@@ -95,7 +95,7 @@
 
     public void addAll(StatCalculator<T> calc) {
         for(Entry<T, MutableLong> ent : calc.valuesMap.entrySet()) {
-            addValue(ent.getKey(), ent.getValue().intValue());
+            addValue(ent.getKey(), ent.getValue().longValue());
         }
     }
 
@@ -197,7 +197,7 @@
 
     protected abstract T divide(T val, int n);
 
-    public void addValue(T val, int sampleCount) {
+    public void addValue(T val, long sampleCount) {
         count += sampleCount;
         double currentVal = val.doubleValue();
         sum += currentVal * sampleCount; 
@@ -215,10 +215,10 @@
     }
 
     public void addValue(T val) {
-        addValue(val,1);
+        addValue(val, 1L);
     }
 
-    private void updateValueCount(T actualValue, int sampleCount) {
+    private void updateValueCount(T actualValue, long sampleCount) {
         MutableLong count = valuesMap.get(actualValue);
         if (count != null) {
             count.add(sampleCount);
