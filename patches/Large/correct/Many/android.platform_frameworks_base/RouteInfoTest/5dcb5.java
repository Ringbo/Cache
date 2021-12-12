diff --git a/core/tests/coretests/src/android/net/RouteInfoTest.java b/core/tests/coretests/src/android/net/RouteInfoTest.java
index f67c39d..c80d0bf 100644
--- a/core/tests/coretests/src/android/net/RouteInfoTest.java
+++ b/core/tests/coretests/src/android/net/RouteInfoTest.java
@@ -83,7 +83,7 @@
             }
         }
 
-        RouteInfo r;
+        PatchedRouteInfo r;
 
         r = new PatchedRouteInfo(Prefix("2001:db8:f00::ace:d00d/127"), null, "rmnet0");
         assertTrue(r.matches(Address("2001:db8:f00::ace:d00c")));
@@ -98,11 +98,11 @@
         assertFalse(r.matches(Address("192.0.0.21")));
         assertFalse(r.matches(Address("8.8.8.8")));
 
-        RouteInfo ipv6Default = new PatchedRouteInfo(Prefix("::/0"), null, "rmnet0");
+        PatchedRouteInfo ipv6Default = new PatchedRouteInfo(Prefix("::/0"), null, "rmnet0");
         assertTrue(ipv6Default.matches(Address("2001:db8::f00")));
         assertFalse(ipv6Default.matches(Address("192.0.2.1")));
 
-        RouteInfo ipv4Default = new PatchedRouteInfo(Prefix("0.0.0.0/0"), null, "rmnet0");
+        PatchedRouteInfo ipv4Default = new PatchedRouteInfo(Prefix("0.0.0.0/0"), null, "rmnet0");
         assertTrue(ipv4Default.matches(Address("255.255.255.255")));
         assertTrue(ipv4Default.matches(Address("192.0.2.1")));
         assertFalse(ipv4Default.matches(Address("2001:db8::f00")));
