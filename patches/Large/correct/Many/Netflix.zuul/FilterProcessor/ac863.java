diff --git a/zuul-core/src/main/java/com/netflix/zuul/FilterProcessor.java b/zuul-core/src/main/java/com/netflix/zuul/FilterProcessor.java
index 8112cd8..f861158 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/FilterProcessor.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/FilterProcessor.java
@@ -190,10 +190,10 @@
                     t = result.getException();
                     ctx.addFilterExecutionSummary(filterName, ExecutionStatus.FAILED.name(), execTime);
                     
-                    DynamicCounter.increment(filterName, "fail",filter.filterType());
+                    DynamicCounter.increment(filterName, "status","fail", "type",filter.filterType());
                     break;
                 case SUCCESS:
-                	DynamicCounter.increment(filterName,"success", filter.filterType());
+                	DynamicCounter.increment(filterName, "status","success", "type", filter.filterType());
                     o = result.getResult();
                     ctx.addFilterExecutionSummary(filterName, ExecutionStatus.SUCCESS.name(), execTime);
                     if (bDebug) {
@@ -202,7 +202,7 @@
                     }
                     break;
                 default:
-                	DynamicCounter.increment(filterName, "unknown", filter.filterType());
+                	DynamicCounter.increment(filterName, "status", "unknown", "type", filter.filterType());
                     break;
             }
             
@@ -212,7 +212,7 @@
             if (bDebug) {
                 Debug.addRoutingDebug("Running Filter failed " + filterName + " type:" + filter.filterType() + " order:" + filter.filterOrder() + " " + e.getMessage());
             }
-            DynamicCounter.increment(filterName, "fail", filter.filterType());
+            DynamicCounter.increment(filterName, "status", "fail", "type", filter.filterType());
             if (e instanceof ZuulException) {
                 throw (ZuulException) e;
             } else {
