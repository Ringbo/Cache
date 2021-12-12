diff --git a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
index ac3ca2c..8aba0dd 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
@@ -181,10 +181,10 @@
 
     private static class Edge {
       Module myKey;
-      OrderEntry myOrderEntry; // Order entry from myKey -> the node containing the edge
+      ModuleOrderEntry myOrderEntry; // Order entry from myKey -> the node containing the edge
       boolean myRecursive; // Whether this edge should be descended into during graph walk
 
-      public Edge(Module key, OrderEntry orderEntry, boolean recursive) {
+      public Edge(Module key, ModuleOrderEntry orderEntry, boolean recursive) {
         myKey = key;
         myOrderEntry = orderEntry;
         myRecursive = recursive;
@@ -271,7 +271,7 @@
                 handlersMap.put(depModule, handlers);
               }
               boolean shouldRecurse = en.shouldRecurse(moduleOrderEntry, handlers);
-              node.myEdges.add(new Edge(module, orderEntry, shouldRecurse));
+              node.myEdges.add(new Edge(module, moduleOrderEntry, shouldRecurse));
             }
           }
         }
