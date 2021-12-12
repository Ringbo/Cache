diff --git a/core/java/android/net/RouteInfo.java b/core/java/android/net/RouteInfo.java
index ad8e4f7..5f5577c 100644
--- a/core/java/android/net/RouteInfo.java
+++ b/core/java/android/net/RouteInfo.java
@@ -309,7 +309,7 @@
 
         RouteInfo target = (RouteInfo) obj;
 
-        return Objects.equals(mDestination, target.getDestination()) &&
+        return Objects.equals(mDestination, target.getDestinationLinkAddress()) &&
                 Objects.equals(mGateway, target.getGateway()) &&
                 Objects.equals(mInterface, target.getInterface());
     }
