diff --git a/DHNSGraph/src/org/gephi/graph/dhns/core/StructureModifier.java b/DHNSGraph/src/org/gephi/graph/dhns/core/StructureModifier.java
index a91b507..76cf514 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/core/StructureModifier.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/core/StructureModifier.java
@@ -72,7 +72,7 @@
             expand(view, absNode);
         //sightManager.updateSight((SightImpl) sight);
         }
-        graphVersion.incNodeVersion();
+        graphVersion.incNodeAndEdgeVersion();
         dhns.getWriteLock().unlock();
         dhns.getEventManager().fireEvent(EventType.NODES_AND_EDGES_UPDATED);
     }
@@ -94,7 +94,7 @@
             retract(view, ((AbstractNode) node));
         //sightManager.updateSight((SightImpl)sight);
         }
-        graphVersion.incNodeVersion();
+        graphVersion.incNodeAndEdgeVersion();
         dhns.getWriteLock().unlock();
         dhns.getEventManager().fireEvent(EventType.NODES_AND_EDGES_UPDATED);
     }
