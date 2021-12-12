diff --git a/core/java/android/net/RouteInfo.java b/core/java/android/net/RouteInfo.java
index 51ed4f7..c2b888c 100644
--- a/core/java/android/net/RouteInfo.java
+++ b/core/java/android/net/RouteInfo.java
@@ -361,7 +361,7 @@
 
         RouteInfo target = (RouteInfo) obj;
 
-        return Objects.equals(mDestination, target.getDestination()) &&
+        return Objects.equals(mDestination, target.getDestinationLinkAddress()) &&
                 Objects.equals(mGateway, target.getGateway()) &&
                 Objects.equals(mInterface, target.getInterface());
     }
