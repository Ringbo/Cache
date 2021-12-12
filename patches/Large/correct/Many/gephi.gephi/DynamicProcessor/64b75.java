diff --git a/ProcessorPlugin/src/org/gephi/io/processor/plugin/DynamicProcessor.java b/ProcessorPlugin/src/org/gephi/io/processor/plugin/DynamicProcessor.java
index 850887c..54fceca 100644
--- a/ProcessorPlugin/src/org/gephi/io/processor/plugin/DynamicProcessor.java
+++ b/ProcessorPlugin/src/org/gephi/io/processor/plugin/DynamicProcessor.java
@@ -231,7 +231,7 @@
 
             Double[] toAdd = new Double[]{toRemove[0], excludingPoint};
 
-            return new TimeInterval(source, toAdd[0], toAdd[1], toRemove[0], toRemove[0]);
+            return new TimeInterval(source, toAdd[0], toAdd[1], toRemove[0], toRemove[1]);
         }
         return source;
 
