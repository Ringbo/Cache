diff --git a/core/java/android/net/RouteInfo.java b/core/java/android/net/RouteInfo.java
index af27e1d..8b42bcd 100644
--- a/core/java/android/net/RouteInfo.java
+++ b/core/java/android/net/RouteInfo.java
@@ -361,7 +361,7 @@
 
         RouteInfo target = (RouteInfo) obj;
 
-        return Objects.equals(mDestination, target.getDestination()) &&
+        return Objects.equals(mDestination, target.getDestinationLinkAddress()) &&
                 Objects.equals(mGateway, target.getGateway()) &&
                 Objects.equals(mInterface, target.getInterface());
     }
