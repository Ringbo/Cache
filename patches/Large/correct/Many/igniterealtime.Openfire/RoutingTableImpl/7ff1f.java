diff --git a/src/java/org/jivesoftware/openfire/spi/RoutingTableImpl.java b/src/java/org/jivesoftware/openfire/spi/RoutingTableImpl.java
index 9b580d0..314544a 100644
--- a/src/java/org/jivesoftware/openfire/spi/RoutingTableImpl.java
+++ b/src/java/org/jivesoftware/openfire/spi/RoutingTableImpl.java
@@ -946,7 +946,7 @@
                 lock.unlock();
             }
         }
-        localRoutingTable.removeRoute(new DomainPair("", route.getDomain()));
+        localRoutingTable.removeRoute(new DomainPair("", route.toString()));
         return clientRoute != null;
     }
 
